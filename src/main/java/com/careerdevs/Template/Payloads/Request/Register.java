package com.careerdevs.Template.Payloads.Request;

import java.util.Set;

public class Register {
    private String username;
    private String password;
    private Set<String> roles;

    public Register(String username, String password, Set<String> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
