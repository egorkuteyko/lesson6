package com.apps.validationservice;

public class UserValidationAndLoginServiceDemo {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        System.out.println("User Validation Service Part");
        System.out.println("------------------------------------------------");

        User validUser = new User("Egorka", "Atata", 50);
        User invalidUser = new User("Yo", "Lu", 124);
        User partiallyValidUser = new User("Yo", "Asakura", 20);
        UserValidationService validationService = new UserValidationService();
        UserValidationServiceTest validationServiceTest = new UserValidationServiceTest();
        System.out.println("Validation 1:");
        validationService.validateFirstName(validUser);
        validationService.validateLastName(validUser);
        validationService.validateAge(validUser);
        System.out.println("\nValidation 2:");
        validationService.validateFirstName(invalidUser);
        validationService.validateLastName(invalidUser);
        validationService.validateAge(invalidUser);
        System.out.println("\nValidation 3:");
        validationService.validateFirstName(partiallyValidUser);
        validationService.validateLastName(partiallyValidUser);
        validationService.validateAge(partiallyValidUser);
        System.out.println("------------------------------------------------");
        System.out.println("TESTS for Login Validation Service part");
        System.out.println("------------------------------------------------");
        validationServiceTest.ShortFirstNameTest();
        validationServiceTest.ShortLastNameTest();
        validationServiceTest.invalidAgeTest();
        System.out.println("------------------------------------------------");
        System.out.println("User Login Service Part");
        System.out.println("------------------------------------------------");
        User userForUserLoginService = new User("Hacker", "showMeYourPassword");
        UserLoginService loginService = new UserLoginService();
        loginService.login(userForUserLoginService, "12345");
        loginService.login(userForUserLoginService, "123456");
        loginService.login(userForUserLoginService, "1234567");
        loginService.login(userForUserLoginService, "12345678");
        loginService.login(userForUserLoginService, "123456789");
        loginService.login(userForUserLoginService, "12345678910");
        loginService.login(userForUserLoginService, "showMeYourPassword");
        loginService.login(userForUserLoginService, "123456");
    }
}
