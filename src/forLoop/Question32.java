// Write a Java program to find the factorial value of any number entered through the
// keyboard?
package forLoop;

import java.util.Scanner;

public class Question32 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question32() {
    }

    public Question32(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public long calculateFactorial(){
        long factorial = 1;
        for (int num = 1; num <= getNumber(); num++) {
            factorial *= num;
        }
        System.out.print("The Factorial of "+getNumber()+" is : ");
        return factorial;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question32 question32 = new Question32();
        question32.input();
        System.out.println(question32.calculateFactorial());
 */