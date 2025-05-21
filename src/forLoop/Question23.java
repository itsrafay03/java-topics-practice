// Write a Java program to convert a decimal number into binary without using an array?
package forLoop;

import java.util.Scanner;

public class Question23 {
    static Scanner scanner = new Scanner(System.in);
    private long decimalNumber;

    public Question23() {
    }

    public Question23(long decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public void input(){
        System.out.print("Enter the Decimal number : ");
        setDecimalNumber(scanner.nextLong());
    }

    public long convertDecimalToBinary(){
        long Number;
        StringBuilder stringNumber = new StringBuilder();
        int length = 0;
        long binaryNumber;
//        while(getDecimalNumber() > 0){
//            Number = getDecimalNumber() % 2;
//            stringNumber.append(Number);
//            length++;
//            setDecimalNumber(getDecimalNumber() / 2);
//        }
        for (int i = (int) getDecimalNumber(); i>0 ; i = i/2) {
            Number = i % 2;
            stringNumber.append(Number);
            length++;
        }

        binaryNumber = Long.parseLong((reverseNumber(stringNumber.toString())));
//        while (lengthOfNumber(binaryNumber) != length){
//            binaryNumber *= 10;
//        }
        System.out.print("Binary : ");
        return binaryNumber;
    }


    public String reverseNumber(String number){
        long actualNumber = Long.parseLong((number));
        StringBuilder reverseNum = new StringBuilder();
        while (actualNumber > 0){
            reverseNum.append(actualNumber % 10);
            actualNumber /= 10;
        }
        return reverseNum.toString();
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

    public long getDecimalNumber() {
        return decimalNumber;
    }

    public void setDecimalNumber(long decimalNumber) {
        this.decimalNumber = decimalNumber;
    }


    public static void main(String[] args) {
        Question23 question23 = new Question23();
        question23.input();
        System.out.println(question23.convertDecimalToBinary());
    }
}



/*
        Question23 question23 = new Question23();
        question23.input();
        System.out.println(question23.convertDecimalToBinary());
 */