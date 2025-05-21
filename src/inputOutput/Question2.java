// Statement : Take a double as input from user. Cast it in int and print its value.

// This is our package name in which this Question2 class exist.
package inputOutput;

import java.util.Scanner;

public class Question2 {
    double inputDouble;

    // Default Constructor.
    public Question2(){

    }

    // Constructor Overloading.
    public Question2(double inputDouble) {
        this.inputDouble = inputDouble;
    }

    // Input Method.
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 'double' value: ");
        setInputDouble(scanner.nextDouble());
    }

    // Output Method.
    public void output(){
        System.out.print("After casting the double value in 'int' value is: "+(int)getInputDouble());
    }

    // Getters Setters.
    public double getInputDouble() {
        return inputDouble;
    }

    public void setInputDouble(double inputDouble) {
        this.inputDouble = inputDouble;
    }
}


//        Question2 question2 = new Question2(22.3345);
//        question2.input();
//        question2.output();