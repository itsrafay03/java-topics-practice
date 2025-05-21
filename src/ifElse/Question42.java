// Take input from user in centimeters and convert it in meters or kilometers based
// on user’s choice
package ifElse;

import java.util.Scanner;

public class Question42 {
    static Scanner scanner = new Scanner(System.in);
    private float centimeters;
    private float meters;
    private float kilometers;
    public static final float centimetersInMeters = 100;
    public static final float centimetersInKilometers = 100000;


    // Default Constructor.
    public Question42() {
    }

    // Constructor Overloading.
    public Question42(float centimeters) {
        this.centimeters = centimeters;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the centimeters : ");
        setCentimeters(scanner.nextFloat());
    }

    // Method to change centimeters to meters.
    private void calcMeters(){
        setMeters(getCentimeters()/centimetersInMeters);
        System.out.println("Meters : "+getMeters());
    }

    // Method to change centimeters to Kilometers.
    private void calcKilometers(){
        setKilometers(getCentimeters()/centimetersInKilometers);
        System.out.println("Kilometers : "+getKilometers());
    }

    // Method to convert centimeters in according to user's choice.
    public void conversion(){
        System.out.print("Select number in which you want to convert the centimeters.\n1.Meter   2.Kilometer   3.Both\nEnter : ");
        byte input = scanner.nextByte();
        if(input == 1){
            {
                calcMeters();
            }
        } else if (input == 2) {
            {
                calcKilometers();
            }
        } else if (input == 3) {
            {
                calcMeters();
                calcKilometers();
            }
        }else {
            {
                System.out.println("Sorry. Invalid input.");
            }
        }
    }



    // Getters Setters.
    public float getCentimeters() {
        return centimeters;
    }

    public void setCentimeters(float centimeters) {
        this.centimeters = centimeters;
    }

    public float getMeters() {
        return meters;
    }

    public void setMeters(float meters) {
        this.meters = meters;
    }

    public float getKilometers() {
        return kilometers;
    }

    public void setKilometers(float kilometers) {
        this.kilometers = kilometers;
    }
}

/*
        Question42 question42 = new Question42();
        question42.input();
        question42.conversion();
 */