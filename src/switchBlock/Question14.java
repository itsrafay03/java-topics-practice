// Write a java program to read gender (M/F) and print corresponding gender using switch?
package switchBlock;

import java.util.Scanner;

public class Question14 {
    static Scanner scanner = new Scanner(System.in);
    private char gender;

    public Question14() {
    }

    public Question14(char gender) {
        this.gender = gender;
    }

    public void input(){
        System.out.print("Enter the gender : ");
        setGender(scanner.next().charAt(0));
    }

    public String display_gender(){
        return switch (getGender()){
            case 'M','m' -> "Male.";
            case 'F','f' -> "Female.";
            default -> "Gay.";
        };
    }



    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

/*

        Question14 question14 = new Question14();
        question14.input();
        System.out.println("Gender is "+question14.display_gender());
 */