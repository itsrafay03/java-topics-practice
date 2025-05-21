// Write a java program to check whether the last digit of a number is divisible by 3 or not.
package ifElse;

import java.util.Scanner;

public class Question44 {
    static Scanner scanner = new Scanner(System.in);
    private long number;
    private int lastDigit;

    // Default Constructor.
    public Question44() {
    }

    // Constructor Overloading.
    public Question44(long number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your number : ");
        setNumber(scanner.nextLong());
    }

    // Method to find the last digit of the input number.
    private long checkLastNumber(){
        if(getNumber()>0){
            setNumber(getNumber());
        }else{
            setNumber(-getNumber());
        }
        if(getNumber() > 10){
            setNumber(getNumber()%10);
        }
        System.out.println("Last digit of number : "+getNumber());
        return getNumber();
    }

    // Method to check that last number is divisible by 3 or not.
    public void checkDivisible(){
        checkLastNumber();
        if(getNumber()%3 == 0){
            {
                System.out.println("Yes, last digit of a number is divisible by 3 .");
            }
        }else{
            {
                System.out.println("No, last digit of a number is not divisible by 3 .");
            }
        }
    }



    // Getters Setters.

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getLastDigit() {
        return lastDigit;
    }

    public void setLastDigit(int lastDigit) {
        this.lastDigit = lastDigit;
    }
}
/*
        Question44 question44 = new Question44();
        question44.input();
        question44.checkDivisible();
 */