/*
Write a java program to print absolute value of a number entered by user. e.g.,
INPUT: 1 OUTPUT: 1
INPUT: -1 OUTPUT: 1
 */
package ifElse;

import java.util.Scanner;

public class Question13 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    // Default Constructor.
    public Question13() {
    }

    // Constructor Overloading.
    public Question13(int number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter any number : ");
        setNumber(scanner.nextInt());
    }

    // Method to calculate Absolute value.
    public void absoluteValue(){
        if(getNumber() >= 0){
            {
                System.out.print("Output: "+getNumber());
            }
        }else{
            {
                System.out.print("Output: "+(-getNumber()));
            }
        }
    }


    // Getters Setters.
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question13 question13 = new Question13();
        question13.input();
        question13.absoluteValue();
 */