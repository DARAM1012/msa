package com.example.ex01.user;

import com.example.ex01.member.MemberRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

@RestController
@CrossOrigin
public class UserController {
    @GetMapping("bb/insert")
    public String aa(@RequestParam(name = "name", defaultValue = "이름")String name,
                     @RequestParam(name = "age", defaultValue = "30")int age) {
        System.out.println("name ="+name);
        System.out.println("age ="+age);
        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insert(name,age);
        return "memberTable 저장했습니다";
    }

    @GetMapping("bb")
    public String bb() {
        return "bb";
    }
}
