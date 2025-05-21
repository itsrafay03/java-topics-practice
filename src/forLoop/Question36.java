// Write a Java program to print out all Armstrong numbers between 1 and 500. If
// sum of cubes of each digit of the number is equal to the number itself, then the
// number is called an Armstrong number.
package forLoop;

import java.util.Locale;
import java.util.Scanner;

public class Question36 {
    static Scanner scanner = new Scanner(System.in);
    public static final int LOWER_LIMIT = 1;
    public static final int UPPER_LIMIT = 500;

    public Question36() {
    }


    // Method to print out all Armstrong numbers between 1 and 500.
    public void checkArmstrongNumber() {
        System.out.println("All the Armstrong numbers between "+ LOWER_LIMIT+" and "+UPPER_LIMIT+" are as following : \n");
        int numberLength;
        int currentDigit;
        int power;
        int sumOfPowers;
        int actualNumber, realNumber;
        for (int number = LOWER_LIMIT; number <= UPPER_LIMIT; number++) {
            realNumber = actualNumber = number;
            numberLength = lengthOfNumber(actualNumber);
            sumOfPowers = 0;
            while(actualNumber > 0){
                int length = numberLength;
                currentDigit = actualNumber % 10;
                power = 1;
                while(length >= 1){
                    power *= currentDigit;
                    length--;
                }
                sumOfPowers += power;
                actualNumber /= 10;
            }

            if(realNumber == sumOfPowers){
                System.out.print(realNumber+", ");
            }
        }
        System.out.println("\b\b");
    }


    // Method to find the length of a number.
    private int lengthOfNumber(long num){
        int length = 0;
        while(num > 0){
            length++;
            num /= 10;
        }
        return length;
    }
}

/*
        Question36 question36 = new Question36();
        question36.checkArmstrongNumber();
 */