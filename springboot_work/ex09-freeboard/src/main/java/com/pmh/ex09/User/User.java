package com.pmh.ex09.User;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;

/*
    @Configuraion -> 객체 담는통 정의
    @Bean -> 그거 객체야
    @Component -> 그것도 객체야
    @ComponentScan -> 패키지 내용읽어서 객체 주입해줘
    @Autowired -> new 예약어 안쓰고 객체 자동 할당..
    private final -> @RequiredArgsConstructor -> 객체 자동할당

    @Entity -> 이거 테이블이야
    @Table -> table 이름 바꾸께
    @Id -> 기본키야 Primary 키야
 */

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
// Table 정의
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT 이거 설정해줘...
    private Long idx;

    @Column(name = "username", nullable = false,length = 50)
    private String name;
    private int age;

    @Column(length = 100, unique = true)
    @Email
    private String email;
    @Column(length = 100)
    private String password;

    private LocalDateTime wdate;

    // JPA CLASS -> talbe CREATE가 됩니다.

}