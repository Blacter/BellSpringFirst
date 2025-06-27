package com.example.demoTask2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoTask2.controller.data.LoginPasswordData;
import com.example.demoTask2.controller.data.LoginPasswordDateData;

import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(path="/", produces="application/json")
@CrossOrigin(origins="*")
public class LoginPasswordRequest {
    @PostMapping("/")
    public LoginPasswordDateData postLoginPassword(@RequestBody LoginPasswordData loginPasswordData){
        return LoginPasswordDateData.fromLoginPasswordData(loginPasswordData);
    }
}
