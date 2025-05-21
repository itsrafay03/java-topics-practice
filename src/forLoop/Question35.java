// Write a Java program to enter the numbers till the user wants and at the end it
// should display the count of positive, negative and zeros entered.?
package forLoop;

import java.util.Scanner;

public class Question35 {

    static Scanner scanner = new Scanner(System.in);
    private int number;
    private int limit;

    public Question35() {
    }

    public Question35(int number, int limit) {
        this.number = number;
        this.limit = limit;
    }

    public void input(){
        System.out.print("Enter how many numbers do you want to give input : ");
        setLimit(scanner.nextInt());
    }

    public void countOfNumbers(){
        int positiveNum = 0;
        int negativeNum = 0;
        int zeros = 0;
        for (int i = 1; i <= getLimit(); i++) {
            System.out.print("Enter the number_"+i+" : ");
            setNumber(scanner.nextInt());
            switch (getNumber()){
                case 0:{
                    //System.out.println(getNumber()+"is zero.");
                    zeros++;
                }
                default:{
                    if(getNumber() > 0){
                        //System.out.println(getNumber()+"is positive.");
                        positiveNum++;
                    }else {
                        //System.out.println(getNumber()+"is negative.");
                        negativeNum++;
                    }
                }
            }
        }
        System.out.println("The count of positive numbers : "+positiveNum+"\nThe count of negative numbers : "+negativeNum+"\nThe count of zeros entered : "+zeros);
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
        Question35 question35 = new Question35();
        question35.input();
        question35.countOfNumbers();
 */