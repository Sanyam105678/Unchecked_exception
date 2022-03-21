package com.company;

public class dividedByZero extends ArithmeticException {
    public dividedByZero(String message) {
        super(message);
        System.out.println(message);

    }
}
