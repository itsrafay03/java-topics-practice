/*
In a company, worker efficiency is determined on the basis of the time
required for a worker to complete a particular job. If the time taken by the
worker is between 2 – 3 hours, then the worker is said to be highly efficient. If
the time required by the worker is between 3 – 4 hours, then the worker is
ordered to improve speed. If the time taken is between 4 – 5 hours, the worker
is given training to improve his speed, and if the time taken by the worker is
more than 5 hours, then the worker has to leave the company. If the time taken
by the worker is input through the keyboard, find the efficiency of the worker.
 */
package ifElse;

import java.util.Scanner;

public class Question39 {
    static Scanner scanner = new Scanner(System.in);
    private float timeTaken;

    // Default Constructor.
    public Question39() {
    }

    // Constructor Overloading.
    public Question39(float timeTaken) {
        this.timeTaken = timeTaken;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the time taken (in hours) by the worker : ");
        setTimeTaken(scanner.nextFloat());
    }

    // Method to find the efficiency of worker.
    public void findEfficiency(){
        if(getTimeTaken()>=2 && getTimeTaken()<3){
            {
                System.out.println("The worker is highly efficient.");
            }
        }else {
            {
                if(getTimeTaken()>=3 && getTimeTaken()<4){
                    {
                        System.out.println("The worker is ordered to improve speed.");
                    }
                } else {
                    {
                        if(getTimeTaken()>=4 && getTimeTaken()<5){
                            {
                                System.out.println("The worker is given training to improve his speed.");
                            }
                        }else {
                            {
                                System.out.println("The worker has to leave the company.");
                            }
                        }
                    }
                }
            }
        }
    }



    // Getters Setters.
    public float getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(float timeTaken) {
        if(timeTaken>=2){
            {
                this.timeTaken = timeTaken;
            }
        }else {
            {
                System.out.println("Not Possible. Enter correct time taken.");
            }
        }
    }
}

/*
        Question39 question39 = new Question39();
        question39.input();
        question39.findEfficiency();
 */