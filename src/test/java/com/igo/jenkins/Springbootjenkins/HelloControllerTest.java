package com.igo.jenkins.Springbootjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
  testSayHello() throws Exception {
    	
    	System.out.println("The helloController test was 1 excecuting");
    	System.out.println("The helloController test was 2 excecuting");
        mockMvc.perform(get("/api/hello"))
               .andExpect(status().isOk())  
               .andExpect(content().string("Hello jenkins")); 
    }
}