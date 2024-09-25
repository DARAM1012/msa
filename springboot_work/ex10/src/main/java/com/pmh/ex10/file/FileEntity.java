package com.pmh.ex10.file;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pmh.ex10.FreeBoard.FreeBoard;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "freeBoardFile")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class FileEntity {

    //기본 생성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String name;
    private String path;

    private String fileDesc;

    @ManyToOne
    @JsonIgnore
//    @JoinColumn(name = "free_board_idx")
    private FreeBoard freeBoard;


    @Override
    public String toString() {
        return "FileEntity{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", fileDesc='" + fileDesc +
                '}';
    }
}
