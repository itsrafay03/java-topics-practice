// Write a Java program to display n terms of natural number and their sum?
package forLoop;

import java.util.Scanner;

public class Question3 {
    static Scanner scanner = new Scanner(System.in);
    private int count;

    // Default Constructor.
    public Question3() {
    }

    // Constructor Overloading.
    public Question3(int count) {
        this.count = count;
    }

    // Input Method.
    private void input(){
        System.out.print("Enter the limit of Natural numbers you want : ");
        setCount(scanner.nextInt());
    }

    // Method to Display n terms of natural number and then find their Sum.
    public int displayAndSumNaturalNumbers(){
        input();
        int sum = 0;
        for (int i = 1; i <= getCount(); i++) {
            System.out.print(i+", ");
            sum += i;
        }
        System.out.print("\nThe sum of first "+getCount()+" Natural numbers is : ");
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
        Question3 question3 = new Question3();
        System.out.println(question3.displayAndSumNaturalNumbers());
 */