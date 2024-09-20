package com.pmh.ex09.User;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("select")
    public ResponseEntity<List<User>> select() {
        return ResponseEntity.status(200).body(userRepository.findAll());
    }

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody UserReDto userReDto) {

        userService.insert(userReDto);
        // select * from where idx = ?
//        userRepository.findAll()
        // select * from where email = ?


        return ResponseEntity.status(200).body("successful insert");
    }

    @PutMapping("update")
    public ResponseEntity<String> update(@Valid @RequestBody UserReDto userReDto) {
        System.out.println("실행" + userReDto);

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReDto, User.class);
        System.out.println("user = " + user);
        userRepository.save(user);
        return ResponseEntity.status(200).body("successful update");
    }

    @DeleteMapping("delete/{idx}")
    public ResponseEntity<String> delete(@PathVariable("idx") long idx) {
        userRepository.deleteById(idx);
        return ResponseEntity.status(200).body("successful delete");
    }
}
