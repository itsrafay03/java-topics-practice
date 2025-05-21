// Write a Java program to check whether a given number is even or odd?

package ifElse;

import java.util.Scanner;

public class Question2 {
    static Scanner scanner = new Scanner(System.in);
    private int enterNumber;

    // Default Constructor.
    public Question2(){

    }
    // Method Overloading.
    public Question2(int enterNumber){
        this.enterNumber = enterNumber;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the Number : ");
        setEnterNumber(scanner.nextInt());
    }

    // Method to check that number is even or odd.
    public void evenOddChecker(){
        System.out.println("The number you entered is "+getEnterNumber());
        if((getEnterNumber() % 2) == 0){
            {
                System.out.printf("%d is an Even Number.",getEnterNumber());
            }
        }else {
            {
                System.out.printf("%d is an Odd Number.",getEnterNumber());
            }
        }
    }


    // Getters Setters.
    public int getEnterNumber() {
        return enterNumber;
    }

    public void setEnterNumber(int enterNumber) {
        this.enterNumber = enterNumber;
    }
}

/*
        Question2 question2 = new Question2();
        question2.input();
        question2.evenOddChecker();
 */

