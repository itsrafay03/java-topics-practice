// Write a java program print total number of days in a month using switch case?
package switchBlock;

import java.util.Scanner;

public class Question2 {
    static Scanner scanner = new Scanner(System.in);
    private byte monthNumber;
    public static final byte day_of_Feb = 28;
    public static final byte max_days = 31;
    public static final byte min_days = 30;
    public static final byte invalid_days = 0;


    // Default Constructor.
    public Question2() {
    }

    // Constructor Overloading.
    public Question2(byte monthNumber) {
        this.monthNumber = monthNumber;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter Month number : ");
        setMonthNumber(scanner.nextByte());
    }

    // Method to find number of days in month. This is enhanced switch, here switch is expression.
    public int numberOfDays(){
        return switch (getMonthNumber()){
            case 1, 3, 5, 7, 8, 10, 12 -> max_days;
            case 2 -> day_of_Feb;
            case 4, 6, 9, 11 -> min_days;
            default -> invalid_days;
        };
    }

    // 2nd approach by using if as statement.
//    public void numberOfDays(){
//        switch (getMonthNumber()){
//            case 1:
//                setDaysNumber(31);
//                break;
//            case 2:
//                setDaysNumber(28);
//                break;
//            case 3:
//                setDaysNumber(31);
//                break;
//            case 4:
//                setDaysNumber(30);
//                break;
//            case 5:
//                setDaysNumber(31);
//                break;
//            case 6:
//                setDaysNumber(30);
//                break;
//            case 7:
//                setDaysNumber(31);
//                break;
//            case 8:
//                setDaysNumber(31);
//                break;
//            case 9:
//                setDaysNumber(30);
//                break;
//            case 10:
//                setDaysNumber(31);
//                break;
//            case 11:
//                setDaysNumber(30);
//                break;
//            case 12:
//                setDaysNumber(31);
//                break;
//            default:
//                System.out.println("Invalid Month number.");
//        }
//        System.out.println("Month Number "+getMonthNumber()+" have "+getDaysNumber()+" days.");
//    }



    // Getter Setters.
    public byte getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(byte monthNumber) {
        this.monthNumber = monthNumber;
    }

}

/*
        Question2 question2 = new Question2();
        question2.input();
        question2.numberOfDays();
 */