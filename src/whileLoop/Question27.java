// Write a Java program to find LCM of two numbers?
package whileLoop;

import java.util.Scanner;

public class Question27 {
    static Scanner scanner = new Scanner(System.in);
    private long number1;
    private long number2;

    public Question27() {
    }

    public Question27(long number1, long number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void input(){
        System.out.print("Enter first_number : ");
        setNumber1(scanner.nextLong());
        System.out.print("Enter second_number : ");
        setNumber2(scanner.nextLong());
    }

    public void calculateLCM(){
        long maxNumber;
        long minNumber;
        if(getNumber1() > getNumber2()){
            maxNumber = getNumber1();
            minNumber = getNumber2();
        }else{
            maxNumber = getNumber2();
            minNumber = getNumber1();
        }

        long multipleOfMax = 0;
        long multipleOfMin = 1;
        long constantOfMax = 1;
        long constantOfMin = 1;
        while(multipleOfMax != multipleOfMin){
            multipleOfMax = maxNumber * constantOfMax;
            while (multipleOfMin <= multipleOfMax) {
                multipleOfMin = minNumber * constantOfMin;
                constantOfMin++;
                if (multipleOfMax == multipleOfMin) {
                    System.out.println("LCM : " + multipleOfMin);
                    break;
                }
            }
            constantOfMax++;
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
        Question27 question27 = new Question27();
        question27.input();
        question27.calculateLCM();
 */