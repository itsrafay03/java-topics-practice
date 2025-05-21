// Write a Java program to read 10 numbers from keyboard and find their sum and average?
package whileLoop;

import java.util.Scanner;

public class Question7 {
    static Scanner scanner = new Scanner(System.in);
    int sum;
    float average;
    public static final int limit_of_numbers = 10;
    public String findSumAvg(){
        int digits;
        sum = 0;
        int noOfInput = 1;
        while (noOfInput <= limit_of_numbers){
            System.out.print("Enter number "+noOfInput+" : ");
            digits = scanner.nextInt();
            sum += digits;
            noOfInput++;
        }
        average = (float) sum /limit_of_numbers;
        return "The Sum of all entered numbers is : "+sum+" and their Average is : "+average;
    }
}

/*
        Question7 question7 = new Question7();
        System.out.println(question7.findSumAvg());
 */