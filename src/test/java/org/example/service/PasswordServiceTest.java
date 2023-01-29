package org.example.service;

import org.example.exception.PasswordException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PasswordServiceTest {

    private final PasswordService passwordService = new PasswordService();

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
}