package com.example.demoTask2.controller.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import lombok.Data;

@Data
public class LoginPasswordDateData {
    private String login;
    private String password;
    private String currentDate;

    private LoginPasswordDateData(String login, String password){
        this.login = login;
        this.password = password;
        this.currentDate = getCurrentDateTime();
    }

    public static LoginPasswordDateData fromLoginPasswordData(LoginPasswordData loginPasswordData){
        return new LoginPasswordDateData(loginPasswordData.login, loginPasswordData.password);
    }

    private String getCurrentDateTime(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }
}
