package com.pmh.ex04.User;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

// 프론트에서 오는 파라메타의 검사
@Data
public class UserReDto {
    private Long idx;

    private String name;
    private int age;

    @NotEmpty
    private String email;
    @NotEmpty
    private String password;

    private LocalDateTime wdate;
}
