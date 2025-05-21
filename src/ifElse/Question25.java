// Write a java program to check whether a triangle can be formed by the given value
// for the angles?
package ifElse;

import ifElse.Question24;

import java.util.Scanner;

public class Question25 {
    static Scanner scanner = new Scanner(System.in);
    private short angle1;
    private short angle2;
    private short angle3;
    private short sumAngles;
    public static final short totalAnglesOfTriangle = 180;

    // Default Constructor.
    public Question25() {
    }

    // Constructor Overloading.
    public Question25(short angle1, short angle2, short angle3) {
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    // Input Method.
    public void input(){
        System.out.println("There are 3 angles in Triangle and their sum is 180 degrees.");
        System.out.print("Enter value of first_angle : ");
        setAngle1(scanner.nextShort());
        System.out.print("Enter value of second_angle : ");
        setAngle2(scanner.nextShort());
        System.out.print("Enter value of third_angle : ");
        setAngle3(scanner.nextShort());
    }

    // Method to sum three angles of triangle.
    public void sumOfTriangle(){
        setSumAngles((short)(getAngle1()+getAngle2()+getAngle3()));
        System.out.println("Sum of triangle : "+getSumAngles());
    }
    // Method to check that Triangle will form or not.
    public void determineTriangle(){
        if(getSumAngles() == totalAnglesOfTriangle){
            {
                System.out.println("Yes, a triangle can be formed by the given value of the angles.");
            }
        }else {
            {
                System.out.println("No, a triangle can not be formed by the given value of the angles.As it's angle sum is not equal to 180 degrees.");
            }
        }
    }


    // Getters Setters.
    public short getAngle1() {
        return angle1;
    }

    public void setAngle1(short angle1) {
        if(angle1>=0 && angle1<=180){
            {
                this.angle1 = angle1;
            }
//        }else{
//            {
//                System.out.println("Incorrect value. Enter value between 0 and 180.");
//
//            }
        }
    }

    public short getAngle2() {
        return angle2;
    }

    public void setAngle2(short angle2) {
        if(angle2>=0 && angle2<=180){
            {
                this.angle2 = angle2;
            }
        }else{
            {
                System.out.println("Incorrect value. Enter value between 0 and 180.");
            }
        }
    }

    public short getAngle3() {
        return angle3;
    }

    public void setAngle3(short angle3) {
        if(angle3>=0 && angle3<=180){
            {
                this.angle3 = angle3;
            }
        }else{
            {
                System.out.println("Incorrect value. Enter value between 0 and 180.");
            }
        }
    }

    public short getSumAngles() {
        return sumAngles;
    }

    public void setSumAngles(short sumAngles) {
        this.sumAngles = sumAngles;
    }
}

/*
        Question25 question25 = new Question25();
        question25.input();
        question25.sumOfTriangle();
        question25.determineTriangle();
 */
