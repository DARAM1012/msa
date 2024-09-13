package com.pmh.ex08.User;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

// 프론트에서 오는 파라메타의 검사
@Data
public class UserReDto {
    private Long idx;

    @Length(min = 2,max = 100)
    private String name;

    @Min(0)@Max(130)
    private int age;

    @NotEmpty
    private String email;
    @NotEmpty
    private String password;

    private LocalDateTime wdate;
}
