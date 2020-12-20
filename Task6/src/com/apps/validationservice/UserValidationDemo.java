package com.apps.validationservice;

public class UserValidationDemo {
    public static void main(String[] args) {
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
        System.out.println("\nTESTS");
        validationServiceTest.ShortFirstNameTest();
        validationServiceTest.ShortLastNameTest();
        validationServiceTest.invalidAgeTest();
    }
}
