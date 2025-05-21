// Write a Java program to find the prime numbers within a range of numbers?
package forLoop;

import java.util.Scanner;

public class Question18 {
    static Scanner scanner = new Scanner(System.in);
    private long startRange;
    private long endRange;

    public Question18() {
    }

    public Question18(long startRange, long endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the starting Range : ");
        setStartRange(scanner.nextLong());
        System.out.print("Enter the ending Range : ");
        setEndRange(scanner.nextLong());
    }



    // Method to find the Prime numbers between given range.
    public void findPrimeNumbers(){
        System.out.println("The Prime numbers between "+getStartRange()+" and "+getEndRange()+" are : ");
        for (long i = getStartRange(); i <= getEndRange(); i++) {
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }



    // Method to find that the given number is Prime or not.
    private boolean isPrimeNumber(long number) {
        long num = 2;
        while (number % num != 0) {
            num++;
        }
        if(num == number){
            return true;
        }else{
            return false;
        }
    }


    // Getters Setters.
    public long getStartRange() {
        return startRange;
    }

    public void setStartRange(long startRange) {
        this.startRange = startRange;
    }

    public long getEndRange() {
        return endRange;
    }

    public void setEndRange(long endRange) {
        this.endRange = endRange;
    }
}

/*
        Question18 question18 = new Question18();
        question18.input();
        question18.findPrimeNumbers();
 */