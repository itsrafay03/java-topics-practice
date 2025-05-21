// Write a Java program to check whether a number is Strong number(whose sum of
// factorial of digits is equal to that number. e.g:145 as 5!+4!+1! = 145) or not?
package whileLoop;

import java.util.Scanner;

public class Question22 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question22() {
    }

    public Question22(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public void checkStrongNumber(){
        int actualNumber = getNumber();
        int digits;
        int product;
        int end_Limit;
        int sumOfFactorials = 0;
        while(getNumber()>0){
            digits = getNumber()%10;
            end_Limit = 1;
            product = 1;
            while (end_Limit<=digits){
                product *= end_Limit;
                end_Limit++;
            }
            //System.out.println("Product should be : "+product);
            //System.out.println("Number should be: "+getNumber());
            sumOfFactorials += product;
            setNumber(getNumber()/10);
            //System.out.println("Sum : "+sumOfFactorials);
        }
        //System.out.println(sumOfFactorials);
        if(actualNumber == sumOfFactorials){
            System.out.println("Yes. "+actualNumber+" is Strong number.");
        }else {
            System.out.println("No. "+actualNumber+" is not Strong number.");
        }

    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question22 question22 = new Question22();
        question22.input();
        question22.checkStrongNumber();
 */
