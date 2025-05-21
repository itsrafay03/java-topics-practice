// Statement :  Create a student class with following attributes and behaviors.

package inputOutput;

import java.util.Scanner;

public class Question10 {
    static Scanner scanner = new Scanner(System.in);
    private String name;
    private int rollNo;
    private float fee;
    private int studentCount;

    // Default Constructor.
    public Question10(){

    }
    // Constructor Overloading.
    public Question10(String name){
        this.name = name;
    }
    public Question10(int rollNo){
        this.rollNo = rollNo;
    }
    public Question10(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public Question10(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    public Question10(String name, int rollNo, float fee, int studentCount) {
        this.name = name;
        this.rollNo = rollNo;
        this.fee = fee;
        this.studentCount = studentCount;
    }
    // Copy Constructor.
    public Question10(Question10 s){
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.fee = s.fee;
        this.studentCount = s.studentCount;
    }


    public void feeWithoutDiscount(){
        System.out.println("Fee without discount is: $"+getFee());
        this.fee = getFee();
    }
    public void feeWithDiscount(){
        System.out.print("Enter the Percent of discount: ");
        float a = scanner.nextInt();
        System.out.printf("Fee with discount is: $%.2f",getFee()-(getFee()*(a/100)));
        this.fee = getFee()-(getFee()*(a/100));
    }
    public void calcAvg(int lastYearMarks , int presentYearMarks){
        System.out.println("Average of Marks is "+(lastYearMarks+presentYearMarks)/2);
    }
//    public void calcPercentage(int totalMarks , int obtainMarks){
//        System.out.printf("Percentage of Marks is %d",(obtainMarks/totalMarks));
//    }
    public void calcPercentage(int obtainMarks, int totalMarks){
        System.out.println("Average of Marks is "+ (obtainMarks*100)/totalMarks+"%");
    }
    public void printDataMembers(){
        System.out.println("\n\nHere is the detail of Student: ");
        System.out.println("\nName: "+getName());
        System.out.println("RollNo: "+getRollNo());
        System.out.println("fee: "+getFee());
        System.out.println("Student count: "+getStudentCount());
    }



    // Setters Getters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
}


//        Question10 question10 = new Question10();
//        question10.setName("Rafay Khan");
//        question10.setRollNo(7);
//        question10.setFee(2000);
//        question10.feeWithoutDiscount();
//        question10.feeWithDiscount();
//        question10.setStudentCount(10);
//        question10.printDataMembers();
//        question10.calcAvg(998,954);
//        question10.calcPercentage(954, 1100);
