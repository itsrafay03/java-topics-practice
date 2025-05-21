/* Write a Java program to find the perfect numbers(A perfect number is a positive
 integer that equals the sum of its proper divisors (excluding itself). For
 example, 6 is a perfect number because its proper divisors are 1, 2, and 3,
 and 1 + 2 + 3 = 6.) within a given number of ranges?
*/

package forLoop;


import java.util.Scanner;

public class Question17 {
    static Scanner scanner = new Scanner(System.in);
    private long startRange;
    private long endRange;

    public Question17() {
    }

    public Question17(long startRange, long endRange) {
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

    // Method to find factors of a number and also their Sum.
    private long sumOFFactorsOfCurrentNumber(long num){
        long factor = 1;
        long sum = 0;
        while(factor < num){
            if(num % factor == 0){
                sum += factor;
            }
            factor++;
        }
        return sum;
    }

    // Method to find the Perfect numbers between given range.
    public void findPerfectNumber(){
        System.out.println("The Perfect numbers between "+getStartRange()+" and "+getEndRange()+" are : ");
        for (long currentNumber = getStartRange(); currentNumber <= getEndRange(); currentNumber++) {
            if(currentNumber == sumOFFactorsOfCurrentNumber(currentNumber)){
                System.out.println(currentNumber);
            }
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
        Question17 question17 = new Question17();
        question17.input();
        question17.findPerfectNumber();
 */