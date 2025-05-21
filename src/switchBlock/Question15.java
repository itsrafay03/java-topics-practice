// Write a java program to read any digit, display in the word ,up to 20?
package switchBlock;

import java.util.Scanner;

public class Question15 {
    static Scanner scanner = new Scanner(System.in);
    private byte digit;

    public Question15() {
    }

    public Question15(byte digit) {
        this.digit = digit;
    }

    public void input(){
        System.out.print("You can enter digits from 0 to 20 .\nEnter digit : ");
        setDigit(scanner.nextByte());
    }

    public String digit_in_words(){
        return switch (getDigit()){
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            case 11 -> "Eleven";
            case 12 -> "Twelve";
            case 13 -> "Thirteen";
            case 14 -> "Fourteen";
            case 15 -> "Fifteen";
            case 16 -> "Sixteen";
            case 17 -> "Seventeen";
            case 18 -> "Eighteen";
            case 19 -> "Nineteen";
            case 20 -> "Twenty";
            default -> "Invalid number.";
        };
    }



    public byte getDigit() {
        return digit;
    }

    public void setDigit(byte digit) {
        this.digit = digit;
    }
}

/*
        Question15 question15 = new Question15();
        question15.input();
        System.out.println(question15.digit_in_words());
 */