package org.example.service;

import org.example.entity.User;
import org.example.exception.EmailException;
import org.example.exception.PasswordException;
import org.example.exception.PhoneException;
import org.example.exception.UserNameException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordServiceTest {

    private final PasswordService passwordService = new PasswordService();
    private final UserService userService = new UserService();
    private final User user = new User();

    @Test
    void validateLenghtPassword() {
        PasswordException lessValuesException = assertThrows(PasswordException.class,
                () -> passwordService.validateLenghtPassword("den"));
        assertEquals("Your password is less than 4 values", lessValuesException.getMessage());
    }

    @Test
    void validateNullPassword() {
        assertThrows(PasswordException.class, () -> passwordService.validateNullPassword(null));
    }

    @Test
    void validateEmailFormat() {
        user.setEmail("den");
        assertThrows(EmailException.class, () -> userService.validateEmail(user));
    }

    @Test
    void validateIfEmailIsBlank() {
        user.setEmail(" ");
        assertThrows(EmailException.class, () -> userService.validateEmail(user));
    }

    @Test
    void validateLenghtEmail() {
        user.setEmail("de@");
        assertThrows(EmailException.class, () -> userService.validateEmail(user));
    }

    @Test
    void validateIfPhoneDoesNotContainsPlus() {
        user.setPhone("0977035432");
        assertThrows(PhoneException.class, () -> userService.validateLocalCountryPhone(user));
    }

    @Test
    void validateLenghtPhone() {
        user.setPhone("+097703543");
        assertThrows(PhoneException.class, () -> userService.validateLocalCountryPhone(user));
    }

    @Test
    void validateIfUserIsNull() {
        user.setName(null);
        UserNameException userNameException = assertThrows(UserNameException.class,
                () -> userService.validateName(user));
        assertEquals("User name is null or empty", userNameException.getMessage());
    }
    @Test
    void validateIfUserNameIsBlank() {
        user.setName(" ");
        UserNameException userNameException = assertThrows(UserNameException.class,
                () -> userService.validateName(user));
        assertEquals("User name is null or empty", userNameException.getMessage());
    }
}