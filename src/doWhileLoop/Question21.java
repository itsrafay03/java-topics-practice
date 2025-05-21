// Write a Java program to enter a number and print it in words up to 10?
package doWhileLoop;

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

//    public void checkNumber(){
//        if(getNumber() < 0){
//            setNumber(-getNumber());
//        }else{
//            setNumber(getNumber());
//        }
//    }

    private String displayReverseNumber(){
        int count;
        String digit = "";
        do{
            count = getNumber() % 10;
            digit = digit + count;
            setNumber(getNumber() / 10);
        } while(getNumber() > 0);
        return digit;
    }

    public void displayNumberInWords(){
        int value = Integer.parseInt(displayReverseNumber());
        int last_digit;
        do{
            last_digit = value % 10;
            switch (last_digit) {
                case 0 -> System.out.print("zero ");
                case 1 -> System.out.print("one ");
                case 2 -> System.out.print("two ");
                case 3 -> System.out.print("three ");
                case 4 -> System.out.print("four ");
                case 5 -> System.out.print("five ");
                case 6 -> System.out.print("six ");
                case 7 -> System.out.print("seven ");
                case 8 -> System.out.print("eight ");
                case 9 -> System.out.print("nine ");
                default -> System.out.print("invalid number ");
            }
            value = (value / 10);
        } while(value > 0);
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
        question21.displayNumberInWords();
 */