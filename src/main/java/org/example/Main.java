package org.example;

import org.example.controller.Controller;
import org.example.exception.EmailException;
import org.example.exception.PasswordException;
import org.example.exception.PhoneException;
import org.example.exception.UserNameException;

public class Main {

    public static void main(String[] args) throws PasswordException, EmailException, PhoneException, UserNameException {
        Controller controller = new Controller();
        controller.start();
    }
}
