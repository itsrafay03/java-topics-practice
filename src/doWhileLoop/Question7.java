// Write a Java program to display n terms of natural number and their sum?
package doWhileLoop;

import java.util.Scanner;

public class Question7 {
    static Scanner scanner = new Scanner(System.in);
    private long number;

    public Question7() {
    }

    public Question7(long number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter how many Natural numbers do you want to sum : ");
        setNumber(scanner.nextInt());
    }

    public int displayNumbersAndSum(){
        System.out.println("The first "+getNumber()+" Natural numbers are : ");
        int count = 1;
        int sum = 0;
        do{
            sum += count;
            System.out.println(count);
            count++;
        } while(count <= getNumber());
        System.out.print("Sum : ");
        return sum;
    }



    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}

/*
        Question7 question7 = new Question7();
        question7.input();
        System.out.println(question7.displayNumbersAndSum());
 */
