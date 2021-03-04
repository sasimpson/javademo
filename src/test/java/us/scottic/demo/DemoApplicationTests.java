package us.scottic.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("DemoApplicationTests: contextLoads()");
		Assertions.assertEquals(1, 1);
	}

}
