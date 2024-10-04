package com.pmh.ex10;

import com.pmh.ex10.FreeBoard.FreeBoard;
import com.pmh.ex10.User.User;
import com.pmh.ex10.file.FileEntity;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// IOC 컨테이너 생성
//@SpringBootTest
class Ex10ApplicationTests {

	@Test
	void contextLoads() {

		String []str = {"10입니다","20입니다","30입니다"};

		Arrays.stream(str).forEach(System.out::println);

		String result = Arrays.stream(str).reduce("",(s, s2) -> s+s2 );
		System.out.println("result = "+result);
//		Arrays.stream(str).reduce("",(s, s2) -> {return s+s2;} );
	}


//	@Test
//	void  saveFreeBoardTest(){
//		User user = userRepository.findById(1l).orElseThrow();
//
//		List<FileEntity> list = Arrays.asList(
//				FileEntity.builder().name("afile").build(),
//				FileEntity.builder().name("bfile").build()
//		);
//
//		FreeBoard freeBoard = FreeBoard.builder()
//				.idx(10l)
//				.title("제목qwer")
//				.content("내용qwer")
//				.list(list)
//				.user(user)
//				.build();
//
//		 freeBoardRepository.save(freeBoard);
//	}

}
