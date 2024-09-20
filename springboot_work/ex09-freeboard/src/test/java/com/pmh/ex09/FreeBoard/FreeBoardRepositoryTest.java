package com.pmh.ex09.FreeBoard;

import com.pmh.ex09.User.User;
import com.pmh.ex09.User.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FreeBoardRepositoryTest {

    //스프링 객체 담는 통에서 freeboardRepository 객체 가져오기
    @Autowired
    FreeBoardRepository freeBoardRepository;

    @Autowired
    UserRepository userRepository;

    // 1.UserRepository
    // 2. Cascade JPA 속성

    @Test
    void insertTest() {
        User user = User.builder()
                .name("다람이")
                .age(21)
                .email("accc@darami.com")
                .password("password")
                .build();

//        userRepository.save(user);

        FreeBoard freeBoard = FreeBoard.builder()
                .title("제목")
                .content("내용")
                .user(user)
                .build();
        freeBoardRepository.save(freeBoard);
    }

    @Test
//    @Transactional insert한거 삭제해줘

    void selectTest() {
       List<FreeBoard> list = freeBoardRepository.findAll();
       list.stream().forEach(System.out::println);
    }
    void deleteTest(){
        freeBoardRepository.deleteById(3l);
    }
    void updateTest(){
        User user = User.builder()
                .name("다람이")
                .age(21)
                .email("accc@darami.com")
                .password("password")
                .build();

//        userRepository.save(user);

        FreeBoard freeBoard = FreeBoard.builder()
                .idx(4l)
                .title("제목")
                .content("내용")
                .user(user)
                .build();
        freeBoardRepository.save(freeBoard);
    }
}