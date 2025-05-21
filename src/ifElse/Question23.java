/*
Write a java program to read temperature in centigrade and display a suitable
message according to temperature state below:
Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal in Temp
Temp 30-40 then Its Hot
Temp >=40 then Its Very Hot
 */
package ifElse;

import java.util.Scanner;

public class Question23 {
    static Scanner scanner = new Scanner(System.in);
    private byte temperature;

    // Default Constructor.
    public Question23() {
    }

    // Constructor Overloading.
    public Question23(byte temperature) {
        this.temperature = temperature;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the Temperature in Centigrade : ");
        setTemperature(scanner.nextByte());
    }

    // Method to read temperature and display suitable message.
    public void displayTempMessage(){
        if(getTemperature()<0){
            {
                System.out.println("It's Freezing weather.");
            }
        } else if (getTemperature()>=0 && getTemperature()<10) {
            {
                System.out.println("It's Very Cold weather.");
            }
        } else if (getTemperature()>=10 && getTemperature()<20) {
            {
                System.out.println("It's Cold weather.");
            }
        } else if (getTemperature()>=20 && getTemperature()<30) {
            {
                System.out.println("It's Normal weather.");
            }
        } else if (getTemperature()>=30 && getTemperature()<40) {
            {
                System.out.println("It's Hot weather.");
            }
        }else {
            {
                System.out.println("It's Very Hot weather.");
            }
        }
    }


    // Getters Setters.
    public byte getTemperature() {
        return temperature;
    }

    public void setTemperature(byte temperature) {
        this.temperature = temperature;
    }
}
/*
        Question23 question23 = new Question23();
        question23.input();
        question23.displayTempMessage();
 */
