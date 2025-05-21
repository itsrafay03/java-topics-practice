// Write a java program to check whether a number is divisible by 5 and 11 or not?
package ifElse;

import java.util.Scanner;

public class Question30 {
    static Scanner scanner = new Scanner(System.in);
    private int number;
    public static final int divisor1 = 5;
    public static final int divisor2 = 11;

    // Default Constructor.
    public Question30() {
    }

    // Constructor Overloading.
    public Question30(int number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your Number : ");
        setNumber(scanner.nextInt());
    }

    // Method to check that number id divisible by 5 and 11 or not.
    public void checkDivisible(){
        if((getNumber()%divisor1==0) && (getNumber()%divisor2==0)){
            {
                System.out.println("Yes. Your number is divisible by both 5 and 11.");
            }
        }else{
            {
                if(getNumber()%divisor1 == 0){
                    {
                        System.out.println("Your number is only divisible by 5.");
                    }
                } else if (getNumber()%divisor2 == 0) {
                    {
                        System.out.println("Your number is only divisible by 11.");
                    }
                }else {
                    {
                        System.out.println("Sorry. Your number is neither divisible by 5 nor divisible by 11.");
                    }
                }
            }
        }
    }


    // Getters Setters.
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number>=0){
            {
                this.number = number;
            }
        }else{
            {
                System.out.println("Wrong input. Enter any correct positive number.");
            }
        }
    }
}

/*
        Question30 question30 = new Question30();
        question30.input();
        question30.checkDivisible();
 */