package com.payment.demo.models;

public class RegisterRequest {
    private String username;
    private String email;
    private String password;
    private String Firstname;
    private String Lastname;


    public String getUsername() {
        return username;
    }

    public RegisterRequest setUsername(String username) {
        this.username = username;
        return this;
    }

    public RegisterRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstname() {
        return Firstname;
    }

    public RegisterRequest setFirstname(String firstname) {
        Firstname = firstname;
        return this;
    }

    public String getLastname() {
        return Lastname;
    }

    public RegisterRequest setLastname(String lastname) {
        Lastname = lastname;
        return this;
    }

    public String getEmail() {
        return email;

    }
}
