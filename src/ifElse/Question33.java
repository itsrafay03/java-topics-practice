/*
Write a java program to input basic salary of an employee and calculate its Gross
salary according to following:
Basic Salary <= 10000 : HRA = 20% , DA = 80%
Basic Salary <= 20000 : HRA = 25% , DA = 90%
Basic Salary => 20000 : HRA = 30% , DA = 95%
 HRA : House Rent Allowance , DA : Dearness Allowance
 */
package ifElse;

import java.util.Scanner;

public class Question33 {
    static Scanner scanner = new Scanner(System.in);
    private int basicSalary;
    private int grossSalary;
    private float hra;
    private float da;
    public static final int cent = 100;
    public static final int firstLimit = 10000;
    public static final int secondLimit = 20000;

    // Default Constructor.
    public Question33() {
    }

    // Constructor Overloading.
    public Question33(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter Basic Salary : ");
        setBasicSalary(scanner.nextInt());
    }


    // Method to calculate value of Hra and Da.
    private void calcHraAndDa(){
        if(getBasicSalary() <= firstLimit){
            {
                setHra(20);
                setDa(80);
            }
        } else if (getBasicSalary() <= secondLimit) {
            {
                setHra(25);
                setDa(90);
            }
        }else{
            {
                setHra(30);
                setDa(95);
            }
        }
        setHra( (float) getBasicSalary() / cent * getHra());
        System.out.println("House Rent Allowance : $"+getHra());
        setDa((float) getBasicSalary() / cent * getDa());
        System.out.println("Dearness Allowance : $"+getDa());
    }

    // Method to calculate Gross Salary.
    private void netGrossSalary(){
        setGrossSalary((int)(getBasicSalary()+getHra()+getDa()));
        System.out.println("Gross Salary : $"+getGrossSalary());
    }

    //Method to display gross salary.
    public void displayGrossSalary(){
        System.out.println("\nBasic Salary : $"+getBasicSalary());
        calcHraAndDa();
        netGrossSalary();
    }



    // Getter Setter.
    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(int grossSalary) {
        this.grossSalary = grossSalary;
    }

    public float getHra() {
        return hra;
    }

    public void setHra(float hra) {
        this.hra = hra;
    }

    public float getDa() {
        return da;
    }

    public void setDa(float da) {
        this.da = da;
    }
}

/*
        Question33 question33 = new Question33();
        question33.input();
        question33.displayGrossSalary();
 */