package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// A checked exception is  compile time exception it means it is detected at compile time
// whereas unchecked exception is detected at runtime.
// Checked exception can be handled by try catch whereas unchecked exception can't be handled, it is simply a runtime time exception.
// We can just instruct user to solve it by giving a hint.
class Main {
    public static void main(String args[]) throws dividedByZero {

        int a=10;
        int b=0;
        try{
            int c=a/b;
        }
        catch (ArithmeticException e){
            dividedByZero obj = new dividedByZero("Unchecked User Defined Exception");
        }




    }
}



