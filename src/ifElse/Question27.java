// Write a java program to check whether an alphabet is a vowel or consonant?
package ifElse;

import java.util.Scanner;

public class Question27 {
    static Scanner scanner = new Scanner(System.in);
    private char character;
    private int asciiChar;

    // Default Constructor.
    public Question27() {
    }

    // Constructor Overloading.
    public Question27(char character) {
        this.character = character;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the character : ");
        setCharacter(scanner.next().charAt(0));
    }

    public void asciiOfChar(){
        setAsciiChar((int)getCharacter());
        System.out.println("The Ascii code of entered character is: "+getAsciiChar());
    }

    // Method to check which character type is the entered character.
    public void charType(){
        if((getAsciiChar()>=65 && getAsciiChar()<=90) || (getAsciiChar()>=97 && getAsciiChar()<=122)){
            {
                if(getAsciiChar()==65 || getAsciiChar()==69 || getAsciiChar()==73 || getAsciiChar()==79 || getAsciiChar()==85 || getAsciiChar()==97 || getAsciiChar()==101 || getAsciiChar()==105 || getAsciiChar()==111 || getAsciiChar()==117){
                    {
                        System.out.println("This character is Vowel.");
                    }
                }else{
                    {
                        System.out.println("This character is Consonant.");
                    }
                }
            }
        } else {
            {
                System.out.println("Sorry. This character is not Alphabet.");
            }
        }
    }


    // Getters Setters.
    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getAsciiChar() {
        return asciiChar;
    }

    public void setAsciiChar(int asciiChar) {
        this.asciiChar = asciiChar;
    }
}

/*
        Question27 question27 = new Question27();
        question27.input();
        question27.asciiOfChar();
        question27.charType();
 */