// Write a Java program to display the multiplication table of a given integer?
package forLoop;

import java.util.Scanner;

public class Question6 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    // Default Constructor.
    public Question6() {
    }

    //Constructor Overloading.
    public Question6(int number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the number of table you want : ");
        setNumber(scanner.nextInt());
    }

    // Method to display the table of a number.
    public void printTable(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(getNumber()+" x "+i+" = "+(getNumber()*i));
        }
    }


    // Getters Setters.
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question6 question6 = new Question6();
        question6.input();
        question6.printTable();
 */