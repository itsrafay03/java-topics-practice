// Write a java program to check whether a number is prime or not using while loop?
package whileLoop;

import java.util.Scanner;

public class Question12 {
    static Scanner scanner = new Scanner(System.in);
    private int prime_number;

    public Question12() {
    }

    public Question12(int prime_number) {
        this.prime_number = prime_number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setPrime_number(scanner.nextInt());
    }

    public void  checkPrimeNumber() {
        int num = 2;
        while (!(getPrime_number() % num == 0)) {
            num++;
        }
        if(num == getPrime_number()){
            System.out.println(getPrime_number() + " is a Prime Number.");
        }else {
            System.out.println(getPrime_number() + " is not a Prime Number.");
        }
    }



    public int getPrime_number() {
        return prime_number;
    }

    public void setPrime_number(int prime_number) {
        this.prime_number = prime_number;
    }
}

/*
        Question12 question12 = new Question12();
        question12.input();
        question12.checkPrimeNumber();
 */