package com.control;

// FizzBuzz.java
public class FizzBuzz {
    public static String de(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return "FizzBuzz";
        }
        else if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }


        return String.valueOf(number);
    }

}
