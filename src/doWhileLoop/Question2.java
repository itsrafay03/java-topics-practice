/*
Two numbers are entered through the keyboard. Write a Java program to find the
value of one number raised to the power of another. (Do not use Java built-in
method)?
 */
package doWhileLoop;
import java.util.Scanner;

public class Question2 {
    static Scanner scanner = new Scanner(System.in);
    private int number;
    private int power;

    // Default Constructor.
    public Question2() {
    }

    // Constructor Overloading or Parameterized Constructor.
    public Question2(int number, int power) {
        this.number = number;
        this.power = power;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
        System.out.print("Enter the power of number : ");
        setPower(scanner.nextInt());
    }

    public int calculatePowerOfNumber(){
        int count = 1;
        int exponent = 1;
        do{
            exponent *= getNumber();
            count++;
        }while (count <= getPower());
        System.out.print(getNumber() + "^" + getPower() + " is ");
        return exponent;
    }


    // Setters Getters.
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

/*
        Question2 question2 = new Question2();
        question2.input();
        System.out.println(question2.calculatePowerOfNumber());
 */

