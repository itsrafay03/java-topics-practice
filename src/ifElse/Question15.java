// Modify the above question to allow student to sit if he/she has medical cause. Ask
// user if he/she has medical cause or not ('Y' or 'N') and print accordingly?
package ifElse;

import java.util.Scanner;

public class Question15 {
    static Scanner scanner = new Scanner(System.in);
    private int classesHeld;
    private int classesAttended;
    private float attendance;
    private char medicalCause;
    public static final float attendance_Percentage_Limit = 75;

    // Default Constructor.
    public Question15() {
    }

    // Constructor Overloading.
    public Question15(int classesHeld, int classesAttended) {
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

    // Method to check is student has Medical Application or not.
    private void hasMedical(){
        System.out.print("Is student has medical cause or not? Enter ('Y' or 'N') : ");
        setMedicalCause(scanner.next().charAt(0));
    };

    // Method to tell the permission to sit in exam.
    public void permission() {
        calcAttendance();
        if (getAttendance() >= attendance_Percentage_Limit) {
            {
                System.out.print("Yes, Student is allowed to sit in exam.");
            }
        } else {
            {
                hasMedical();
                if(getMedicalCause() == 'Y' || getMedicalCause() == 'y'){
                    {
                        System.out.print("It's Okay, Student is allowed to sit in exam.");
                    }
                }else{
                    {
                        System.out.print("No, Student is not allowed to sit in exam.");
                    }
                }
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

    public char getMedicalCause() {
        return medicalCause;
    }

    public void setMedicalCause(char medicalCause) {
        this.medicalCause = medicalCause;
    }
}

/*
        Question15 question15 = new Question15();
        question15.input();
        question15.permission();
 */
