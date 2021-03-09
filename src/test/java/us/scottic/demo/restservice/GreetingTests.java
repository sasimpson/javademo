package us.scottic.demo.restservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingTests {

    @Test
    public void CreateObject() {
        Greeting greeting = new Greeting(1, "Test");

        Assertions.assertEquals("Test", greeting.getContent());
        Assertions.assertEquals(1, greeting.getId());
    }
}
