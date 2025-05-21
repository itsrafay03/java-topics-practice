// Write a Java program to create a simple calculator.
package ifElse;

import java.util.Scanner;

public class Question38 {
    static Scanner scanner = new Scanner(System.in);
    private double num1;
    private double num2;
    private double result;
    private char operator;

    // Default Constructor.
    public Question38() {
    }

    // Constructor Overloading.
    public Question38(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    // Input Operator.
    public void input(){
        System.out.print("This Calculator has 5 operands as + , - , * , / , %.\nEnter first_Number : ");
        setNum1(scanner.nextDouble());
        System.out.print("Enter the operator : ");
        setOperator(scanner.next().charAt(0));
        System.out.print("Enter second_Number : ");
        setNum2(scanner.nextDouble());

    }

    // Method to select Operator.
    private void applyOperator(){
        if(getOperator() == '+'){
            {
                setResult(getNum1()+getNum2());
            }
        } else if (getOperator() == '-') {
            {
                setResult(getNum1()-getNum2());
            }
        } else if (getOperator() == '*') {
            {
                setResult(getNum1()*getNum2());
            }
        } else if (getOperator() == '/') {
            {
                setResult(getNum1()/getNum2());
            }
        } else if (getOperator() == '%') {
            {
                setResult(getNum1()%getNum2());
            }
        } else {
            {
                System.out.println("Sorry. This is not above operator.");
            }
        }
    }

    // Method to calculate result.
    public void displayResult(){
        applyOperator();
        System.out.println("Result : "+getResult());
    }



    // Getters Setters.
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}

/*
        Question38 question38 = new Question38();
        question38.input();
        question38.displayResult();
 */