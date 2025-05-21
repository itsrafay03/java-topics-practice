// Statement :  Take a string as input from user and print length of its first word.

package inputOutput;

import java.util.Scanner;

public class Question7 {
    private int wordLength;
    public Question7(){

    }
    public Question7(int wordLength) {
        this.wordLength = wordLength;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Sentence: ");
        setEnterString(scanner.next().length());
    }

    public void output(){
        System.out.print("The length of its first word of sentence is "+getEnterString());
    }

    // Getters Setters/
    public int getEnterString() {
        return wordLength;
    }

    public void setEnterString(int wordLength) {
        this.wordLength = wordLength;
    }
}


//        Question7 question7 = new Question7();
//        question7.input();
//        question7.output();
