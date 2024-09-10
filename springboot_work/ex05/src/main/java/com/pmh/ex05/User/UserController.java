package com.pmh.ex05.User;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select(){
        return userRepository.findAll();
    }

    @PostMapping("insert")
    public String insert(@Valid @RequestBody UserReDto userReDto){
        System.out.println("실행"+ userReDto);
        // save insert 실행...
//        User user = User.builder()
//                .name("홍길동")
//                .age(20)
//                .email("aaa@naver.com")
//                .password("password")
//                .wdate(LocalDateTime.now())
//                .build();

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReDto,User.class);
        System.out.println("user = "+ user);
        userRepository.save(user);
        return "ok";
    }

    @PutMapping("update")
    public String update(@Valid @RequestBody UserReDto userReDto) {
        System.out.println("실행" + userReDto);

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReDto, User.class);
        System.out.println("user = " + user);
        userRepository.save(user);
        return "ok";
    }
    @DeleteMapping("delete/{idx}")
    public String delete(@PathVariable("idx") long idx){
       userRepository.deleteById(idx);
        return "deleted";
    }
}
