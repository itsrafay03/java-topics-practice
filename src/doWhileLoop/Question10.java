// Write a Java program to display the multiplication table vertically from 1 to n?
package doWhileLoop;

import java.util.Scanner;

public class Question10 {
    static Scanner scanner = new Scanner(System.in);
    private int number;
    private int limit;


    public Question10() {
    }

    public Question10(int number, int limit) {
        this.number = number;
        this.limit = limit;
    }

    public void input(){
        System.out.print("Enter the number whose table you want : ");
        setNumber(scanner.nextInt());
        System.out.print("Enter the limit of table : ");
        setLimit(scanner.nextInt());
    }

    public void displayTable(){
        int count = 1;
        int table;
        do{
            table = getNumber() * count;
            System.out.println(getNumber()+" x "+count+" = "+table);
            count++;
        } while(count <= getLimit());
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
        Question10 question10 = new Question10();
        question10.input();
        question10.displayTable();
 */