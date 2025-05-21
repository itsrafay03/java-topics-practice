// Write a Java program to find first and last digit of a number?
package doWhileLoop;

import java.util.Scanner;

public class Question13 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question13() {
    }

    public Question13(int number) {
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

    public void findFirstAndLastDigit(){
        int lastDigit;
        int firstDigit;
        checkNumber();
        int digits = getNumber();
        do{
            lastDigit = digits % 10;
            firstDigit = getNumber() % 10;
            setNumber(getNumber() / 10);
        } while(getNumber() > 0);
        System.out.println("First_digit of number : " + firstDigit);
        System.out.println("Last_digit of number : " + lastDigit);
    }



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
        question13.findFirstAndLastDigit();
 */