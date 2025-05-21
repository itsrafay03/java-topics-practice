// Two numbers are entered through the keyboard. Write a Java program to find the
// value of one number raised to the power of another. (Do not use Java built-in method)?
package forLoop;

import java.util.Scanner;

public class Question33 {
    static Scanner scanner = new Scanner(System.in);
    private int baseNumber;
    private int power;

    public Question33() {
    }

    public Question33(int baseNumber, int power) {
        this.baseNumber = baseNumber;
        this.power = power;
    }

    public void input(){
        System.out.print("Enter the base number : ");
        setBaseNumber(scanner.nextInt());
        System.out.print("Enter the power : ");
        setPower(scanner.nextInt());
    }


     // Method to calculate Power.
    public double Power(){
        double power = 1.0;
        for (int i = 1; i <= getPower(); i++) {
            power *=getBaseNumber();
        }
        return power;
    }

    // Method to check Power type(+ve or -ve) and display answer.
    public double calculatePower(){
        System.out.print(getBaseNumber()+"^"+getPower()+" = ");
        double power;
        if(getPower() < 0){
            setPower(-getPower());
            power = 1 / Power();
        }else{
            power = Power();
        }
        return power;
    }


    public int getBaseNumber() {
        return baseNumber;
    }

    public void setBaseNumber(int baseNumber) {
        this.baseNumber = baseNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

/*
        Question33 question33 = new Question33();
        question33.input();
        System.out.println(question33.calculatePower());
 */