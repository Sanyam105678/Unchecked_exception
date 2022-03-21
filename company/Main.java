package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


class Main {
    public static void main(String args[]) throws indexOutofBound{

      int [] a = new int[5];
      try {

          for(int i=0;i<10;i++)
              a[i]=i;
      }
      catch (ArrayIndexOutOfBoundsException e){
          indexOutofBound obj = new indexOutofBound("Array index can't be more than 4. It is a checked exception");
          for(int i=0;i<10;i++)
              a[i%5]=i;

      }
        for(int i=0;i<5;i++)
            System.out.println(a[i]+ " ");


    }
}



