package com.myapp.auth;

public class AuthService {

    public String login(String username, String password) {
        if(username.equals("admin") && password.equals("123")) {
            return "Login Success";
        }
        return "Invalid Credentials";
    }

}