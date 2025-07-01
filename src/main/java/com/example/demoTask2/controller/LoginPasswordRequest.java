package com.example.demoTask2.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoTask2.controller.data.LoginPasswordData;
import com.example.demoTask2.controller.data.LoginPasswordDateData;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demoTask2.Config;
import com.example.demoTask2.util.ResponseDelay;

import jakarta.validation.Valid;


@RestController
@RequestMapping(path="/", produces="application/json")
@CrossOrigin(origins="*")
public class LoginPasswordRequest  {
    @PostMapping(Config.POST_LOGIN_PASSWORD_DATE_PATH)
    public LoginPasswordDateData postLoginPassword(@Valid @RequestBody LoginPasswordData loginPasswordData){
        outRequestPath();
        ResponseDelay.doRandomDelay(Config.FROM_MILLISECONDS_DELAY, Config.TO_MILLISECONDS_DELAY);
        return LoginPasswordDateData.fromLoginPasswordData(loginPasswordData);
    }

    private void outRequestPath(){
        if (Config.IS_PRINT_REQUEST_PATH){
            System.out.print(Config.POST_LOGIN_PASSWORD_DATE_PATH + " ");
        }
    }
}
