// Write a java program to input month number and print number of days in that month?
package ifElse;

import java.util.Scanner;

public class Question31 {
    static Scanner scanner = new Scanner(System.in);
    private byte monthNumber;
    private byte numberOfDays;
    public static final byte daysOfFeb = 28;
    public static final byte maxDaysOfMonth = 31;
    public static final byte minDaysOfMonth = 30;

    // Default Constructor.
    public Question31() {
    }

    // Constructor Overloading.
    public Question31(byte monthNumber) {
        this.monthNumber = monthNumber;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter Month number : ");
        setMonthNumber(scanner.nextByte());
    }

    // Method to give the number of days in a given Month.
    public void daysOfMonth(){
        if(getMonthNumber() == 2){
            {
                setNumberOfDays(daysOfFeb);
            }
        } else if (getMonthNumber() == 4 || getMonthNumber() == 6 || getMonthNumber() == 9 || getMonthNumber() == 11) {
            {
                setNumberOfDays(minDaysOfMonth);
            }
        }else{
            {
                setNumberOfDays(maxDaysOfMonth);
            }
        }
        System.out.println("Number of Days : "+getNumberOfDays());
    }


    // Getters Setters.
    public byte getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(byte monthNumber) {
        if(monthNumber > 0 && monthNumber <= 12){
            {
                this.monthNumber = monthNumber;
            }
        }else {
            System.out.println("Invalid month Number. Please enter correct Month number.");
        }
    }

    public byte getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(byte numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}

/*
        Question31 question31 = new Question31();
        question31.input();
        question31.daysOfMonth();
 */