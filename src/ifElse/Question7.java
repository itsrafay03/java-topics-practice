// Write a java program take values of length and breadth of a rectangle from user
// and check if it is square or not?
package ifElse;

import java.util.Scanner;

public class Question7 {
    static Scanner scanner = new Scanner(System.in);
    private float length;
    private float width;

    // Default Constructor.
    public Question7() {
    }
    // Constructor Overloading.
    public Question7(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the Length value : ");
        setLength(scanner.nextFloat());
        System.out.print("Enter the Breadth value : ");
        setWidth(scanner.nextFloat());
    }

    // Method to check that it is Square or not.
    public void squareChecker(){
        if(getLength() == getWidth()){
            {
                System.out.printf("Yes, It is a Square.\nAs Length %.2f and Breadth %.2f are equal.",getLength(),getWidth());
            }
        }else {
            {
                System.out.printf("No, It is not a Square.\nAs Length %.2f and Breadth %.2f are not equal.",getLength(),getWidth());
            }
        }
    }



    // Getters Setters.
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if(length > 0){
            {
                this.length = length;
            }
        }else{
            {
                System.out.println("Please enter correct value.");
                input();
            }
        }
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if(width > 0){
            {
                this.width = width;
            }
        }else{
            {
                System.out.println("Please enter correct value.");
                input();
            }
        }
    }
}

/*
        Question7 question7 = new Question7();
        question7.input();
        question7.squareChecker();
 */

