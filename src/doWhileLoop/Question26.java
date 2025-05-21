// Write a program to enter the numbers till the user wants and at the end it should
// display the count of positive, negative and zeros entered.
package doWhileLoop;

import java.util.Scanner;

public class Question26 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question26() {
    }

    public Question26(int  number) {
        this.number = number;
    }

    public void countNumbersTypes(){
        int digit;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.print("When you want to quit press any other key.\nEnter the number : ");
        do{
            setNumber(scanner.nextInt());
            digit = getNumber();
            if(digit == 0){
                zero++;
            } else if (digit < 0) {
                negative++;
            }else {
                positive++;
            }
            System.out.print("Enter the number : ");
        } while(scanner.hasNextInt());
        System.out.println("Count of positive entered numbers : " + positive);
        System.out.println("Count of negative entered numbers : " + negative);
        System.out.println("Count of zero entered : " + zero);
    }


    public int  getNumber() {
        return number;
    }

    public void setNumber(int  number) {
        this.number = number;
    }
}

/*
        Question26 question26 = new Question26();
        question26.countNumbersTypes();
 */