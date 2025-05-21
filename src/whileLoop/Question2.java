// Write a Java program to find the sum of first 10 natural numbers?
package whileLoop;

import java.util.Scanner;

public class Question2 {
    static Scanner scanner = new Scanner(System.in);

    private int limit;

    public Question2() {
    }

    public Question2(int limit) {
        this.limit = limit;
    }

    public void input(){
        System.out.print("How many Natural number's Sum do you want to display : ");
        setLimit(scanner.nextInt());
    }
    public int displaySum(){
        int startingLimit = 1;
        int sum = 0;
        while (startingLimit<=getLimit()){
            sum += startingLimit ;
            startingLimit++;
        }
        System.out.print("Sum of first "+getLimit()+" natural numbers is ");
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
        Question2 question2 = new Question2();
        question2.input();
        System.out.println(question2.displaySum());
 */