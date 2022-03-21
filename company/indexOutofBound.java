package com.company;

public class indexOutofBound extends ArrayIndexOutOfBoundsException {
    public indexOutofBound(String message) {
        super(message);
        System.out.println(message);

    }
}
