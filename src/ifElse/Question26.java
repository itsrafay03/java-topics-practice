// Write a java program to check whether a character is an alphabet, digit or special character?
package ifElse;

import java.util.Scanner;

public class Question26 {
    static Scanner scanner = new Scanner(System.in);
    private char character;
    private String typeOfChar;
    private int asciiChar;

    // Default Constructor.
    public Question26() {
    }

    // Constructor Overloading.
    public Question26(char character) {
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
        if(getAsciiChar()<=32 || getAsciiChar()==127){
            {
                System.out.println("This character is not alphabet, digit or special character.");
            }
        } else {
            {
                if (getAsciiChar()>=48 && getAsciiChar()<=57) {
                    {
                        setTypeOfChar("Digit.");
                    }
                } else if ((getAsciiChar()>=65 && getAsciiChar()<=90) || (getAsciiChar()>=97 && getAsciiChar()<=122)) {
                    {
                        setTypeOfChar("Alphabet.");
                    }
                }else {
                    {
                        setTypeOfChar("Special character.");
                    }
                }
                System.out.println("This character is a "+getTypeOfChar());
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

    public String getTypeOfChar() {
        return typeOfChar;
    }

    public void setTypeOfChar(String typeOfChar) {
        this.typeOfChar = typeOfChar;
    }

    public int getAsciiChar() {
        return asciiChar;
    }

    public void setAsciiChar(int asciiChar) {
        this.asciiChar = asciiChar;
    }
}

/*

        Question26 question26 = new Question26();
        question26.input();
        question26.asciiOfChar();
        question26.charType();
 */
