// Write a Java program to display the multiplication table of a given integer?
package whileLoop;

import java.util.Scanner;

public class Question9 {
    static Scanner scanner = new Scanner(System.in);

    private int table_number;

    public Question9() {
    }

    public Question9(int table_number) {
        this.table_number = table_number;
    }

    public void input(){
        System.out.print("Enter a Number whose table you want to display : ");
        setTable_number(scanner.nextInt());
    }
    public void displayTable(){
        int start_Limit = 1;
        int end_Limit = 10;
        int product;
        while (start_Limit<=end_Limit){
            product = start_Limit * getTable_number();
            System.out.println(getTable_number()+" x "+start_Limit+" = "+product);
            start_Limit++;
        }
    }

    public int getTable_number() {
        return table_number;
    }

    public void setTable_number(int table_number) {
        this.table_number = table_number;
    }
}

/*
        Question9 question9 = new Question9();
        question9.input();
        question9.displayTable();
 */