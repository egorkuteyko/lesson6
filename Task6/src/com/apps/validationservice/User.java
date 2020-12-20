package com.apps.validationservice;

public class User {
    private String firstname;

    public User() {
    }

    public User(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
