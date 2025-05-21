// Write a java program a company decided to give bonus of 5% to employee if
// his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount?
package ifElse;

import java.util.Scanner;

public class Question10 {
    static Scanner scanner = new Scanner(System.in);
    private float salary;
    private short years;
    private float bonus;
    public static final float bonusPercent = 0.05f;   // 5% of salary

    // Default Constructor.
    public Question10() {
    }

    // Constructor Overloading.
    public Question10(float salary, short years) {
        this.salary = salary;
        this.years = years;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your Salary : ");
        setSalary(scanner.nextFloat());
        System.out.print("Enter your Year of service : ");
        setYears(scanner.nextShort());
    }

    // Method to calculate amount of bonus.
    private void calcBonus(){
        setBonus(getSalary()*bonusPercent);
        //setSalary(getSalary()+getBonus());

    }

    // Method to tell the bonus of employee.
    public void netBonus(){
        if(getYears() > 5){
            {
                calcBonus();
            }
        }else{
            {
                setBonus(0.0f);
            }
        }
        System.out.println("Your Bonus is : $"+getBonus());
    }


    // Getters Setters.
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public short getYears() {
        return years;
    }

    public void setYears(short years) {
        this.years = years;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
}

/*
        Question10 question10 = new Question10();
        question10.input();
        question10.netBonus();
 */
