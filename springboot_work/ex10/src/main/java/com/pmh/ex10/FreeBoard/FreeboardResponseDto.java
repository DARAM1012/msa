package com.pmh.ex10.FreeBoard;

import com.pmh.ex10.User.User;
import com.pmh.ex10.file.FileEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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
    private List<FileEntity> list = new ArrayList<>();
}
