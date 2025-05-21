// Write a Java program to find sum of first and last digit of a number?
package whileLoop;

import java.util.Scanner;

public class Question16 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question16() {
    }

    public Question16(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter number : ");
        setNumber(scanner.nextInt());
    }

    public void counter(){
        int sum;
        int first_num;
        int last_num = getNumber()%10;
        while (getNumber()>10){
            setNumber(getNumber()/10);
        }
        first_num = getNumber();
        System.out.println("First digit is "+first_num+" and last digit is "+last_num);
        sum = first_num+last_num;
        System.out.println("The Sum of first and last digit of a number is "+sum);
    }

    public void count(){
        if(getNumber()<0){
            setNumber(-getNumber());
            counter();
        }else {
            counter();
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
        Question16 question16 = new Question16();
        question16.input();
        question16.count();
 */