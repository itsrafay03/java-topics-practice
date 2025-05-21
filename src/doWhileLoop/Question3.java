/*
Write a Java program that prompts the user to input an integer and then outputs the
number with the digits reversed. For example, if the input is 12345, the output
should be 54321?
 */
package doWhileLoop;

import java.util.Scanner;

public class Question3 {
    static Scanner scanner = new Scanner(System.in);
    private long number;
    private final int CONSTANT_OPERAND = 10;
    private final int LOWEST_LIMIT = 0;

    public Question3() {
    }

    public Question3(long number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the Number : ");
        setNumber(scanner.nextInt());
    }

    private void reverseTheNumber(){
        long currentNum;
        do{
            currentNum = getNumber() % CONSTANT_OPERAND;
            System.out.print(currentNum);
            setNumber(getNumber() / CONSTANT_OPERAND);
        } while (getNumber() > LOWEST_LIMIT);
    }


    public void displayReverseNumber(){
        if(getNumber() < LOWEST_LIMIT){
            setNumber(-getNumber());
            System.out.print("Reverse : -");
            reverseTheNumber();
        }else {
            System.out.print("Reverse : ");
            reverseTheNumber();
        }
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}

/*
        Question3 question3 = new Question3();
        question3.input();
        question3.displayReverseNumber();
 */