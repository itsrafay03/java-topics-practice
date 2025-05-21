// Write a Java program to find the sum of the series [ x +x^3 + x^5 + ......]?
package forLoop;

import java.util.Scanner;

import static forLoop.Question13.power;

public class Question14 {
    static Scanner scanner = new Scanner(System.in);
    private int valueOfx;
    private int limit;

    // Default Constructor.
    public Question14() {
    }

    //Constructor Overloading.
    public Question14(int valueOfx, int limit) {
        this.valueOfx = valueOfx;
        this.limit = limit;
    }


    // Input Method.
    public void input(){
        System.out.print("The series is [ x +x^3 + x^5 + ......].\nEnter value of 'x' : ");
        setValueOfx(scanner.nextInt());
        System.out.print("Enter the number of terms of series you want : ");
        setLimit(scanner.nextInt());
    }


    // Method to display the sum of the series [ x +x^3 + x^5 + ......].
    public long printSumOfSeries(){
        long valueOfTerm;
        long sumOfTerm = 0;
        for (int term = 1; term <= (2*getLimit()); term+=2) {
            valueOfTerm = power(getValueOfx(), term);
            System.out.println(valueOfTerm);
            sumOfTerm += valueOfTerm;
        }
        System.out.print("The Sum of "+getLimit()+" terms of series is : ");
        return sumOfTerm;
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
        Question14 question14 = new Question14();
        question14.input();
        System.out.println(question14.printSumOfSeries());
 */