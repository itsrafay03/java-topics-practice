// Write a Java program to convert a binary number to octal?
package forLoop;

import java.util.Scanner;

public class Question27 {
    private long binaryNumber;
    static Scanner scanner = new Scanner(System.in);

    public Question27() {
    }

    public Question27(long binaryNumber) {
        this.binaryNumber = binaryNumber;
    }

    public void input(){
        System.out.print("Enter the Binary number : ");
        setBinaryNumber(scanner.nextLong());
    }

    public long convertBinaryToOctal(){
        long Number;
        int length = 0;
        long binaryNumber;
        long decimalNumber = convertBinaryToDecimal();
        StringBuilder stringNumber = new StringBuilder();
//        while(decimalNumber > 0){
//            Number = decimalNumber % 8;
//            stringNumber.append(Number);
//            length++;
//            decimalNumber /= 8;
//        }
        for (int i = (int) decimalNumber; i>0; i = i/8) {
            Number = decimalNumber % 8;
            stringNumber.append(Number);
            length++;
        }

        binaryNumber = Long.parseLong((reverseNumber(stringNumber.toString())));
        while (lengthOfNumber(binaryNumber) != length){
            binaryNumber *= 10;
        }
        System.out.print("Octal : ");
        return binaryNumber;
    }


    private long convertBinaryToDecimal(){
        int decimalNumber = 0;
        int digit;
        long actualNumber = getBinaryNumber();
        for (int i = 1; i <= lengthOfNumber(actualNumber); i++) {
            digit = (int) (getBinaryNumber() % 10);
            decimalNumber += (digit * power(2,(i-1)));
            setBinaryNumber(getBinaryNumber() / 10);
        }
        //System.out.print("Decimal : ");
        return decimalNumber;
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


    // Method to calculate the Power of any number.
    private static int power(int base, int power){
        int calculate = 1;
        while(power >= 1){
            calculate *= base;
            power--;
        }
        return calculate;
    }


    // Method to calculate the Reverse of any number.
    private String reverseNumber(String number){
        long actualNumber = Long.parseLong((number));
        StringBuilder reverseNum = new StringBuilder();
        while (actualNumber > 0){
            reverseNum.append(actualNumber % 10);
            actualNumber /= 10;
        }
        return reverseNum.toString();
    }

    public long getBinaryNumber() {
        return binaryNumber;
    }

    public void setBinaryNumber(long binaryNumber) {
        this.binaryNumber = binaryNumber;
    }

    public static void main(String[] args) {
        Question27 question27 = new Question27();
        question27.input();
        System.out.println(question27.convertBinaryToOctal());
    }

}

/*
        Question27 question27 = new Question27();
        question27.input();
        System.out.println(question27.convertBinaryToOctal());
 */