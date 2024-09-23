package com.pmh.ex07.FreeBoard;

import com.pmh.ex07.User.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class FreeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String title;
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    private LocalDateTime regDate;
    private LocalDateTime modDate;

    private int view_count;


}
