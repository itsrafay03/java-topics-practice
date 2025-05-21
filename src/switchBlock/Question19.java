/*
Take a long type as input , find its last digit and do the following computations
accordingly:
if last digit is 1 , divide number by 10
if last digit is 5 , divide number by 100
if last digit is 9 , divide number by 1000
if last digit is any other than above described , divide number by 20.
 */
package switchBlock;

import java.util.Scanner;

public class Question19 {
    static Scanner scanner = new Scanner(System.in);
    private long number;
    private byte lastDigit;

    public Question19() {
    }

    public Question19(long number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextLong());
    }

    private long checkLastDigit(){
        setLastDigit((byte)(getNumber()%10));
        return getLastDigit();
    }

    public double calculation(){
        return switch (getLastDigit()){
          case 1 -> (double) getNumber() /10;
          case 5 -> (double) getNumber() /100;
          case 9 -> (double) getNumber() /1000;
          default -> (double) getNumber() /20;
        };
    }


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public byte getLastDigit() {
        return lastDigit;
    }

    public void setLastDigit(byte lastDigit) {
        this.lastDigit = lastDigit;
    }
}

/*
        Question19 question19 = new Question19();
        question19.input();
        System.out.println("Result: "+question19.calculation());
 */