package com.apps.validationservice;

public class UserValidationServiceTest {

    public void ShortFirstNameTest() {
    User user = new User("Li", "Jecky", 40);
    UserValidationService validationServiceTest = new UserValidationService();
    String actualValidationMessage = validationServiceTest.validateFirstName(user);
    String expectedValidationMessage = UserValidationException.INVALID_NAME_ERROR;
    if (expectedValidationMessage.equals(actualValidationMessage)) {
        System.out.println("PASSED Short First Name Test");
    }else {
        System.out.println("FAILED Short First Name Test");
    }
    }


    public void ShortLastNameTest() {
        User user = new User("Mark", "Po", 40);
        UserValidationService validationServiceTest = new UserValidationService();
        String actualValidationMessage = validationServiceTest.validateLastName(user);
        String expectedValidationMessage = UserValidationException.INVALID_LAST_NAME_ERROR;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("PASSED Short Last Name Test");
        }else {
            System.out.println("FAILED Short Last Name Test");
        }
    }

    public void invalidAgeTest() {
        User user = new User("Mark", "Po", 135);
        UserValidationService validationServiceTest = new UserValidationService();
        String actualValidationMessage = validationServiceTest.validateAge(user);
        String expectedValidationMessage = UserValidationException.INVALID_AGE_ERROR;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("PASSED Invalid Age Test");
        }else {
            System.out.println("FAILED Invalid Age Name Test");
        }
    }
}
