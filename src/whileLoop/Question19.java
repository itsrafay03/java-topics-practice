// Write a Java program to calculate product of digits of a number?
package whileLoop;

import java.util.Scanner;

public class Question19 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question19() {
    }

    public Question19(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public void productOfDigits(){
        int digits;
        int product = 1;
        while(getNumber()>0){
            digits = getNumber()%10;
            product *= digits;
            setNumber(getNumber()/10);
        }
        System.out.println("Sum : "+product);
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question19 question19 = new Question19();
        question19.input();
        question19.productOfDigits();
 */
