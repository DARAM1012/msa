package com.pmh.ex08;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

// IOC 컨테이너 생성
//@SpringBootTest
class Ex08ApplicationTests {

	@Test
	void contextLoads() {

		String []str = {"10입니다","20입니다","30입니다"};

		Arrays.stream(str).forEach(System.out::println);

		String result = Arrays.stream(str).reduce("",(s, s2) -> s+s2 );
		System.out.println("result = "+result);
//		Arrays.stream(str).reduce("",(s, s2) -> {return s+s2;} );
	}

}
