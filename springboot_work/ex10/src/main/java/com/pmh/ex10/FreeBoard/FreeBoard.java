package com.pmh.ex10.FreeBoard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pmh.ex10.User.User;
import com.pmh.ex10.file.FileEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
//@Table(name = "freeboard") 이름 바꾸기
public class FreeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String title;
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private User user;

    @CreatedBy
    @Column(updatable = false)
    private String creAuthor;

    @LastModifiedBy
    private String modAuthor;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modDate;

    @Column(columnDefinition = "int default 0")
    private int view_count;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "freeBoard", cascade = CascadeType.ALL)
    private List<FileEntity> list = new ArrayList<>();

    @Override
    public String toString() {
        return "FreeBoard{" +
                "idx=" + idx +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creAuthor='" + creAuthor + '\'' +
                ", modAuthor='" + modAuthor + '\'' +
                ", regDate=" + regDate +
                ", modDate=" + modDate +
                ", view_count=" + view_count +
                ", list=" + list +
                '}';
    }
}
