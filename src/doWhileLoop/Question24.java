// Write a Java program to check whether a number is Strong number or not?
package doWhileLoop;

import java.util.Scanner;

public class Question24 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question24() {
    }

    public Question24(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }


    public void checkStrongNumber(){
        int actualNumber = getNumber();
        int digit;
        int product;
        int end_Limit;
        int sumOfFactorials = 0;
        do{
            digit = getNumber() % 10;
            product = 1;
            end_Limit = 1;
            while (end_Limit<=digit){
                product *= end_Limit;
                end_Limit++;
            }
            sumOfFactorials += product;
            setNumber(getNumber()/10);
        } while(getNumber() > 0);
        System.out.println("Sum of factorials : "+sumOfFactorials);
        if(actualNumber == sumOfFactorials){
            System.out.println("Yes, "+actualNumber+" is a Strong Number.");
        }else{
            System.out.println("No, "+actualNumber+" is not a Strong Number.");
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
        Question24 question24 = new Question24();
        question24.input();
        question24.checkStrongNumber();
 */