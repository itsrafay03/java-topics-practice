// Write a Java program to find whether a given year is a leap year or not?
package ifElse;

import java.util.Scanner;

public class Question4 {
    static Scanner scanner = new Scanner(System.in);
    private int year;
    public static final byte leapYearIdentifier = 4;

    // Default Constructor.
    public Question4() {
    }
    // Method Overloading.
    public Question4(int year) {
        this.year = year;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the Year : ");
        setYear(scanner.nextInt());
    }

    // Method to identify the Leap Year.
    public void leapYear(){
        System.out.println("The Year you entered is "+getYear());
        if((getYear() % leapYearIdentifier) == 0){
            {
                System.out.print("Yes. It is a Leap Year.");
            }
        }else{
            {
                System.out.print("No. It is not a Leap Year.");
            }
        }
    }


    // Getters Setters.
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 0){
            {
                this.year = year;
            }
        }else{
            {
                System.out.println("Please enter correct year.");
                input();
            }
        }

    }
}

/*
        Question4 question4 = new Question4();
        question4.input();
        question4.leapYear();

 */
