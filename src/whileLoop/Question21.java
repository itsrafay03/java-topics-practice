// Write a Java program to check whether a number is palindrome(that remain same
// when digits are reversed, e.g: 16461) or not?
package whileLoop;

import java.util.Scanner;

public class Question21 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question21() {
    }

    public Question21(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public void checkPalindrome() {
        int reverseOfNumber;
        String stringOfReverseNumber = "";
        String stringOfActualNumbers = String.valueOf(getNumber());


        //System.out.println(getNumber());
        while(getNumber()>0){
            reverseOfNumber = getNumber()%10;
            stringOfReverseNumber += reverseOfNumber;
            setNumber(getNumber()/10);
        }
        //System.out.println("Reverse Number : "+stringOfReverseNumber);


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
        Question21 question21 = new Question21();
        question21.input();
        question21.checkPalindrome();
 */

