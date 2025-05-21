// Write a Java program to read 10 numbers from keyboard and find their sum and average?
package doWhileLoop;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Question8 {
    static Scanner scanner = new Scanner(System.in);
    private static final int LIMIT_OF_NATURAL_NUMBER = 10;


//    public int calculateSum(){
//        int sum = 0;
//        int input_number = 1;
//        do{
//            System.out.print("Enter your Number"+input_number+" : ");
//            int number = scanner.nextInt();
//            sum += number;
//            input_number++;
//        } while(input_number <= 10);
//        System.out.println("Sum : ");
//        return sum;
//    }
//    public int calculateAverage() {
//        int average;
//        average = calculateSum() / LIMIT_OF_NATURAL_NUMBER;
//        System.out.println("Average : ");
//        return average;
//    }


    public void calculateSumAndAverage(){
        float average;
        int sum = 0;
        int input_number = 1;
        do{
            System.out.print("Enter your Number_"+input_number+" : ");
            int number = scanner.nextInt();
            sum += number;
            input_number++;
        } while(input_number <= 10);
        System.out.println("Sum : "+sum);
        average = (float) sum / LIMIT_OF_NATURAL_NUMBER;
        System.out.println("Average : "+average);
    }
}

/*
        Question8 question8 = new Question8();
        question8.calculateSumAndAverage();
 */
