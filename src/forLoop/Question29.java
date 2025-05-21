// Write a Java program to print a string in reverse order?
package forLoop;

import java.util.Scanner;

public class Question29 {
    static Scanner scanner = new Scanner(System.in);
    private String inputString;

    public Question29() {
    }

    public Question29(String inputString) {
        this.inputString = inputString;
    }

    public void input(){
        System.out.print("Enter the String : ");
        setInputString(scanner.nextLine());
    }

    public void reverse(){
        int length = getInputString().length();
        for (int index = length; index >= 1; index--) {
            System.out.print(getInputString().charAt(index-1));
        }
    }



    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }
}

/*
        Question29 question29 = new Question29();
        question29.input();
        question29.reverse();
 */