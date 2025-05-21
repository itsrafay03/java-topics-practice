// Write a Java program to count number of digits in a number?
package doWhileLoop;

import java.util.Scanner;

public class Question12 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question12() {
    }

    public Question12(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public void checkNumber(){
        if(getNumber() < 0){
            setNumber(-getNumber());
        }else{
            setNumber(getNumber());
        }
    }

    public void countDigitsOfNumber(){
        int digit;
        int countDigit = 0;
        checkNumber();
        do{
            digit = getNumber() % 10;
            countDigit++;
            setNumber(getNumber() / 10);
        } while(getNumber() > 0);
        System.out.println("Entered number has "+countDigit+" digits.");
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question12 question12 = new Question12();
        question12.input();
        question12.countDigitsOfNumber();
 */