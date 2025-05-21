// Write a Java program to display the n terms of odd natural number and their sum?
package whileLoop;

import java.util.Scanner;

public class Question4 {
    static Scanner scanner = new Scanner(System.in);
    private static final int oddNumConstant = 2;

    private int limit;

    public Question4() {
    }

    public Question4(int limit) {
        this.limit = limit;
    }

    public void input() {
        System.out.print("How many Odd Natural number's Sum do you want to display : ");
        setLimit(scanner.nextInt());
        System.out.println("The Odd Natural numbers are : ");
    }

    public int displayOddSum() {
        int startingLimit = 1;
        int sum = 0;
        while (startingLimit <= (oddNumConstant * getLimit())) {
            sum += (startingLimit);
            System.out.println(startingLimit);
            startingLimit += oddNumConstant;
        }
        System.out.print("Sum of first " + getLimit() + " Odd natural numbers is ");
        return sum;
    }


    public int getLimit() {
        return limit;

    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}

/*
        Question4 question4 = new Question4();
        question4.input();
        System.out.println(question4.displayOddSum());
 */