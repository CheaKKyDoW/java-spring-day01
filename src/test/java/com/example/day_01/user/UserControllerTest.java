package com.example.day_01.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    TestRestTemplate restTemplate;
    @Test
    @DisplayName("Found user by id")
    void getUserById() {
         UserResponse actualResponse = restTemplate.getForObject("/user/1", UserResponse.class);
         assertEquals(1,actualResponse.getId());
         assertEquals("John",actualResponse.getFirst_Name());

    }
    @Test
    @DisplayName("Internal server error")
    void getUserById_NotFound() {
        ResponseEntity<String> response = restTemplate.getForEntity("/user/0", String.class);
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
    }
}