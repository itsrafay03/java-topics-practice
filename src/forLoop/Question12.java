// Write a Java program to display the sum of the series [ 9 + 99 + 999 + 9999 ...]?
package forLoop;

import java.util.Scanner;

public class Question12 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    // Default Constructor.
    public Question12() {
    }

    //Constructor Overloading.
    public Question12(int number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the number of terms of series you want : ");
        setNumber(scanner.nextInt());
    }

    // Method to display the sum of the series [ 9 + 99 + 999 + 9999 ...].
    public long printSumOfSeries(){
        long term;
        long sum = 0;
        for (int i = 1; i <= getNumber(); i++) {
            term = (long) (Math.pow(10,i)-1);
            //System.out.println(term);
            sum += term;
        }
        System.out.print("\nSum of first "+getNumber()+" terms of series is : ");
        return sum;
    }


    // Getters Setters.
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
        System.out.println(question12.printSumOfSeries());
 */

