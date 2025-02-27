package com.pmh.ex08.FreeBoard;

import com.pmh.ex08.User.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class FreeBoardReqDto {

    private Long idx;

    @Schema(example = "제목을 넣어주세요")
    @Length(min = 2, max = 255)
    private String title;

    @Schema(example = "제목을 넣어주세요")
    @NotEmpty
    private String content;
//    private User user;

    @Schema(hidden = true)
    private LocalDateTime regDate;

    @Schema(hidden = true)
    private  LocalDateTime modDate;

    @Schema(hidden = true)
    private int view_count;
}
