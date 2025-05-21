// Write a Java program to check whether a number is a palindrome or not?
package forLoop;

import javax.xml.stream.events.EndElement;
import java.util.Scanner;

public class Question21 {
    static Scanner scanner = new Scanner(System.in);
    private long number;

    public Question21() {
    }

    public Question21(long number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextLong());
    }


    // Method to check that input number is Palindrome or not.
    public void checkPalindromeNumber(){
        long actualNumber = getNumber();
        if(actualNumber < 0) {
            actualNumber = -getNumber();
        }
        if(actualNumber == Long.parseLong(reverseNumber(actualNumber))){
            System.out.println("Yes, "+getNumber()+" is a Palindrome number.");
        }else {
            System.out.println("No, "+getNumber()+" is not a Palindrome number.");
        }
    }

    // Method to reverse the positive number correctly.
    private String reverseNumber(long number){
        long digit;
        long actualNumber = number;
        StringBuilder reverseNum = new StringBuilder();
        for (int i = 1; i <= lengthOfNumber(actualNumber); i++) {
            digit = number % 10;
            //System.out.println(digit);
            reverseNum.append(digit);
            number /= 10;
        }
        return reverseNum.toString();
    }

    // Method to find the length of the number.
    private int lengthOfNumber(long num){
        int length = 0;
        while(num > 0){
            length++;
            num /= 10;
        }
        return length;
    }


    // Getter Setter.
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}

/*
        Question21 question21 = new Question21();
        question21.input();
        question21.checkPalindromeNumber();
 */