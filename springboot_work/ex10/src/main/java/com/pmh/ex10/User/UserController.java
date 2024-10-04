package com.pmh.ex10.User;


import com.pmh.ex10.FreeBoard.FreeBoardRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;
    private final FreeBoardRepository freeBoardRepository;
    private final UserServiceImpl userService;

    @GetMapping("select")
    public ResponseEntity<List<User>> select() {

        List<User> list = userRepository.findAll();

        return ResponseEntity.status(200)
                .body(list);
    }

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody UserReqDto userReqDto) {

        userService.insert(userReqDto);
        // select * from where idx = ?
//        userRepository.findAll()
        // select * from where email = ?


        return ResponseEntity.status(200).body("successful insert");
    }

    @PutMapping("update")
    public ResponseEntity<String> update(@Valid @RequestBody UserReqDto userReqDto) {

        System.out.println("일로오나");
        userService.update(userReqDto);

        return ResponseEntity.status(200).body("success update");
    }

    @DeleteMapping("delete/{idx}")
    public ResponseEntity<String> delete(@PathVariable("idx") long idx) {

        //유저 삭제시 작성한 글을 삭제하기 싫으면
        User dbUser = userRepository.findById(idx).orElseThrow();

        dbUser
                .getList()
                .stream()
                .forEach(freeBoard -> {
                    freeBoard.setUser(null);
                    freeBoardRepository.save(freeBoard);
                });

        dbUser.setList(new ArrayList<>());
        userRepository.delete(dbUser);

        return ResponseEntity.status(200).body("success delete");
    }
}
