package com.pmh.org.todo;

import com.pmh.org.kakao.jpa.KakaoEntity;
import com.pmh.org.kakao.jpa.KakaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
@CrossOrigin
public class TodoController {

    private final TodoRepository todoRepository;
    private final KakaoRepository kakaoRepository;

    @PostMapping("save")
    public ResponseEntity<TodoEntity> saveTodo(@RequestBody TodoEntity todo,
                                              @AuthenticationPrincipal UserDetails userDetails
    ) {
//        UserDetails userDetails1 = (UserDetails)
//                SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(userDetails == null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        // FK 설정
        KakaoEntity kakaoEntity = kakaoRepository.findByEmail(userDetails.getUsername());
        todo.setKakaoEntity(kakaoEntity);

        // 저장...
        return ResponseEntity.ok(todoRepository.save(todo));
    }


    @GetMapping("findall")
    public ResponseEntity<List<TodoEntity>> findAllTodos(
            @AuthenticationPrincipal UserDetails userDetails
    ) {
        // crul todo/findall
        // parameters jwt 넣어주셔야 합니다..

        // 인증되지 않은 사용자가 todo 를 요청한 경우
        if(userDetails == null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        String role = userDetails.getAuthorities()
                .stream()
                .map(
                    authority -> authority.getAuthority()
                ).toString();

        KakaoEntity kakaoEntity = kakaoRepository.findByEmail(userDetails.getUsername());
        List<TodoEntity> list = todoRepository.findAllByKakaoEntity(kakaoEntity);
        return ResponseEntity.ok(list);
    }

}
