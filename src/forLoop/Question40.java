// Write a Java program that prompts the user to input a positive integer. It should
// then output a message indicating whether the number is a prime number?
package forLoop;

import java.util.Scanner;

public class Question40 {
    static Scanner scanner = new Scanner(System.in);
    private int number;


    public Question40() {
    }

    public Question40(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter a positive integer : ");
        setNumber(scanner.nextInt());
    }

    public void checkPrimeNumber() {
        for (int digit = 2; digit <= getNumber(); digit++) {
            if (getNumber() % digit == 0) {
                if (getNumber() == digit) {
                    System.out.println(getNumber() + " is a Prime number.");
                } else {
                    System.out.println(getNumber() + " is not a Prime number.");
                    break;
                }
            }
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
        Question40 question40 = new Question40();
        question40.input();
        question40.checkPrimeNumber();
 */