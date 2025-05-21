// Write a java program take two int values from user and print greatest among them?
package ifElse;

import java.util.Scanner;

public class Question8 {
    static Scanner scanner = new Scanner(System.in);

    private int num1;
    private int num2;
    // Default Constructor.
    public Question8() {
    }
    // Constructor Overloading.
    public Question8(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your first number : ");
        setNum1(scanner.nextInt());
        System.out.print("Enter your second number : ");
        setNum2(scanner.nextInt());
    }

    // Method to print greater value.
    public void greaterValue(){
        if(getNum1() == getNum2()){
            {
                System.out.print("Both numbers are Equal.");
            }
        } else if (getNum1() > getNum2()) {
            {
                System.out.print("Greatest among them is first_number: "+getNum1());
            }
        }else {
            {
                System.out.print("Greatest among them is second_number: "+getNum2());
            }
        }
    }


    // Getters Setters.
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

/*
        Question8 question8 = new Question8();
        question8.input();
        question8.greaterValue();
 */