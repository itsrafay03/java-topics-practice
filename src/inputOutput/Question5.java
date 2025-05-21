// Statement : Prompt user to enter Marks in different subjects of a student and print total marks and their percentage.

package inputOutput;

import java.util.Scanner;

public class Question5 {
    private float mathMarks;
    private float computerMarks;
    private float physicsMarks;
    private float chemistryMarks;
    private float biologyMarks;
    private float englishMarks;
    private float urduMarks;
    private float grandTotal;
    private float sumMarks;
    private float averageMarks;


    public Question5(){

    }

    public Question5(float mathMarks, float computerMarks, float physicsMarks, float chemistryMarks, float biologyMarks, float englishMarks, float urduMarks, float grandTotal, float sumMarks, float averageMarks) {
        this.mathMarks = mathMarks;
        this.computerMarks = computerMarks;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.biologyMarks = biologyMarks;
        this.englishMarks = englishMarks;
        this.urduMarks = urduMarks;
        this.grandTotal = grandTotal;
        this.sumMarks = sumMarks;
        this.averageMarks = averageMarks;
    }

    public void inputMarks(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Total marks of all 7 Subjects: ");
        setGrandTotal(scanner.nextFloat());
        System.out.println("Now enter all the Subjects Marks.");
        System.out.print("Enter Math marks: ");
        setMathMarks(scanner.nextFloat());
        System.out.print("Enter Computer marks: ");
        setComputerMarks(scanner.nextFloat());
        System.out.print("Enter Physics marks: ");
        setPhysicsMarks(scanner.nextFloat());
        System.out.print("Enter Chemistry marks: ");
        setChemistryMarks(scanner.nextFloat());
        System.out.print("Enter Biology marks: ");
        setBiologyMarks(scanner.nextFloat());
        System.out.print("Enter English marks: ");
        setEnglishMarks(scanner.nextFloat());
        System.out.print("Enter Urdu marks: ");
        setUrduMarks(scanner.nextFloat());
    }

    private void sum(){
        setSumMarks(getMathMarks()+getComputerMarks()+getPhysicsMarks()+getChemistryMarks()+getBiologyMarks()+getEnglishMarks()+getUrduMarks());
        System.out.println("\nThe Total Obtained Marks are: "+getSumMarks()+"/"+(int)getGrandTotal());
    }

    private void average(){
        setAverageMarks((getSumMarks()/getGrandTotal())*100);
        System.out.printf("The Average Marks is %.2f",getAverageMarks(),"%");
    }

    public void outputMarks(){
        sum();
        average();
    }


    // Getter Setters.


    private float getMathMarks() {
        return mathMarks;
    }

    private void setMathMarks(float mathMarks) {
        this.mathMarks = mathMarks;
    }

    private float getComputerMarks() {
        return computerMarks;
    }

    private void setComputerMarks(float computerMarks) {
        this.computerMarks = computerMarks;
    }

    private float getPhysicsMarks() {
        return physicsMarks;
    }

    private void setPhysicsMarks(float physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    private float getChemistryMarks() {
        return chemistryMarks;
    }

    private void setChemistryMarks(float chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    private float getBiologyMarks() {
        return biologyMarks;
    }

    private void setBiologyMarks(float biologyMarks) {
        this.biologyMarks = biologyMarks;
    }

    private float getEnglishMarks() {
        return englishMarks;
    }

    private void setEnglishMarks(float englishMarks) {
        this.englishMarks = englishMarks;
    }

    private float getUrduMarks() {
        return urduMarks;
    }

    private void setUrduMarks(float urduMarks) {
        this.urduMarks = urduMarks;
    }

    private float getGrandTotal() {
        return grandTotal;
    }

    private void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    private float getSumMarks() {
        return sumMarks;
    }

    private void setSumMarks(float sumMarks) {
        this.sumMarks = sumMarks;
    }

    private float getAverageMarks() {
        return averageMarks;
    }

    private void setAverageMarks(float averageMarks) {
        this.averageMarks = averageMarks;
    }
}


//        Question5 question5 = new Question5();
//        question5.inputMarks();
//        question5.outputMarks();