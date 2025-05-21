// Write a program to find factorial of given number?
package whileLoop;

import java.util.Scanner;

public class Question5 {
    static Scanner scanner = new Scanner(System.in);

    private int factorial;

    public Question5() {
    }

    public Question5(int factorial) {
        this.factorial = factorial;
    }

    public void input(){
        System.out.print("Enter number to find factorial : ");
        setFactorial(scanner.nextInt());
    }
    public int displayFactorial(){
        int end_Limit = 1;
        int product = 1;
        while (end_Limit<=getFactorial()){
            product *= end_Limit;
            end_Limit++;
        }
        System.out.print("Factorial of "+getFactorial()+" is ");
        return product;
    }


    public int getFactorial() {
        return factorial;
    }

    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }
}
/*
        Question5 question5 = new Question5();
        question5.input();
        System.out.println(question5.displayFactorial());
 */