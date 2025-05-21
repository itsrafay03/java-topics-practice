// Write a java program to print number between 1 to 10 in character format using switch-case?
package switchBlock;

import java.util.Scanner;

public class Question10 {
    static Scanner scanner = new Scanner(System.in);
    private byte number;

    public Question10() {
    }

    public Question10(byte number) {
        this.number = number;
    }

    public void input(){
        System.out.print("You can enter any number between 0 to 10.\nEnter the number : ");
        setNumber(scanner.nextByte());
    }

    public String number_in_words(){
        return switch (getNumber()){
            case 0 -> "Zero.";
            case 1 -> "One.";
            case 2 -> "Two.";
            case 3 -> "Three.";
            case 4 -> "Four.";
            case 5 -> "Five.";
            case 6 -> "Six.";
            case 7 -> "Seven.";
            case 8 -> "Eight.";
            case 9 -> "Nine.";
            default -> "invalid number.";
        };
    }



    public byte getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }
}

/*
        Question10 question10 = new Question10();
        question10.input();
        System.out.println("The number is "+question10.number_in_words());
 */