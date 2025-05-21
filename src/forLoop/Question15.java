// Write a Java program to display the n terms of square natural number and their sum?
package forLoop;

import java.util.Scanner;

public class Question15 {
    static Scanner scanner = new Scanner(System.in);
    private int count;

    // Default Constructor.
    public Question15() {
    }

    // Constructor Overloading.
    public Question15(int count) {
        this.count = count;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the limit of Square Natural numbers you want : ");
        setCount(scanner.nextInt());
    }

    // Method to Display Square of n terms of natural number and then find their Sum.
    public long displaySquareNaturalNumbersWithSum(){
        long square;
        long sum = 0;
        for (int i = 1; i <= getCount(); i++) {
            square = (long) i *i;
            System.out.println(i+"^2 = "+square);
            sum += square;
        }
        System.out.print("The sum of Squares : ");
        return sum;
    }


    // Getters Setters.
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

/*
        Question15 question15 = new Question15();
        question15.input();
        System.out.println(question15.displaySquareNaturalNumbersWithSum());
 */