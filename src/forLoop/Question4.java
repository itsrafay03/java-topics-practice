// Write a Java program to read 10 numbers from keyboard and find their sum and average?
package forLoop;

import java.util.Scanner;

public class Question4 {
    static Scanner scanner = new Scanner(System.in);
    public static final int LIMIT_OF_COUNTS = 10;

    // private method to take 10 inputs and calculate their Sum.
    private int inputAndSum(){
        int number;
        int sum = 0;
        for (int i = 1; i <= LIMIT_OF_COUNTS; i++) {
            System.out.print("Enter the number_"+i+" : ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.print("Sum of entered numbers : ");
        return sum;
    }

    // Method to find Average by using the inputAndSum() method which gives us sum of inputs.
    public float calculateSumAndAverage(){
        int addition = inputAndSum();
        System.out.println(addition);
        System.out.print("Average of entered numbers : ");
        return (float) addition / LIMIT_OF_COUNTS;
    }
}

/*
        Question4 question4 = new Question4();
        System.out.println(question4.calculateSumAndAverage());
 */