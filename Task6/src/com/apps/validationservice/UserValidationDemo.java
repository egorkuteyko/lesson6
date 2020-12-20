package com.apps.validationservice;

public class UserValidationDemo {
    public static void main(String[] args) {
        User validUser = new User("Egorka");
        User invalidUser = new User("Yo");
        UserValidationService validationService = new UserValidationService();
        System.out.println("Validation 1:");
        validationService.validate(validUser);
        System.out.println("\nValidation 2:");
        validationService.validate(invalidUser);
    }
}
