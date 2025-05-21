// Write a Java program to display the multiplication table vertically from 1 to n?
package whileLoop;

import java.util.Scanner;

public class Question10 {
    static Scanner scanner = new Scanner(System.in);

    private int table_number;
    private int limit_of_table;

    public Question10() {
    }

    public Question10(int table_number, int limit_of_table) {
        this.table_number = table_number;
        this.limit_of_table = limit_of_table;
    }

    public void input(){
        System.out.print("Enter a Number whose table you want to display : ");
        setTable_number(scanner.nextInt());
        System.out.print("Enter limit of the table : ");
        setLimit_of_table(scanner.nextInt());
    }
    public void displayTable(){
        int start_Limit = 1;
        int product;
        while (start_Limit<=getLimit_of_table()){
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

    public int getLimit_of_table() {
        return limit_of_table;
    }

    public void setLimit_of_table(int limit_of_table) {
        this.limit_of_table = limit_of_table;
    }
}

/*
        Question10 question10 = new Question10();
        question10.input();
        question10.displayTable();
 */
