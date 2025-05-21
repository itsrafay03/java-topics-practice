//Write a Java program to find the sum of the series 1 +11 + 111 + 1111 + .. n terms?
package forLoop;

import java.util.Scanner;

public class Question16 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    // Default Constructor.
    public Question16() {
    }

    //Constructor Overloading.
    public Question16(int number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the number of terms of series you want : ");
        setNumber(scanner.nextInt());
    }

    // Method to display the sum of the series [ 1 +11 + 111 + 1111 + ... n].
    public long printSumOfSeries(){
        long term = 1;
        long sum = 1;
        System.out.println(term);
        for (int i = 1; i < getNumber(); i++) {

            term += (long) Math.pow(10,i);
            System.out.println(term);
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
        Question16 question16 = new Question16();
        question16.input();
        System.out.println(question16.printSumOfSeries());
 */