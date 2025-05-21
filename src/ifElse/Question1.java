// Write a Java program to accept two integers and check whether they are equal or not?

package ifElse;

import java.util.Scanner;

public class Question1 {
    static Scanner scanner = new Scanner(System.in);
    private int first_Num;
    private int second_Num;

    // Default Constructor.
    public Question1() {
    }
    // Constructor Overloading.
    public Question1(int first_Num, int second_Num) {
        this.first_Num = first_Num;
        this.second_Num = second_Num;
    }

    // Input Method.
    public void inputs(){
        System.out.print("Enter first_Number : ");
        setFirst_Num(scanner.nextInt());
        System.out.print("Enter second_Number : ");
        setSecond_Num(scanner.nextInt());
    }
    // Method to check Equality of both entered Numbers.
    public void equalityCheck(){
        System.out.printf("Your first_number is %d and your second_number is %d", getFirst_Num(),getSecond_Num());
        if(getFirst_Num() == getSecond_Num()){
            {
                System.out.print("\nWell Done. Your entered numbers are Equal.");
            }
        }else{
            {
                System.out.print("\nOops! Your entered numbers are not Equal.");
            }
        }
    }


    //Getters Setters.
    public int getFirst_Num() {
        return first_Num;
    }

    public void setFirst_Num(int first_Num) {
        this.first_Num = first_Num;
    }

    public int getSecond_Num() {
        return second_Num;
    }

    public void setSecond_Num(int second_Num) {
        this.second_Num = second_Num;
    }
}


/*
        Question1 question1 = new Question1();
        question1.inputs();
        question1.equalityCheck();
 */
