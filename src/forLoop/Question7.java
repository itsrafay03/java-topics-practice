// Write a Java program to display the multiplication table vertically from 1 to n?
package forLoop;

import java.util.Scanner;

public class Question7 {
    static Scanner scanner = new Scanner(System.in);
    private int number;
    private int limitOfTable;

    // Default Constructor.
    public Question7() {
    }

    //Constructor Overloading.
    public Question7(int number, int limitOfTable) {
        this.number = number;
        this.limitOfTable = limitOfTable;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the number of table you want : ");
        setNumber(scanner.nextInt());
        System.out.print("Enter the limit up to which you want table : ");
        setLimitOfTable(scanner.nextInt());
    }

    // Method to display the table of a number.
    public void printTable(){
        for (int i = 1; i <= getLimitOfTable(); i++) {
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

    public int getLimitOfTable() {
        return limitOfTable;
    }

    public void setLimitOfTable(int limitOfTable) {
        this.limitOfTable = limitOfTable;
    }
}

/*
        Question7 question7 = new Question7();
        question7.input();
        question7.printTable();
 */