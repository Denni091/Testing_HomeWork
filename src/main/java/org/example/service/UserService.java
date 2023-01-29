package org.example.service;

import org.example.entity.User;
import org.example.exception.EmailException;
import org.example.exception.PhoneException;
import org.example.exception.UserNameException;

public class UserService {
    public void validateEmail(User user) throws EmailException {
        if (!user.getEmail().contains("@") || user.getEmail().isBlank() || user.getEmail().length() < 4) {
            throw new EmailException("Exception! You didn't write @ or email is blank");
        }
    }

    public void validateLocalCountryPhone(User user) throws PhoneException {
        if (!user.getPhone().contains("+") || user.getPhone().length() != 11) {
            throw new PhoneException("Exception! You didn't write '+' or your phone lenght not equal 10");
        }
    }

    public void validateName(User user) throws UserNameException {
        if (user.getName() == null || user.getName().isBlank()) {
            throw new UserNameException("User name is null or empty");
        }
    }
}
