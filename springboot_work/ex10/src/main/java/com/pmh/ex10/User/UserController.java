package com.pmh.ex10.User;


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
    public ResponseEntity<String> update(@Valid @RequestBody UserReqDto userReqDto){

        System.out.println("일로오나");
        userService.update(userReqDto);

        return ResponseEntity.status(200).body("success update");
    }

    @DeleteMapping("delete/{idx}")
    public ResponseEntity<String> delete(@PathVariable("idx") long idx) {
        userRepository.deleteById(idx);
        return ResponseEntity.status(200).body("successful delete");
    }
}
