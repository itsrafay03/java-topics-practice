// Write a Java program that reads a set of integers, and then prints the sum of the
// even and odd integers?
package doWhileLoop;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Question4 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question4() {
    }

    public Question4(int number) {
        this.number = number;
    }


    public void calculateSum(){
        System.out.println("Enter \"y\" for 'Yes' and any other key for 'No'.");
        int evenSum = 0;
        int oddSum = 0;
        char askNext;
        do{
            System.out.print("Enter the Number : ");
            setNumber(scanner.nextInt());
            if(getNumber() % 2 == 0){
                evenSum += getNumber();
            }else{
                oddSum += getNumber();
            }

            System.out.print("Do you want to Enter another number? : ");
            askNext = scanner.next().toLowerCase().charAt(0);

        } while(askNext == 'y');
        System.out.println("Sum of entered Even numbers : "+evenSum);
        System.out.println("Sum of entered Odd numbers : "+oddSum);
    }

//    public void calculateSum(){
//        System.out.print("When you want to quit enter any other key.\nEnter the Number : ");
//        int evenSum = 0;
//        int oddSum = 0;
//        do{
//            setNumber(scanner.nextInt());
//            if(getNumber() % 2 == 0){
//                evenSum += getNumber();
//            }else{
//                oddSum += getNumber();
//            }
//            System.out.print("Enter the Number : ");
//        } while(scanner.hasNextInt());
//        System.out.println("Sum of entered Even numbers : "+evenSum);
//        System.out.println("Sum of entered Odd numbers : "+oddSum);
//    }




    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question4 question4 = new Question4();
        question4.calculateSum();
 */