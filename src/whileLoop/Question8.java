// Write a Java program to display the cube of the number up to given an integer?
package whileLoop;

import java.util.Scanner;

public class Question8 {
    static Scanner scanner = new Scanner(System.in);

    private int cube;

    public Question8() {
    }

    public Question8(int cube) {
        this.cube = cube;
    }

    public void input(){
        System.out.print("How many Number's Cube do you want to display : ");
        setCube(scanner.nextInt());
    }
    public void displayCube(){
        int start_Limit = 1;
        int product;
        while (start_Limit<=getCube()){
            product = start_Limit * start_Limit * start_Limit;
            System.out.println("Cube of "+start_Limit+" is "+product);
            start_Limit++;
        }
    }

    public int getCube() {
        return cube;
    }

    public void setCube(int cube) {
        this.cube = cube;
    }
}
/*
        Question8 question8 = new Question8();
        question8.input();
        question8.displayCube();
 */
