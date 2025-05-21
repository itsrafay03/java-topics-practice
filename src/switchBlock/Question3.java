// Write a java program to check whether an alphabet is vowel or consonant using switch case?
package switchBlock;

import java.util.Scanner;

public class Question3 {
    static Scanner scanner = new Scanner(System.in);
    private char alphabet;

    // Default Constructor.
    public Question3() {
    }

    // Constructor Overloading.
    public Question3(char alphabet) {
        this.alphabet = alphabet;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the alphabet character : ");
        setAlphabet(scanner.next().toLowerCase().charAt(0));
    }

//    public String checkVowel(){
//        switch (getAlphabet()){
//            case 'A':
//            case 'a':
//            case 'E':
//            case 'e':
//            case 'I':
//            case 'i':
//            case 'O':
//            case 'o':
//            case 'U':
//            case 'u':
//                return "You entered a Vowel : "+getAlphabet();
//            default:
//                return "You entered a Consonant : "+getAlphabet();
//        }
//    }


    public String checkVowel(){
        return switch (getAlphabet()){
            case 'a', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> "You entered a Vowel : "+getAlphabet();
            default -> "You entered a Consonant : "+getAlphabet();
        };
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

        Question3 question3 = new Question3();
        question3.input();
        System.out.println(question3.checkVowel());
 */