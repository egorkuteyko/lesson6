package com.apps.validationservice;

public class UserValidationDemo {
    public static void main(String[] args) {
        User validUser = new User("Egorka", "Atata", 50);
        User invalidUser = new User("Yo", "Asakura", 124);
        UserValidationService validationService = new UserValidationService();
        System.out.println("Validation 1:");
        validationService.validate(validUser);
        System.out.println("\nValidation 2:");
        validationService.validate(invalidUser);
    }
}
