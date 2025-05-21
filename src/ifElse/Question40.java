/*
A library charges a fine for every book returned late. For first 5 days the fine is 50
paisa, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you
return the book after 30 days your membership will be canceled. Write a program
to accept the number of days the member is late to return the book and display the
fine or the appropriate message.
 */
package ifElse;

import java.util.Scanner;

public class Question40 {
    static Scanner scanner = new Scanner(System.in);
    private int days;
    private float fine;

    private float totalFine;

    // Default Constructor.
    public Question40() {
    }

    // Constructor Overloading.
    public Question40(int days) {
        this.days = days;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter number of days : ");
        setDays(scanner.nextInt());
    }


    // Method to calculate total fine.
    public void calcFine(){
        if(getDays()>30){
            {
                System.out.println("Your membership is canceled.");
            }
        }else{
            {
                if(getDays()>10){
                    {
                        float x = getDays() - 10;
                        setFine(0.5f);
                        float f1 = 5*getFine();
                        setFine(1);
                        float f2 = 5*getFine();
                        setFine(5);
                        float f3 = x*getFine();
                        setTotalFine(f1+f2+f3);
                    }
                }else if(getDays()>5 && getDays()<=10){
                    {
                        float x = getDays() - 5;
                        setFine(0.5f);
                        float f1 = 5*getFine();
                        setFine(1);
                        float f2 = x*getFine();
                        setTotalFine(f1+f2);

                    }
                } else if (getDays()<=5) {
                    {
                        setFine(0.5f);
                        setTotalFine(getDays()*getFine());
                    }
                }
                System.out.println("Your fine is : $"+getTotalFine());
            }

        }
    }



    // Getters Setters.
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public float getFine() {
        return fine;
    }

    public void setFine(float fine) {
        this.fine = fine;
    }

    public float getTotalFine() {
        return totalFine;
    }

    public void setTotalFine(float totalFine) {
        this.totalFine = totalFine;
    }
}


/*
        Question40 question40 = new Question40();
        question40.input();
        question40.calcFine();
 */