// Write a java program to create Simple Calculator using switch case?
package switchBlock;

import java.util.Scanner;

public class Question9 {
    static Scanner scanner = new Scanner(System.in);
    private double first_num;
    private char operator;
    private double second_num;

    public Question9() {
    }

    public Question9(double first_num, char operator, double second_num) {
        this.first_num = first_num;
        this.operator = operator;
        this.second_num = second_num;
    }

    public void input(){
        System.out.print("Enter first_number : ");
        setFirst_num(scanner.nextDouble());
        System.out.print("Enter operator : ");
        setOperator(scanner.next().charAt(0));
        System.out.print("Enter second_number : ");
        setSecond_num(scanner.nextDouble());
    }

    public double calculator(){
        return switch (getOperator()){
            case '+' -> getFirst_num() + getSecond_num();
            case '-' -> getFirst_num() - getSecond_num();
            case '*' -> getFirst_num() * getSecond_num();
            case '/' -> getFirst_num() / getSecond_num();
            case '%' -> getFirst_num() % getSecond_num();
            default -> 0.0;
        };
    }



    public double getFirst_num() {
        return first_num;
    }

    public void setFirst_num(double first_num) {
        this.first_num = first_num;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getSecond_num() {
        return second_num;
    }

    public void setSecond_num(double second_num) {
        this.second_num = second_num;
    }
}

/*
        Question9 question9 = new Question9();
        question9.input();
        System.out.println("Answer : "+question9.calculator());
 */