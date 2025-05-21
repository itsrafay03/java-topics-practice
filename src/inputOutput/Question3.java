// Statement : 3. Take a char as input from user and print its ASCII value.

package inputOutput;

import java.util.Scanner;

public class Question3 {
    char character;
    public Question3(){

    }

    public Question3(char character) {
        this.character = character;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Section(Character) : ");
        setCharacter(scanner.next().charAt(0));
    }

    public void output(){
        System.out.print("The ASCII value of the section is "+(int)getCharacter());
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }
}


//        Question3 question3 = new Question3();
//        question3.input();
//        question3.output();