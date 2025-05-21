// Write a Java program to calculate sum of digits of a number?
package whileLoop;

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

    public void sumOfDigits(){
        int digits;
        int sum = 0;
        while(getNumber()>0){
            digits = getNumber()%10;
            sum += digits;
            setNumber(getNumber()/10);
        }
        System.out.println("Sum : "+sum);
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
        question18.sumOfDigits();
 */
