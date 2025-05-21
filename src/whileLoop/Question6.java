// Write a java program to print first 10 numbers and there squares?
package whileLoop;

import java.util.Scanner;

public class Question6 {
    static Scanner scanner = new Scanner(System.in);

    private int square;

    public Question6() {
    }

    public Question6(int square) {
        this.square = square;
    }

    public void input(){
        System.out.print("How many Number's Square do you want to display : ");
        setSquare(scanner.nextInt());
    }
    public void displaySquares(){
        int start_Limit = 1;
        int product;
        while (start_Limit<=getSquare()){
            product = start_Limit * start_Limit;
            System.out.println("Square of "+start_Limit+" is "+product);
            start_Limit++;
        }
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}
/*
        Question6 question6 = new Question6();
        question6.input();
        question6.displaySquares();
 */