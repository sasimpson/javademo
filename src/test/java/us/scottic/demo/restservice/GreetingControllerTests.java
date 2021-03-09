package us.scottic.demo.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@SpringBootTest
public class GreetingControllerTests {

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        this.mockMvc = standaloneSetup(new GreetingController()).build();
    }

    @Test
    public void ShouldReturnWelcomeMessage() throws Exception {
        this.mockMvc.perform(get("/greeting").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.content").exists())
                .andExpect(jsonPath("$.content").value("Hello, World!"));
    }
}