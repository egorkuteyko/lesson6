package com.apps.validationservice;

public class UserValidationService {
    public void validate(User user) {
        String firstname = user.getFirstname();
        int nameLength = firstname.length();
        if (nameLength > 3 && nameLength < 15) {
            System.out.println("Name is valid");
        } else {
            System.out.println(UserValidationException.INVALID_NAME_ERROR);
        }
    }

}
