// Write a program to print remark according to the grade obtained using switch statement?
package switchBlock;

import java.util.Scanner;

public class Question17 {
    static Scanner scanner = new Scanner(System.in);
    private char grade;

    public Question17() {
    }

    public Question17(char grade) {
        this.grade = grade;
    }

    public void input(){
        System.out.print("Enter your grade : ");
        setGrade(scanner.next().charAt(0));
    }

    public String grade_remark(){
        return switch (getGrade()){
            case 'A','a' -> "Excellent performance.";
            case 'B','b' -> "Good performance.";
            case 'C','c' -> "Average performance.";
            case 'D','d' -> "Needs improvement.";
            case 'E','e' -> "Needs hardworking.";
            case 'F','f' -> "Sorry! you are Failed.";
            default -> "No remarks.";
        };
    }


        public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}

/*
        Question17 question17 = new Question17();
        question17.input();
        System.out.println(question17.grade_remark());
 */