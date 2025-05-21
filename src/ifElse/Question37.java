// Write a java program that accepts three numbers from the user and check if
// numbers are in "increasing" or "decreasing" order.
package ifElse;

import java.util.Scanner;

public class Question37 {
    static Scanner scanner = new Scanner(System.in);
    private double first_number;
    private double second_number;
    private double third_number;

    // Default Constructor.
    public Question37() {
    }

    // Constructor Overloading.
    public Question37(double first_number, double second_number, double third_number) {
        this.first_number = first_number;
        this.second_number = second_number;
        this.third_number = third_number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your first_number : ");
        setFirst_number(scanner.nextDouble());
        System.out.print("Enter your second_number : ");
        setSecond_number(scanner.nextDouble());
        System.out.print("Enter your third_number : ");
        setThird_number(scanner.nextDouble());
    }

    // Method to check the number order.
    public void numbersOrder(){
        if(getFirst_number()<getSecond_number() && getSecond_number()<getThird_number()){
            {
                System.out.println("Entered numbers are in \"increasing\" order.");
            }
        }else{
            {
                if(getFirst_number()>getSecond_number() && getSecond_number()>getThird_number()){
                    {
                        System.out.println("Entered numbers are in \"decreasing\" order.");
                    }
                } else {
                    {
                        System.out.println("Entered numbers are in \"random\" order.");
                    }
                }
            }
        }
    }


    // Getters Setters.
    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Question37.scanner = scanner;
    }

    public double getFirst_number() {
        return first_number;
    }

    public void setFirst_number(double first_number) {
        this.first_number = first_number;
    }

    public double getSecond_number() {
        return second_number;
    }

    public void setSecond_number(double second_number) {
        this.second_number = second_number;
    }

    public double getThird_number() {
        return third_number;
    }

    public void setThird_number(double third_number) {
        this.third_number = third_number;
    }
}

/*
        Question37 question37 = new Question37();
        question37.input();
        question37.numbersOrder();
 */