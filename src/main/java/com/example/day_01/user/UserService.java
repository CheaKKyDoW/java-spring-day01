package com.example.day_01.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserResponse getData(int id) {
        if(id ==2) {
            throw new UserNotFoundException(String.valueOf(id));
        }
//        Hard code
        UserResponse userResponse = new UserResponse();
        userResponse.setId(id);
        userResponse.setFirst_Name("c");
        userResponse.setEmail("c@xx.com");
        userResponse.setAge(55);
        return userResponse;
    }
}