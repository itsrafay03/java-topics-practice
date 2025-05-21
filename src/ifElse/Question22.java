// Write a java program to read roll no, name and marks of three subjects and
// calculate the total, percentage and division?
package ifElse;

import java.util.Scanner;

public class Question22 {
    static Scanner scanner = new Scanner(System.in);
    private int rollNo;
    private String name;
    private int marksS1;
    private int marksS2;
    private int marksS3;
    private int obtainedMarks;
    private float percentage;
    private char division;
    public static final int totalMarks = 300;



    // Default Constructor.
    public Question22() {
    }

    // Constructor Overloading.
    public Question22(int rollNo, String name, int marksS1, int marksS2, int marksS3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marksS1 = marksS1;
        this.marksS2 = marksS2;
        this.marksS3 = marksS3;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your Roll.no : ");
        setRollNo(scanner.nextInt());
        System.out.print("Enter your Name : ");
        setName(scanner.nextLine());
        scanner.nextLine();
        System.out.print("Enter your marks of Math : ");
        setMarksS1(scanner.nextInt());
        System.out.print("Enter your marks of Physics : ");
        setMarksS2(scanner.nextInt());
        System.out.print("Enter your marks of Chemistry : ");
        setMarksS3(scanner.nextInt());
    }

    // Calculate total marks Method.
    public void calcObtainedMarks(){
        setObtainedMarks(getMarksS1()+getMarksS2()+getMarksS3());
        System.out.println("Your total Obtained marks are : "+getObtainedMarks()+"/"+totalMarks);
    }

    // Calculate percentage of obtained marks.
    public void calcPercentage(){
        setPercentage(((float) getObtainedMarks() /totalMarks)*100);
        System.out.println("Your total Percentage is : "+getPercentage()+"%");
    }

    public void calcDivision(){
        if(getPercentage()>=50){
            {
                if(getPercentage()>=80){
                    {
                        setDivision('A');
                    }
                }else if(getPercentage()>=60){
                    {
                        setDivision('B');
                    }
                }else{
                    setDivision('C');
                }
                System.out.println("Your Division is : "+getDivision());
            }
        }else {
            {
                System.out.println("You are Failed.");
            }
        }
    }


    // Getters Setters.
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarksS1() {
        return marksS1;
    }

    public void setMarksS1(int marksS1) {
        this.marksS1 = marksS1;
    }

    public int getMarksS2() {
        return marksS2;
    }

    public void setMarksS2(int marksS2) {
        this.marksS2 = marksS2;
    }

    public int getMarksS3() {
        return marksS3;
    }

    public void setMarksS3(int marksS3) {
        this.marksS3 = marksS3;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Question22.scanner = scanner;
    }

    public int getObtainedMarks() {
        return obtainedMarks;
    }

    public void setObtainedMarks(int obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }
}
/*
        Question22 question22 = new Question22();
        question22.input();
        question22.calcObtainedMarks();
        question22.calcPercentage();
        question22.calcDivision();
 */
