// Write a Java program to check whether a number is Armstrong number(if the sum of
// each digit of the number raise to te power equal to length of the number is equal
// to that number. e.g: 153 as 1^3+5^3+3^3=153 and 1634 as 1^4+6^4+3^4+4^4=1634) or not?
package whileLoop;

import java.util.Scanner;

public class Question23 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question23() {
    }

    public Question23(int number) {
        this.number = number;
    }

    public void input() {
        System.out.print("Enter the number : ");
        setNumber(scanner.nextInt());
    }

    public void checkArmstrongNumber() {
        int initialValue = 0;
        int constantOfMod_Div = 10;
        int digitsOfNumber;
        int lengthOfNumber;
        int lengthOfDigits = 0;
        int actualNumber = getNumber();
        int productOfDigit;
        int armstrongValue = 0;
        while (getNumber() > initialValue) {
            digitsOfNumber = getNumber() % constantOfMod_Div;
            setNumber(getNumber() / constantOfMod_Div);
            lengthOfDigits++;
        }
        //System.out.println(lengthOfDigits);
        int actualNumberValue = actualNumber;
        while (actualNumber > initialValue) {
            digitsOfNumber = actualNumber % constantOfMod_Div;
            lengthOfNumber = lengthOfDigits;
            productOfDigit = 1;
            while(lengthOfNumber>=1){
                productOfDigit *= digitsOfNumber;
                //System.out.println("Digit raise to power : "+productOfDigit);
                lengthOfNumber--;
            }
            armstrongValue += productOfDigit;
            //System.out.println("The ArmStrong value : "+armstrongValue);
            actualNumber = actualNumber / constantOfMod_Div;
        }
        if(actualNumberValue == armstrongValue){
            System.out.println("Yes. "+actualNumberValue+" is an Armstrong Number.");
        }else{
            System.out.println("No. "+actualNumberValue+" is not an Armstrong Number.");
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
        Question23 question23 = new Question23();
        question23.input();
        question23.checkArmstrongNumber();
 */
