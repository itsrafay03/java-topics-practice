// Statement : Take salary of two employees as input in float and print average of these salaries.

package inputOutput;

import java.util.Scanner;

public class Question4 {
    float salary1;
    float salary2;
    public Question4(){

    }
    public Question4(float salary1, float salary2) {
        this.salary1 = salary1;
        this.salary2 = salary2;
    }

    public void inputSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Salary of first employee: ");
        setSalary1(scanner.nextFloat());
        System.out.print("Enter Salary of second employee: ");
        setSalary2(scanner.nextFloat());
    }

    public void outputAvg() {
        System.out.printf("The Salary of First employee is $%.2f and Second employee is $%.2f",getSalary1(),getSalary2());
        System.out.print("\nThe Average of their Salaries is $"+(getSalary1()+getSalary2())/2);
    }

    // Setters Getters.
    public float getSalary1() {
        return salary1;
    }

    public void setSalary1(float salary1) {
        this.salary1 = salary1;
    }

    public float getSalary2() {
        return salary2;
    }

    public void setSalary2(float salary2) {
        this.salary2 = salary2;
    }
}


//        Question4 question4 = new Question4();
//        question4.inputSalary();
//        question4.outputAvg();