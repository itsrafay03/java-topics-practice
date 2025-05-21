// Write a Java program to convert a binary number into a decimal number without
// using array, function and while loop?
package forLoop;

import java.util.Scanner;

public class Question24 {
    private long binaryNumber;
    static Scanner scanner = new Scanner(System.in);

    public Question24() {
    }

    public Question24(long binaryNumber) {
        this.binaryNumber = binaryNumber;
    }

    public void input(){
        System.out.print("Enter the Binary number : ");
        setBinaryNumber(scanner.nextLong());
    }

    public long convertBinaryToDecimal(){
        int decimalNumber = 0;
        int digit;
        long actualNumber = getBinaryNumber();
        for (int i = 1; i <= lengthOfNumber(actualNumber); i++) {
            digit = (int) (getBinaryNumber() % 10);
            decimalNumber += (digit * power(2,(i-1)));
            setBinaryNumber(getBinaryNumber() / 10);
        }
        System.out.print("Decimal : ");
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


    public long getBinaryNumber() {
        return binaryNumber;
    }

    public void setBinaryNumber(long binaryNumber) {
        this.binaryNumber = binaryNumber;
    }
}

/*
        Question24 question24 = new Question24();
        question24.input();
        System.out.println(question24.convertBinaryToDecimal());
 */