package com.apps.validationservice;

public class User {
    //user parameters for UserValidationService

    private String firstname;
    private String lastname;
    private int age;

    //user parameters for UserLoginService

    private String login;
    private String password;
    private boolean isNotBlockedByDefault = true;
    private int tries = 3;

    //constructor for UserLoginService

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    //getters and setters for UserLoginService

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isNotBlockedByDefault() {
        return isNotBlockedByDefault;
    }

    public void setNotBlockedByDefault(boolean notBlockedByDefault) {
        isNotBlockedByDefault = notBlockedByDefault;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    //methods for UserLoginService
    public void reset() {
        tries = 3;
    }

    public void blockUser() {
        isNotBlockedByDefault = false;
        tries = 0;
    }
    //end of methods for UserLoginService


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
