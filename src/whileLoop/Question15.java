// Write a Java program to find first and last digit of a number?
package whileLoop;

import java.util.Scanner;

public class Question15 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question15() {
    }

    public Question15(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter number : ");
        setNumber(scanner.nextInt());
    }

    public void counter(){
        int first_num;
        int last_num = getNumber()%10;
        while (getNumber()>10){
            setNumber(getNumber()/10);
        }
        first_num = getNumber();
        System.out.println("First number is "+first_num+" and last number is "+last_num);
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
        Question15 question15 = new Question15();
        question15.input();
        question15.counter();
 */