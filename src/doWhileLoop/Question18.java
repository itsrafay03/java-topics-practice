// Write a Java program to enter a number and print its reverse?
package doWhileLoop;

import java.util.Scanner;

public class Question18 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question18() {
    }

    public Question18(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public void checkNumber(){
        if(getNumber() < 0){
            setNumber(-getNumber());
        }else{
            setNumber(getNumber());
        }
    }

    public void findReverseOfNumber(){
        System.out.print("The reverse of "+getNumber()+" is ");
        checkNumber();
        int reverse;
        do{
            reverse = getNumber() % 10;
            System.out.print(reverse);
            setNumber(getNumber() / 10);
        } while(getNumber() > 0);
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question18 question18 = new Question18();
        question18.input();
        question18.findReverseOfNumber();
 */