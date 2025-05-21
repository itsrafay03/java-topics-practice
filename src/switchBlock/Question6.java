// Write a java program to check whether a number is even or odd using switch case?
package switchBlock;

import java.util.Scanner;

public class Question6 {
    static Scanner scanner = new Scanner(System.in);
    private double number;

    public Question6() {
    }

    public Question6(double number) {
        this.number = number;
    }


    public void input(){
        System.out.print("Enter the Number : ");
        setNumber(scanner.nextDouble());
    }

    public String evenNumberCheck(){
        return switch ((int) (getNumber()%2)){
            case 0 -> "The number "+getNumber()+" is Even number.";
            default -> "The number "+getNumber()+" is Odd number.";
        };
    }


    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}

/*
        Question6 question6 = new Question6();
        question6.input();
        System.out.println(question6.evenNumberCheck());
 */
