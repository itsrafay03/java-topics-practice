/*
Write a java program to input electricity unit charges and calculate total electricity
bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill?
 */
package ifElse;

import java.util.Scanner;

public class Question34 {
    static Scanner scanner = new Scanner(System.in);
    private int units;
    private float cost;
    private float totalCost;
    public static final float surcharge = 0.20f;


    // Default Constructor.
    public Question34() {
    }

    // Constructor Overloading.
    public Question34(int units) {
        this.units = units;
    }


    // Input Method.
    public void input(){
        System.out.print("Enter number of units : ");
        setUnits(scanner.nextInt());
    }


    // Method to calculate cost of bill.
    private void calcTotalCost(){
        if(getUnits()>250){
            {
                float x = getUnits() - 250;
                setCost(0.50f);
                float f1 = 50*getCost();
                setCost(0.75f);
                float f2 = 100*getCost();
                setCost(1.20f);
                float f3 = 100*getCost();
                setCost(1.50f);
                float f4 = x*getCost();
                setTotalCost(f1+f2+f3+f4);
            }
        }else if(getUnits()>150 && getUnits()<=250){
            {
                float x = getUnits() - 150;
                setCost(0.50f);
                float f1 = 50*getCost();
                setCost(0.75f);
                float f2 = 100*getCost();
                setCost(1.20f);
                float f3 = x*getCost();
                setTotalCost(f1+f2+f3);

            }
        } else if (getUnits()>50 && getUnits()<=150) {
            {
                float x = getUnits() - 50;
                setCost(0.50f);
                float f1 = 50*getCost();
                setCost(0.75f);
                float f2 = x*getCost();
                setTotalCost(f1+f2);
            }
        }else{
            {
                setCost(0.50f);
                setTotalCost(getUnits()*getCost());
            }
        }
        System.out.println("Cost of bill : $"+getTotalCost());
    }

    // Method to calculate total amount of bill.
    public void totalBillAmount(){
        calcTotalCost();
        float billAmount = getTotalCost()+(getTotalCost()*surcharge);
        System.out.println("Total Amount of Bill : $"+billAmount);
    }



    // Getters Setters.
    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
}
