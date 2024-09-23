package com.pmh.ex08.FreeBoard;

import com.pmh.ex08.User.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class FreeboardResponseDto {

    private Long idx;
    private String title;
    private String content;

    private User user;

    private String creAuthor;
    private String modAuthor;
    private String regDate;
    private  String modDate;

    private int view_count;
}
