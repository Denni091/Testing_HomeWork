package org.example.controller;

import org.example.entity.User;
import org.example.exception.EmailException;
import org.example.exception.PasswordException;
import org.example.exception.PhoneException;
import org.example.exception.UserNameException;
import org.example.service.PasswordService;
import org.example.service.UserService;

public class Controller {

    public void start() throws PasswordException, EmailException, PhoneException, UserNameException {
        PasswordService passwordService = new PasswordService();
        UserService userService = new UserService();
//        passwordService.validateLenghtPassword("Den");
//        passwordService.validateNullPassword(null);
        User user = new User();
//        user.setEmail("123@");
//        userService.validateEmail(user);
//        user.setPhone("+0977035432");
//        userService.validateLocalCountryPhone(user);
//        user.setName(null);
//        user.setName("");
        userService.validateName(user);
    }
}
