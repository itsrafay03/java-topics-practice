// Write a Java program to find HCF (GCD) of two numbers?
package whileLoop;

import java.util.Scanner;

public class Question28 {
    static Scanner scanner = new Scanner(System.in);
    private long number1;
    private long number2;

    public Question28() {
    }

    public Question28(long number1, long number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void input(){
        System.out.print("Enter first_number : ");
        setNumber1(scanner.nextLong());
        System.out.print("Enter second_number : ");
        setNumber2(scanner.nextLong());
    }


    public void calculateHCF(){
        long maxNumber;
        long minNumber;
        long factorOfMax;
        long factorOfMin;
        if(getNumber1() > getNumber2()){
            maxNumber = getNumber1();
            minNumber = getNumber2();
        }else{
            maxNumber = getNumber2();
            minNumber = getNumber1();
        }

        long count  = minNumber;
        while (count >= 0){
            factorOfMin = minNumber % count;
            if(factorOfMin == 0){
                factorOfMax = maxNumber % count;
                if(factorOfMax == 0){
                    System.out.println("HCF : " + count);
                    break;
                }
            }
//            if (minNumber % count ==0 && maxNumber % count ==0) {
//                System.out.println("HCF : " + count);
//                break;
//            }
            count--;
        }
    }


    public long getNumber1() {
        return number1;
    }

    public void setNumber1(long number1) {
        this.number1 = number1;
    }

    public long getNumber2() {
        return number2;
    }

    public void setNumber2(long number2) {
        this.number2 = number2;
    }
}

/*
        Question28 question28 = new Question28();
        question28.input();
        question28.calculateHCF();
 */
