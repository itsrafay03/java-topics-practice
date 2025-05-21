// Write a Java program to find the sum of the series [ 1-X^2/2! +X^4/4! - .........]?
package forLoop;

import java.util.Scanner;

public class Question10 {
    static Scanner scanner = new Scanner(System.in);
    private int valueOfx;
    private int limit;

    // Default Constructor.
    public Question10() {
    }

    //Constructor Overloading.
    public Question10(int valueOfx, int limit) {
        this.valueOfx = valueOfx;
        this.limit = limit;
    }


    // Input Method.
    public void input(){
        System.out.print("The series is [ 1-X^2/2! +X^4/4! - .........].\nEnter value of 'x' : ");
        setValueOfx(scanner.nextInt());
        System.out.print("Enter the number of terms of series you want : ");
        setLimit(scanner.nextInt());
    }

    // Method to display the sum of the series [ 1-X^2/2! +X^4/4! - .........].
    public double printSumOfSeries(){
        double valueOfTerm;
        double sumOfTerm = 1;
        int termConstant = 2;
        for (int term = 2; term <= getLimit(); term++) {
            if(term%2 == 0){
                valueOfTerm = -((double) power(getValueOfx(), termConstant) / factorial(termConstant));
            }else{
                valueOfTerm = (double) power(getValueOfx(), termConstant) / factorial(termConstant);
            }
            System.out.println("Value of "+term+" term : "+valueOfTerm);
            sumOfTerm += valueOfTerm;
            termConstant +=2;
        }
        System.out.print("The Sum of "+getLimit()+" terms of series is : ");
        return sumOfTerm;
    }


    // Method to calculate the Factorial of any number.
    public static int factorial(int number){
        int count = 1;
        int factorial = 1;
        while(count <= number){
            factorial *= count;
            count++;
        }
        return factorial;
    }

    // Method to calculate the Power of any number.
    public static int power(int base, int power){
        int count = 1;
        int calculate = 1;
        while(count <= power){
            calculate *= base;
            count++;
        }
        return calculate;
    }



    // Getters Setters.
    public int getValueOfx() {
        return valueOfx;
    }

    public void setValueOfx(int valueOfx) {
        this.valueOfx = valueOfx;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

/*
        Question10 question10 = new Question10();
        question10.input();
        System.out.println(question10.printSumOfSeries());
 */