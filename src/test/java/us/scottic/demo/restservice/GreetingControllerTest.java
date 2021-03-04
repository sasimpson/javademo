package us.scottic.demo.restservice;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;


@SpringBootTest
public class GreetingControllerTest {

    @Test
    public void testShouldReturnMessage() throws Exception {
        System.out.println("GreetingControllerTest: testShouldReturnMessage()");
        Assertions.assertEquals(1, 2);

    }
}