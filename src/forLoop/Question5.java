// Write a Java program to display the cube of the number up to given an integer?
package forLoop;

import java.util.Scanner;

public class Question5 {
    static Scanner scanner = new Scanner(System.in);
    private int count;

    // Default Constructor.
    public Question5() {
    }

    // Constructor Overloading.
    public Question5(int count) {
        this.count = count;
    }

    // Input Method.
    private void input(){
        System.out.print("Enter the limit of numbers up to which you want to find the cube: ");
        setCount(scanner.nextInt());
    }

    // Method to calculate the Cube of numbers.
    public void calculateCubeOfNumbers(){
        input();
        int cube;
        for (int i = 1; i <= getCount(); i++) {
            cube = (i * i * i);
            System.out.println("The Cube of "+i+" is "+cube);
        }
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
        Question5 question5 = new Question5();
        question5.calculateCubeOfNumbers();
 */