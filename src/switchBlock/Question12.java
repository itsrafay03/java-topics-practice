// Write a java program to check password is correct or incorrect using switch-case?
package switchBlock;

import java.util.Scanner;

public class Question12 {
    static Scanner scanner = new Scanner(System.in);
    private static final String password= "Cas.220";
    private String input_password;

    public Question12() {
    }

    public Question12(String input_password) {
        this.input_password = input_password;
    }

    public void input(){
        System.out.print("Enter the password : ");
        setInput_password(scanner.nextLine());
    }

    public String check_Password(){
        return switch (getInput_password()){
            case password -> "Yes, Correct Password.";
            default -> "Sorry, Incorrect Password.";
        };
    }


    public String getInput_password() {
        return input_password;
    }

    public void setInput_password(String input_password) {
        this.input_password = input_password;
    }
}

/*
        Question12 question12 = new Question12();
        question12.input();
        System.out.println(question12.check_Password());
 */