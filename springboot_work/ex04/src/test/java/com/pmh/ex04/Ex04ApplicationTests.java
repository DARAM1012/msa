package com.pmh.ex04;

import com.pmh.ex04.obj.AA;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ex04ApplicationTests {

	@Autowired
	public AA aa;

	@Test
	void contextLoads() {
	}

}
