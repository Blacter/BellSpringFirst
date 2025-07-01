package com.example.demoTask2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoTask2.Config;
import com.example.demoTask2.controller.data.LoginStatusBean;
import com.example.demoTask2.util.ResponseDelay;

@RestController
@RequestMapping(path="/", produces="application/json")
@CrossOrigin(origins="*")
public class LoginStatusResponse {
    @GetMapping(Config.GET_LOGIN_STATUS_PATH)
    public LoginStatusBean get(){
        outRequestPath();
        LoginStatusBean loginStatusBean = new LoginStatusBean();
        loginStatusBean.setLogin("Login1");
        loginStatusBean.setStatus("ok");

        ResponseDelay.doRandomDelay(Config.FROM_MILLISECONDS_DELAY, Config.TO_MILLISECONDS_DELAY);
        return loginStatusBean;
    }

    private void outRequestPath(){
        if (Config.IS_PRINT_REQUEST_PATH){
            System.out.print(Config.GET_LOGIN_STATUS_PATH + " ");
        }
    }
}
