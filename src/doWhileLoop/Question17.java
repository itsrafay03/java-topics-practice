// Write a Java program to calculate product of digits of a number?
package doWhileLoop;

import java.util.Scanner;

public class Question17 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question17() {
    }

    public Question17(int number) {
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

    public void productOfDigitsOfNumber(){
        int product = 1;
        int digit;
        checkNumber();
        do{
            digit = getNumber() % 10;
            product *= digit;
            setNumber(getNumber() / 10);
        } while(getNumber() > 0);
        System.out.println("The product of digits of entered number is : "+ product);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question17 question17 = new Question17();
        question17.input();
        question17.productOfDigitsOfNumber();
 */
