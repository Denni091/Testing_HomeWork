package org.example.service;

import org.example.exception.PasswordException;

public class PasswordService {
    public void validateLenghtPassword(String password) throws PasswordException {
        if (password.length() <= 4) {
            throw new PasswordException("Your password is less than 4 values");
        }
    }

    public void validateNullPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("Your password is null");
        }
    }

}
