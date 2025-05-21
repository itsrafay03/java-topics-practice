// Write a Java program to check whether a number is palindrome or not?
package doWhileLoop;

import java.util.Scanner;

public class Question19 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question19() {
    }

    public Question19(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public void checkPalindromeNumber() {
        int reverseOfNumber;
        String stringOfReverseNumber = "";
        String stringOfActualNumbers = String.valueOf(getNumber());
        do{
            reverseOfNumber = getNumber() % 10;
            stringOfReverseNumber += reverseOfNumber;
            setNumber(getNumber() / 10);
        } while(getNumber() > 0);

        System.out.println("Actual Number : "+stringOfActualNumbers);
        System.out.println("Reverse Number : "+stringOfReverseNumber);

        if(stringOfActualNumbers.equals(stringOfReverseNumber)){
            System.out.println("Yes, "+stringOfActualNumbers+" is Palindrome number.");
        }else{
            System.out.println("No, "+stringOfActualNumbers+" is not Palindrome number.");
        }
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question19 question19 = new Question19();
        question19.input();
        question19.checkPalindromeNumber();
 */