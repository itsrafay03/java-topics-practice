// Write a Java program to display the cube of the number up to given an integer?
package doWhileLoop;

import java.util.Scanner;

public class Question9 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question9() {
    }

    public Question9(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the limit upto which you want to find the cube of numbers : ");
        setNumber(scanner.nextInt());
    }

    public void calculateCube(){
        int count = 1;
        int cube;
        do{
            cube = (count*count*count);
            System.out.println("The cube of "+count+" is "+cube);
            count++;
        } while(count <= getNumber());
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question9 question9 = new Question9();
        question9.input();
        question9.calculateCube();
 */