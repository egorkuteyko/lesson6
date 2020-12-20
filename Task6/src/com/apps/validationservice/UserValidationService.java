package com.apps.validationservice;

public class UserValidationService {
    public String validateFirstName(User user) {
        String firstname = user.getFirstname();
        int nameLength = firstname.length();
        if (nameLength > 3 && nameLength < 15) {
            System.out.println("Name is valid");
            return "Name is valid";
        } else {
            System.out.println(UserValidationException.INVALID_NAME_ERROR);
            return UserValidationException.INVALID_NAME_ERROR;
        }


    }

    public String validateLastName(User user) {
        String lastName = user.getLastname();
        int lastNameLength = lastName.length();
        if (lastNameLength > 3 && lastNameLength < 15) {
            System.out.println("Last name is valid");
            return "Last name is valid";
        } else {
            System.out.println(UserValidationException.INVALID_LAST_NAME_ERROR);
            return UserValidationException.INVALID_LAST_NAME_ERROR;
        }
    }

    public String validateAge(User user) {
        int age = user.getAge();
        if (age > 0 && age < 120) {
            System.out.println("Age is valid");
            return "Age is valid";
        } else {
            System.out.println(UserValidationException.INVALID_AGE_ERROR);
            return UserValidationException.INVALID_AGE_ERROR;
        }
    }
}

