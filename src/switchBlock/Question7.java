// Write a java program to check whether a number is positive, negative or zero
// using switch case?
package switchBlock;

import java.util.Scanner;

public class Question7 {
    static Scanner scanner = new Scanner(System.in);
    private double number;

    public Question7() {
    }

    public Question7(double number) {
        this.number = number;
    }

    private char input(){
        System.out.print("Enter the Number : ");
        setNumber(scanner.nextDouble());
        String a = Double.toString(getNumber());
        return a.charAt(0);
    }

    public String checkNumber(){
        System.out.println(getNumber());
        switch (input()){
            case '-':
                return "The number "+getNumber()+" is a Negative number.";
            case '0':
                switch ((int)(getNumber()%10)){
                    case 0:
                        return "The number "+getNumber()+" is a Zero.";
                    default:
                        return "The number "+getNumber()+" is a Positive number.";

                }
            default:
                return "The number "+getNumber()+" is a Positive number.";
        }
    }



    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}

/*
        Question7 question7 = new Question7();
        System.out.println(question7.checkNumber());
 */