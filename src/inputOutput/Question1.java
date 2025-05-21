//Statement : Take a Statement as input from user and print its first word.

// This is our package name in which this Question1 is a top-level class.
package inputOutput;

import java.util.Scanner;

public class Question1 {
    String inputStatement;

    // Default constructor.
    public Question1(){

    }

    // Constructor Overloading.
    public Question1(String inputStatement) {
        this.inputStatement = inputStatement;
    }

    // Input Method.
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Statement: ");
        setInputStatement(scanner.next());
    }

    // Output Method.
    public void output(){
        System.out.print("The First word of your sentence is "+getInputStatement());
    }

    // Getter of inputStatement.
    public String getInputStatement() {
        return inputStatement;
    }

    // Setter of inputStatement.
    public void setInputStatement(String inputStatement) {
        this.inputStatement = inputStatement;
    }
}


//        Question1 question1 = new Question1();
//        question1.input();
//        question1.output();
