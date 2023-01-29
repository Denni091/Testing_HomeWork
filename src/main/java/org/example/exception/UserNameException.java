package org.example.exception;

import java.io.IOException;

public class UserNameException extends IOException {

    public UserNameException(String message) {
        super(message);
    }
}
