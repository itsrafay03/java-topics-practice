// Write a Java program to enter a number and print its reverse without using String?
package whileLoop;

import java.util.Scanner;

public class Question20 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question20() {
    }

    public Question20(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public void reverseDigits(){
        int digits;
        while(getNumber()>0){
            digits = getNumber()%10;
            System.out.print(digits);
            setNumber(getNumber()/10);
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
        Question20 question20 = new Question20();
        question20.input();
        question20.reverseDigits();
 */