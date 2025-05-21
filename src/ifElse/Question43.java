// Write a java Program to take the hours and minutes as input by the user and the
// show that whether it is AM or PM.
package ifElse;

import java.util.Scanner;

public class Question43 {
    static Scanner scanner = new Scanner(System.in);
    private byte hours;
    private byte minutes;
    private String status;

    // Default Constructor.
    public Question43() {
    }

    // Constructor Overloading.
    public Question43(byte hours, byte minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the hours : ");
        setHours(scanner.nextByte());
        System.out.print("Enter the minutes : ");
        setMinutes(scanner.nextByte());
    }

    // Method to check that time is AM or PM.
    private void timeStatus(){
        if(getHours()>=0 && getHours()<12){
            {
                setStatus("AM");
            }
        } else if (getHours()>=12 && getHours()<24) {
            {
                setStatus("PM");
            }
        }else{
            {
                setStatus("Invalid Time. Enter correct time.");
            }
        }
    }

    // Method to display AM or PM for time.
    public void displayTimeStatus(){
        timeStatus();
        System.out.println("The time is: " + hours + ":" + minutes + " " + getStatus());
    }

    // Getters Setters.
    public byte getHours() {
        return hours;
    }

    public void setHours(byte hours) {
        this.hours = hours;
    }

    public byte getMinutes() {
        return minutes;
    }

    public void setMinutes(byte minutes) {
        this.minutes = minutes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

/*
        Question43 question43 = new Question43();
        question43.input();
        question43.displayTimeStatus();
 */
