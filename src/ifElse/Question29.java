// Write a java program to check whether a number is negative, positive or zero?
package ifElse;

import java.util.Scanner;

public class Question29 {
    static Scanner scanner = new Scanner(System.in);
    private double number;

    // Default Constructor.
    public Question29() {
    }

    // Constructor Overloading.
    public Question29(double number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your number : ");
        setNumber(scanner.nextDouble());
    }

    // Method to check the number type.
    public void numberType(){
        if(getNumber() == 0){
            {
                System.out.println("It is Zero.");
            }
        }else{
            {
                if(getNumber() > 0){
                    {
                        System.out.println("It is Positive Number.");
                    }
                }else {
                    {
                        System.out.println("It is Negative Number.");
                    }
                }
            }
        }
    }


    // Getters Setters.
    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}

/*
        Question29 question29 = new Question29();
        question29.input();
        question29.numberType();
 */