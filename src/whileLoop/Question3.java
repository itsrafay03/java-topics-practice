// Write a Java program to display n terms of natural number and their sum?
package whileLoop;

import java.util.Scanner;

public class Question3 {
    static Scanner scanner = new Scanner(System.in);

    private int limit;

    public Question3() {
    }

    public Question3(int limit) {
        this.limit = limit;
    }

    private void input(){
        System.out.print("How many Natural number's Sum do you want to display : ");
        setLimit(scanner.nextInt());
        System.out.println("The Natural numbers are : ");
    }
    private int displaySum(){
        int startingLimit = 1;
        int sum = 0;
        while (startingLimit<=getLimit()){
            sum += startingLimit ;
            System.out.println(startingLimit);
            startingLimit++;
        }
        System.out.print("Sum of first "+getLimit()+" natural numbers is ");
        return sum;
    }

    public void output(){
        input();
        System.out.println(displaySum());
    }


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

/*
        Question3 question3 = new Question3();
        question3.output();
 */