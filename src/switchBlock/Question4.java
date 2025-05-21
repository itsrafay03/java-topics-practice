// Write a java program to check whether a given character is alphabet , number , or
// special character ?
package switchBlock;

import java.util.Scanner;

public class Question4 {
    static Scanner scanner = new Scanner(System.in);
    private char character;

    // Default Constructor.
    public Question4() {
    }

    // Constructor Overloading.
    public Question4(char character) {
        this.character = character;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the character : ");
        setCharacter(scanner.next().charAt(0));
    }

    public String checkCharacter(){
        return switch (getCharacter()){
            case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' -> "Capital Alphabet.";
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' -> "Small Alphabet.";
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> "Numeric Digit.";
            case '+', '-', '*', '/', '%' -> "Arithmetic Operator.";
            default -> "Special Character.";
        };
    }



    // Getters Setters.
    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }
}

/*
        Question4 question4 = new Question4();
        question4.input();
        System.out.println(question4.checkCharacter());
 */