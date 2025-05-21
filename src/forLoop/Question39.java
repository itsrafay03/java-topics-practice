// Write a Java program that prompts the user to input an integer and then outputs the
// number with the digits reversed. For example, if the input is 12345, the output
// should be 54321?
package forLoop;

import java.util.Scanner;

public class Question39 {
    static Scanner scanner = new Scanner(System.in);
    private long number;

    public Question39() {
    }

    public Question39(long number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextLong());
    }

    // Method do display the Reverse of any number.
    public String displayReverseNumber(){
        if(getNumber() < 0){
            System.out.print("The reverse order of "+getNumber()+" is -");
            setNumber(-getNumber());
        }else{
            System.out.print("The reverse order of "+getNumber()+" is ");
            setNumber(getNumber());
        }
        return reverseNumber(getNumber());
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
        Question39 question39 = new Question39();
        question39.input();
        System.out.println(question39.displayReverseNumber());
 */