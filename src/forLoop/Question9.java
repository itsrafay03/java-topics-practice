// Write a Java program to display the n terms of even natural number and their sum?
package forLoop;

import java.util.Scanner;

public class Question9 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    // Default Constructor.
    public Question9() {
    }

    //Constructor Overloading.
    public Question9(int number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter number for n terms of Even natural number : ");
        setNumber(scanner.nextInt());
    }

    // Method to display the n terms of Even natural numbers with their Sum.
    public int displayEvenNumbersWithSum(){
        System.out.println("The first "+getNumber()+" Even natural numbers are as following : ");
        int sum = 0;
        for (int i = 2; i <= (2*getNumber()); i += 2) {
            System.out.print(i+", ");
            sum += i;
        }
        System.out.print("\nThe Sum of first "+getNumber()+" Even natural numbers is : ");
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
        Question9 question9 = new Question9();
        question9.input();
        System.out.println(question9.displayEvenNumbersWithSum());
 */