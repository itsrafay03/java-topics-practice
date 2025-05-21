/*
Write a program in java to calculate and print the Electricity bill of a given
customer. The customer ID , name and unit consumed by the user should be taken
from the keyboard and display the total amount to pay to the customer. The charge
is as follow:

Unit                                Charge/unit
up to 199                           @1.20
200 and above but less than 400     @1.50
400 and above but less than 600     @1.80
600 and above                       @2.00

If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill
should be of Rs. 100/-
 */
package ifElse;

import java.util.Scanner;

public class Question28 {
    static Scanner scanner = new Scanner(System.in);
    private int customerId;
    private String name;
    private int unit;
    private float amountPerUnit;
    private float billAmount;
    private float amountToPay;
    public static final float surchargePercentage = 0.15f;
    public static final int limitOfSurcharge = 400;
    public static final int minBillAmount = 100;


    // Default Constructor.
    public Question28() {
    }

    // Constructor Overloading.
    public Question28(int customerId, String name, int unit) {
        this.customerId = customerId;
        this.name = name;
        this.unit = unit;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your Name : ");
        setName(scanner.nextLine());
        System.out.print("Enter your Customer_ID : ");
        setCustomerId(scanner.nextInt());
        System.out.print("Enter your Units consumed : ");
        setUnit(scanner.nextInt());
    }


    // Method to set the value of charge per unit.
    private void amountOfUnit(){
        if(getUnit()<200){
            {
                setAmountPerUnit(1.20f);
            }
        } else if (getUnit()>=200 && getUnit()<400) {
            {
                setAmountPerUnit(1.50f);
            }
        } else if (getUnit()>=400 && getUnit()<600) {
            {
                setAmountPerUnit(1.80f);
            }
        }else{
            setAmountPerUnit(2.00f);
        }
        System.out.println("Amount charged per unit of bill : $"+getAmountPerUnit());
    }

    // Method to find total amount of consumed units or total amount of bill.
    private void amountOfBill(){
        amountOfUnit();
        setBillAmount(getUnit()*getAmountPerUnit());
        System.out.printf("Total bill amount w.r.t to units : $%.1f",getBillAmount());
        System.out.println();
    }

    // Method to find the Total amount to actually pay by the customer.
    private void netAmountToPay(){
        amountOfBill();
        if(getBillAmount()>limitOfSurcharge){
            {
                setAmountToPay((float)(getBillAmount()+(getBillAmount()*surchargePercentage)));
            }
        } else if (getBillAmount()<minBillAmount) {
            {
                setAmountToPay(minBillAmount);
            }
        }else {
            {
                setAmountToPay(getBillAmount());
            }
        }
        System.out.printf("Total amount to pay : $%.1f",getAmountToPay());
    }
    // Method to display output to user.
    public void outputOfBill(){
        System.out.println("\nHello! "+getName()+"\nCustomer_ID : "+getCustomerId()+"\nTotal consumed Units : "+getUnit());
        netAmountToPay();
    }


    // Getters Setters.
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        if(unit>=0){
            {
                this.unit = unit;
            }
        }else {
            {
                System.out.println("Invalid input. Units can not be negative number.");
            }
        }
    }

    public float getAmountPerUnit() {
        return amountPerUnit;
    }

    public void setAmountPerUnit(float amountPerUnit) {
        this.amountPerUnit = amountPerUnit;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public float getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(float amountToPay) {
        this.amountToPay = amountToPay;
    }
}

/*
        Question28 question28 = new Question28();
        question28.input();
        question28.outputOfBill();
 */