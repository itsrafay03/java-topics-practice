// Write a Java program to find the length of a string without using the library function?
package forLoop;

import java.util.Scanner;

public class Question30 {
    static Scanner scanner = new Scanner(System.in);
    private String inputString;

    public Question30() {
    }

    public Question30(String inputString) {
        this.inputString = inputString;
    }

    public void input(){
        System.out.print("Enter the String : ");
        setInputString(scanner.nextLine());
    }

    public void lengthOfString(){
        int countChar = 0;
        try {
            for (int chrs = 0; chrs < getInputString().charAt(chrs); chrs++) {
                countChar++;
            }
        }catch (Exception ex){
            System.out.println("The Length of String is : "+ countChar);
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
        Question30 question30 = new Question30();
        question30.input();
        question30.lengthOfString();
 */