// Write a Java program to Check Whether a Number can be Express as Sum of Two
// Prime Numbers?
package forLoop;

import java.util.Scanner;

public class Question28 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question28() {
    }

    public Question28(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public void findPrimeNumbers(){
        for (int i = 2; i <= getNumber() / 2; ++i) {
            if (isPrimeNumber(i)) {
                if (isPrimeNumber(getNumber() - i)) {
                    System.out.printf("Yes it can be express as %d = %d + %d\n", getNumber(), i, getNumber() - i);
                }
            }
        }
    }


    // Method to find that the given number is Prime or not.
    private boolean isPrimeNumber(int number) {
        int num = 2;
        while (number % num != 0) {
            num++;
        }
        if(num == number){
            return true;
        }else{
            return false;
        }
    }




    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Question28 question28 = new Question28();
        question28.input();
        question28.findPrimeNumbers();
    }
}
