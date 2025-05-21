// Write a Java program to find all factors of a number?
package doWhileLoop;

import java.util.Scanner;

public class Question23 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question23() {
    }

    public Question23(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }


    public void findFactorsOfNumber(){
        int digit = 1;
        int factor;
        System.out.println("Factors of "+getNumber()+" are : ");
        do{
            factor = getNumber() % digit;
            if(factor == 0){
                System.out.println(digit);
            }
            digit++;
        } while(digit <= getNumber());
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question23 question23 = new Question23();
        question23.input();
        question23.findFactorsOfNumber();
 */
