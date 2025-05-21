// Write a Java program that reads a set of integers, and then prints the sum of the
// even and odd integers?
package forLoop;

import java.util.Scanner;

public class Question34 {
    static Scanner scanner = new Scanner(System.in);
    private int number;
    private int limit;

    public Question34() {
    }

    public Question34(int number, int limit) {
        this.number = number;
        this.limit = limit;
    }

    public void input(){
        System.out.print("Enter how many numbers do you want to give input : ");
        setLimit(scanner.nextInt());
    }

    public void sumEvenOddNumbers(){
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 1; i <= getLimit(); i++) {
            System.out.print("Enter the number_"+i+" : ");
            setNumber(scanner.nextInt());
            if(getNumber() % 2 == 0){
                //System.out.println(getNumber()+"is even.");
                sumOfEven += getNumber();
            }else {
                //System.out.println(getNumber()+"is odd.");
                sumOfOdd += getNumber();
            }
        }
        System.out.println("Sum of the Even integers : "+sumOfEven+"\nSum of the Odd integers : "+sumOfOdd);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

/*
        Question34 question34 = new Question34();
        question34.input();
        question34.sumEvenOddNumbers();
 */