// Write a Java program to read the value of an integer m and display the value of n
// is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0?
package ifElse;

import java.util.Scanner;

public class Question5 {
    static Scanner scanner = new Scanner(System.in);
    private int m;
    public static byte n = 0;

    // Default Constructor.
    public Question5() {
    }
    // Constructor Overloading.
    public Question5(int m) {
        this.m = m;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter any integer for m : ");
        setM(scanner.nextInt());
    }


    // Method to decide and print the value of n.
    public void displayN(){
        if(m > 0){
            {
                n++;
            }
        }if (m < 0) {
            {
                n--;
            }
        }
        System.out.print("The value of n is : "+n);
    }


    // Getters Setters.
    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
}

/*
        Question5 question5 = new Question5();
        question5.input();
        question5.displayN();
 */
