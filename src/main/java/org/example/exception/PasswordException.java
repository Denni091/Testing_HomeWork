package org.example.exception;

import java.io.IOException;

public class PasswordException extends IOException {

    public PasswordException(String massage) {
        super(massage);
    }
}
