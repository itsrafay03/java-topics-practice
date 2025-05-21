/*
 Write a java program a school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade?

 */
package ifElse;

import java.util.Scanner;

public class Question11 {
    static Scanner scanner = new Scanner(System.in);
    private byte marks;
    private char grade;

    // Default Constructor.
    public Question11() {
    }

    // Constructor Overloading.
    public Question11(byte marks) {
        this.marks = marks;
    }

    // Input Method.
    public void input(){
        System.out.print("Total marks of a subject is 100.\nEnter the obtained Marks : ");
        setMarks(scanner.nextByte());
    }

    // Method to grade the marks.
    public void grading(){
        if(getMarks()>80){
            {
                setGrade('A');
            }
        } else if (getMarks()>60 && getMarks()<=80) {
            {
                setGrade('B');
            }
        } else if (getMarks()>50 && getMarks()<=60) {
            {
                setGrade('C');
            }
        } else if (getMarks()>45 && getMarks()<=50) {
            {
                setGrade('D');
            }
        } else if (getMarks()>25 && getMarks()<=45) {
            {
                setGrade('B');
            }
        }else{
            {
                setGrade('F');
            }
        }
        //System.out.println(getMarks());
        System.out.print("Grade: "+getGrade());
    }


    // Getters Setters.
    public byte getMarks() {
        return marks;
    }

    public void setMarks(byte marks) {
        if(marks>=0 && marks<=100){
            {
                this.marks = marks;
            }
        }else{
            {
                System.out.print("Sorry. Please enter correct Marks.");
                input();
            }
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}

/*
        Question11 question11 = new Question11();
        question11.input();
        question11.grading();
 */