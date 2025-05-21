// Write a program to enter the numbers till the user wants and at the end the
// program should display the largest and smallest numbers entered.
package doWhileLoop;

import java.util.Scanner;

public class Question27 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question27() {
    }

    public Question27(int number) {
        this.number = number;
    }

    public void checkLargestAndSmallestNumber(){
        int smallest_number;
        int largest_number;
        System.out.print("When you want to quit press any other key.\nEnter the number : ");
        setNumber(scanner.nextInt());
        smallest_number = largest_number = getNumber();
        System.out.print("Enter the number : ");
        do{
            setNumber(scanner.nextInt());
            if(getNumber() > largest_number){
                largest_number = getNumber();
            } else if (getNumber() < smallest_number) {
                smallest_number = getNumber();
            }
            System.out.print("Enter the number : ");
        } while(scanner.hasNextInt());
        System.out.println("The Largest : "+largest_number+" and Smallest : "+smallest_number);
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question27 question27 = new Question27();
        question27.checkLargestAndSmallestNumber();
 */