package com.jwt.service;

import org.springframework.stereotype.Service;
import com.jwt.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>();

    public UserService(){
        userList.add(new User(UUID.randomUUID().toString(),"Viresh","viresh@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"abc","abc@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"xyz","xyz@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"lmn","lmn@gmail.com"));
    }

    public List<User> getUsers(){
        return userList;
    }
}
