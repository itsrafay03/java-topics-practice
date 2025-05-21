// Write a Java program to display the first n terms of Fibonacci series?
package forLoop;

import java.util.Scanner;

public class Question19 {
    static Scanner scanner = new Scanner(System.in);
    private int limitOfTerm;

    // Default Constructor.
    public Question19() {
    }

    // Constructor Overloading.
    public Question19(int limitOfTerm) {
        this.limitOfTerm = limitOfTerm;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the limit of terms of Fibonacci series you want : ");
        setLimitOfTerm(scanner.nextInt());
    }

    // Method to display Fibonacci Series up till given number of terms.
    public void printFibonacciSeries() {
        int previousNum = 0;
        int currentNum = 1;
        int sum;
        System.out.println("The first " + getLimitOfTerm() + " terms of Fibonacci Series are : ");
        switch (getLimitOfTerm()) {
            case 1:
                System.out.println(previousNum);
                break;
            case 2: {
                System.out.print(previousNum + ", ");
                System.out.print(currentNum);
                break;
            }
            default: {
                System.out.print(previousNum + ", ");
                System.out.print(currentNum + ", ");
                for (int term = 3; term <= getLimitOfTerm(); term++) {
                    sum = previousNum + currentNum;
                    System.out.print(sum + ", ");
                    previousNum = currentNum;
                    currentNum = sum;
                }
                System.out.print("\b\b");
            }
        }
    }



    // Getter Setter.
    public int getLimitOfTerm() {
        return limitOfTerm;
    }

    // There is Abstraction that limit must be greater than '0'. So we apply this in Setter.
    public void setLimitOfTerm(int limitOfTerm) {
        if(limitOfTerm > 0){
            this.limitOfTerm = limitOfTerm;
        }else{
            System.out.println("Invalid input.");
            input();
        }
    }
}

/*
        Question19 question19 = new Question19();
        question19.input();
        question19.printFibonacciSeries();
 */