package com.pmh.ex10.FreeBoard;

import com.pmh.ex10.User.User;
import lombok.Data;

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
