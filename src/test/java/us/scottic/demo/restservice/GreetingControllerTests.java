package us.scottic.demo.restservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class GreetingControllerTests {

    @Test
    public void ShouldReturnMessage() {
        System.out.println("GreetingControllerTests: testShouldReturnMessage()");
        Assertions.assertEquals(1, 2);

    }
}