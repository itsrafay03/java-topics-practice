// Write a Java program to display the n terms of odd natural number and their sum?
package forLoop;

import java.util.Scanner;

public class Question8 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    // Default Constructor.
    public Question8() {
    }

    //Constructor Overloading.
    public Question8(int number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter number for n terms of odd natural number : ");
        setNumber(scanner.nextInt());
    }

    // Method to display the n terms of odd natural numbers with their Sum.
    public int displayOddNumbersWithSum(){
        System.out.println("The first "+getNumber()+" Odd natural numbers are as following : ");
        int sum = 0;
        for (int i = 1; i <= (2*getNumber()); i += 2) {
            System.out.print(i+", ");
            sum += i;
        }
        System.out.print("\nThe Sum of first "+getNumber()+" Odd natural numbers is : ");
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
        Question8 question8 = new Question8();
        question8.input();
        System.out.println(question8.displayOddNumbersWithSum());
 */