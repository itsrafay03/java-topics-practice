/*
Write a java program a student will not be allowed to sit in exam if his/her
attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print percentage of class attended
Is student is allowed to sit in exam or not.
 */
package ifElse;

import java.util.Scanner;

public class Question14 {
    static Scanner scanner = new Scanner(System.in);
    private int classesHeld;
    private int classesAttended;
    private float attendance;
    public static final float attendance_Percentage_Limit = 75;

    // Default Constructor.
    public Question14() {
    }

    // Constructor Overloading.
    public Question14(int classesHeld, int classesAttended) {
        this.classesHeld = classesHeld;
        this.classesAttended = classesAttended;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter number of classes held : ");
        setClassesHeld(scanner.nextInt());
        System.out.print("Enter number of classes attended : ");
        setClassesAttended(scanner.nextInt());
    }

    // Method to calculate the percentage of attendance of student.
    private void calcAttendance(){
        setAttendance(((float) getClassesAttended() /getClassesHeld())*100);
        System.out.println("The percentage of class attended by Student is "+getAttendance()+"%");
    }

    // Method to tell the permission to sit in exam.
    public void permission() {
        calcAttendance();
        if (getAttendance() >= attendance_Percentage_Limit) {
            {
                System.out.print("Yes, Student is allowed to sit in exam.");
            }
        } else {
            {
                System.out.print("No, Student is not allowed to sit in exam.");
            }
        }
    }


    // Getters Setters.
    public int getClassesHeld() {
        return classesHeld;
    }

    public void setClassesHeld(int classesHeld) {
        this.classesHeld = classesHeld;
    }

    public int getClassesAttended() {
        return classesAttended;
    }

    public void setClassesAttended(int classesAttended) {
        this.classesAttended = classesAttended;
    }

    public float getAttendance() {
        return attendance;
    }

    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }
}

/*
        Question14 question14 = new Question14();
        question14.input();
        question14.permission();
 */