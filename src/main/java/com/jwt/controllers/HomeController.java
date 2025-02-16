package com.jwt.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser() {
        System.out.println("Users");
        return this.userService.getUsers();
    }

    @GetMapping("/current")
    public String getLoginUser(Principal principal){
        return principal.getName();
    }
}
