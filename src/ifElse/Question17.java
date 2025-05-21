// Write a java program to check whether an entered character is lowercase (a to z) or
// uppercase (A to Z)?
package ifElse;

import java.util.Scanner;

public class Question17 {
    static Scanner scanner = new Scanner(System.in);
    private char alphabet;

    // Default Constructor.
    public Question17() {
    }

    // Constructor Overloading.
    public Question17(char alphabet) {
        this.alphabet = alphabet;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter any Alphabet character : ");
        setAlphabet(scanner.next().charAt(0));
    }

    // Method to check the Case of the entered alphabet character.
    public void characterCase(){
        int asciiNum = (int)getAlphabet();
        if(asciiNum >= 65 && asciiNum <= 90) {     // in ascii code A=65 and Z=90
            {
                System.out.printf("Entered character is '" + getAlphabet() + "' which is Uppercase.");
            }
        } else if (asciiNum >= 97 && asciiNum <= 122) {     // in ascii code a=97 and z=122
            {
                System.out.printf("Entered character is '" + getAlphabet() + "' which is Lowercase.");
            }
        }else {
            {
                System.out.println("Your entered character is not alphabet character.");
            }
        }
    }


    // Getter Setter.
    public char getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(char alphabet) {
        this.alphabet = alphabet;
    }
}

/*
        Question17 question17 = new Question17();
        question17.input();
        question17.characterCase();
 */