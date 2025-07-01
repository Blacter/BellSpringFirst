package com.example.demoTask2.controller.data;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotNull;

public class LoginPasswordData {
    @NotNull
    @Length(min = 5, max = 128)
    public String login;

    // @Pattern(regexp = "")
    @NotNull
    @Length(min = 5, max = 128)
    public String password;
}
