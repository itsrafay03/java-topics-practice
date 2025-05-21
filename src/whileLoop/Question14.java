// Write a Java program to count number of digits in a number?
package whileLoop;

import java.util.Scanner;

public class Question14 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question14() {
    }

    public Question14(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter number : ");
        setNumber(scanner.nextInt());
    }

    public void counter(){
        int count = 0;
        while (getNumber()>0){
            setNumber(getNumber()/10);
            count++;
        }
        System.out.println("Numbers of digits in given number are "+count);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
/*
        Question14 question14 = new Question14();
        question14.input();
        question14.counter();
 */
