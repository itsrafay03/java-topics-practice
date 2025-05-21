// Write a java program to display number names of digits of number entered by
// user, for example if number is 231 , the output is two three one.
package whileLoop;

import java.util.Scanner;

public class Question13 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question13() {
    }

    public Question13(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }


    public void numbersInWords() {
        int initialValue = 0;
        int constantOfMod_Div = 10;
        int reverseOfNumber;
        String stringOfReverseNumber = "";
        int actualNumber;
        int countActualNumber;

        System.out.println(getNumber()+" in words is : ");
        //System.out.println(getNumber());
        while (getNumber() > initialValue) {
            reverseOfNumber = getNumber() % constantOfMod_Div;
            //System.out.println("Current digit : "+reverseOfNumber);
            stringOfReverseNumber = stringOfReverseNumber + reverseOfNumber;
            //System.out.println("Number : "+ stringOfReverseNumber);
            //System.out.println(getNumber());
            setNumber(getNumber() /constantOfMod_Div);
        }
        //System.out.println("Reverse Number : "+stringOfReverseNumber);

        actualNumber = Integer.parseInt(stringOfReverseNumber);
        while (actualNumber > initialValue) {
            countActualNumber = actualNumber % constantOfMod_Div;
            //System.out.print("Current counts : " + countActualNumber);
            switch (countActualNumber) {
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
            //System.out.println(actualNumber);
            actualNumber = actualNumber / constantOfMod_Div;
        }
    }

    private int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question13 question13 = new Question13();
        question13.input();
        question13.numbersInWords();
 */