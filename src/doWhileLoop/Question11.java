// Write a Java program to display the n terms of odd natural number and their sum?
package doWhileLoop;

import java.util.Scanner;

public class Question11 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question11() {
    }

    public Question11(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the limit of Natural numbers to display and sum : ");
        setNumber(scanner.nextInt());
    }
    public void oddNaturalNumbersSum(){
        int oddNumber = 1;
        int sum = 0;
        int CONSTANT_OF_ODD_NUMBER = 2;
        do{
            //oddNumber = count + CONSTANT_OF_ODD_NUMBER;
            System.out.println(oddNumber);
            sum += oddNumber;
            oddNumber = oddNumber+ CONSTANT_OF_ODD_NUMBER;
        } while(oddNumber <= (CONSTANT_OF_ODD_NUMBER *getNumber()));
        System.out.println("Sum : " + sum);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question11 question11 = new Question11();
        question11.input();
        question11.oddNaturalNumbersSum();
 */