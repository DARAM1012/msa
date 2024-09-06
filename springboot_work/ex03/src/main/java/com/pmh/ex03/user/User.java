package com.pmh.ex03.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/*
 @Configuraion - > 객체 담는 통 정의
 @Bean -> 그거 객체야
 @Component - > 그것도 객체야
 @ComponetScan -> 패키지 내용 읽어서 객체 주입해줘
 @Autowired -> new 예약이 안쓰고 객체 자동 할당
 private final -> @RequiredArgsConstructor -> 객체 자동 할당
 
 @Entity -> 이거 테이블이야
 @Table -> table 이름 바꿀게
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
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT 이거 설정해줘..
    private  Long idx;

    private String name;
    private int age;

    private String email;
    private String password;

    private LocalDateTime wdate;
    // JPA CALSS -> table CRATE가 됩니다

}
