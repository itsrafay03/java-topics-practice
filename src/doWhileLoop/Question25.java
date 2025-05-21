// Write a Java program to check whether a number is Armstrong number or not?
package doWhileLoop;

import java.util.Scanner;

public class Question25 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question25() {
    }

    public Question25(int number) {
        this.number = number;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public void input() {
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public int lengthOfNumber(){
        int actualNumber = getNumber();
        int length = 0;
        int digits;
        do{
            digits = actualNumber%10;
           length++;
           actualNumber /= 10;
        } while(actualNumber>0);
        return length;
    }
    public void checkArmstrongNumber() {
        int actualNumber = getNumber();
        int length;
        int digit;
        int power;
        int sumOfPowers = 0;
        do {
            digit = actualNumber % 10;
            length = lengthOfNumber();
            power = 1;
            do {
                power *= digit;
                length--;
            } while(length >= 1);
            sumOfPowers += power;
            actualNumber /= 10;

        } while(actualNumber > 0);

        if(getNumber() == sumOfPowers){
            System.out.println("Yes, "+getNumber()+" is an Armstrong Number.");
        }else{
            System.out.println("No, "+getNumber()+" is not an Armstrong Number.");
        }
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question25 question25 = new Question25();
        question25.input();
        question25.checkArmstrongNumber();
 */