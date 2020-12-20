package com.apps.validationservice;

public class UserLoginService {
    public int login (User user, String password) {
        String currentPassword = user.getPassword();
        boolean passwordCheck = currentPassword.equals(password);
        int tries = user.getTries();
        if(passwordCheck == true) {
            user.reset();
            System.out.println("Правильный пароль. Количество попыток на вход было сброшено до дефолтного значения 3");
        } else {
            user.setTries(user.getTries()-1);
            tries--;
            System.out.println("Неправильный пароль. Количество оставшихся попыток " + tries);
            if(tries == 0) {
            user.blockUser();
            user.setTries(user.getTries()+1);
                System.out.println("Юзер заблокирован");
            }
        }
        return tries;
    }
}
