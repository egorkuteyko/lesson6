package com.apps.validationservice;

public class UserValidationService {
    public void validate(User user) {
        String firstname = user.getFirstname();
        int nameLength = firstname.length();
        String lastName = user.getLastname();
        int lastNameLength = lastName.length();
        if (nameLength > 3 && nameLength < 15 && lastNameLength > 3 && lastNameLength < 15) {
            System.out.println("Name and last name are valid");
        } else {
            System.out.println(UserValidationException.INVALID_NAME_ERROR);
        }

        int age = user.getAge();
        if (age > 0 && age < 120) {
            System.out.println("Age is valid");
        } else {
            System.out.println(UserValidationException.INVALID_AGE_ERROR);
        }
    }

}
