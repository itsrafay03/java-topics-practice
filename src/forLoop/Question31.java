// Write a Java program to count number of digits in a number?
package forLoop;

import java.util.Scanner;

public class Question31 {
    static Scanner scanner = new Scanner(System.in);
    private long number;

    public Question31() {
    }

    public Question31(long number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextLong());
    }


    public int countDigitsOfNumber(){
        int numberOfDigits = 0;
        if(getNumber() < 0){
            setNumber(-getNumber());
        }
        for (int digit = 1; digit <= lengthOfNumber(getNumber()); digit++) {
            numberOfDigits++;
        }
        System.out.print("The number of digits in "+getNumber()+" is : ");
        return numberOfDigits;
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



    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}

/*
        Question31 question31 = new Question31();
        question31.input();
        System.out.println(question31.countDigitsOfNumber());
 */