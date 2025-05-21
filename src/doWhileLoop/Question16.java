// Write a Java program to calculate sum of digits of a number?
package doWhileLoop;

import java.util.Scanner;

public class Question16 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question16() {
    }

    public Question16(int number) {
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

    public void sumOfDigitsOfNumber(){
        int sum = 0;
        int digit;
        checkNumber();
        do{
            digit = getNumber() % 10;
            sum += digit;
            setNumber(getNumber() / 10);
        } while(getNumber() > 0);
        System.out.println("The sum of digits of entered number is : "+sum);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question16 question16 = new Question16();
        question16.input();
        question16.sumOfDigitsOfNumber();
 */