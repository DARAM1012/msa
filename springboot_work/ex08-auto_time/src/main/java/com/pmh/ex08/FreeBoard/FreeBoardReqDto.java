package com.pmh.ex08.FreeBoard;

import com.pmh.ex08.User.User;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class FreeBoardReqDto {

    private Long idx;
    private String title;
    private String content;
    private User user;
    private LocalDateTime regDate;
    private  LocalDateTime modDate;
    private int view_count;
}
