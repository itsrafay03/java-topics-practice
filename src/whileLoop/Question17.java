// Write a Java program to swap first and last digits of a number?
package whileLoop;

import java.util.Scanner;

public class Question17 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question17() {
    }

    public Question17(int number) {
        this.number = number;
    }

    private void input(){
        System.out.print("Enter number : ");
        setNumber(scanner.nextInt());
    }

    private int first_number(){
        int actualNumber = getNumber();
        int first_digit = 0;
        while(actualNumber > 0){
            first_digit = actualNumber % 10;
            actualNumber = actualNumber / 10;
        }
        return first_digit;
    }

    private int last_number(){
        int realNumber = getNumber();
        return realNumber % 10;
    }

    private int lengthOfNumber(){
        int actualNumber = getNumber();
        int length =0;
        int digit;
        while (actualNumber>0){
            digit = actualNumber %10;
            actualNumber /= 10;
            length++;
        }
        return length;
    }

    public int swapNumber(){
        input();
        int first_digit = first_number();
        int last_digit = last_number();
        int lengthOfNumber = lengthOfNumber();
        int half_swap = (getNumber() - last_digit) + first_digit;
        //System.out.println(half_swap);
        while(lengthOfNumber > 1){
            first_digit *= 10;
            last_digit *= 10;
            lengthOfNumber--;
        }
        //System.out.println(first_digit+" and "+last_digit);
        int full_swap = (half_swap - first_digit);
        full_swap += last_digit;
        System.out.print("Swapped Number: ");
        return full_swap;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}

/*
        Question17 question17 = new Question17();
        System.out.println(question17.swapNumber());
 */