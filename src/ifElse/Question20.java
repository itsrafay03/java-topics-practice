/*
Write a java program to find the eligibility of admission for a professional course
based on the following criteria:
Eligibility Criteria :
Marks in Math >=65 and
Marks in Phys >=55 and
Marks in Chem >=50
Total in all three subject >=190 or Total in Math and Physics >=140
Input the marks obtained in Physics :65
Input the marks obtained in Chemistry :51
Input the marks obtained in Mathematics :72
Total marks of Math, Physics and Chemistry : 188
Total marks of Math and Physics : 137
The candidate is eligible or not?
 */
package ifElse;

import java.util.Scanner;

public class Question20 {
    static Scanner scanner = new Scanner(System.in);
    private final short minimumMathMarks = 65;
    private final short minimumPhysMarks = 55;
    private final short minimumChemMarks = 50;
    private final short minimumTotalMarks = 190;
    private final short minimumTotalMarksMP = 140;

    private short mathMarks;
    private short physMarks;
    private short chemMarks;
    private short totalMarks;
    private short totalMarksMP;

    // Default Constructor.
    public Question20() {
    }

    // Method Overloading.
    public Question20(byte mathMarks, byte physMarks, byte chemMarks, byte totalMarks, byte totalMarksMP) {
        this.mathMarks = mathMarks;
        this.physMarks = physMarks;
        this.chemMarks = chemMarks;
        this.totalMarks = totalMarks;
        this.totalMarksMP = totalMarksMP;
    }

    // Input Method.
    public void input(){
        System.out.print("Input the marks obtained in Physics : ");
        setPhysMarks(scanner.nextShort());
        System.out.print("Input the marks obtained in Chemistry : ");
        setChemMarks(scanner.nextShort());
        System.out.print("Input the marks obtained in Mathematics : ");
        setMathMarks(scanner.nextShort());


        setTotalMarks((short) (getMathMarks()+getPhysMarks()+getChemMarks()));
        System.out.println("Total marks of Math, Physics and Chemistry : "+getTotalMarks());
        setTotalMarksMP((short) (getMathMarks()+getPhysMarks()));
        System.out.println("Total marks of Math and Physics :  "+getTotalMarksMP());
    }

    // Method to check that candidate is eligible for admission or not.
    public void checkEligible(){
        if(getMathMarks()>=65 && getPhysMarks()>=55 && getChemMarks()>=50){
            {
                if(getTotalMarks()>=190 || getTotalMarksMP()>=140){
                    {
                        System.out.println("Yes. The candidate is eligible for admission.");
                    }
                }else{
                    {
                        System.out.println("No. The candidate is not eligible for admission.");
                    }
                }
            }
        }else{
            System.out.println("No. The candidate is not eligible for admission as he is failed in one subject.");
        }
    }


    // Getter Setter.
    public short getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(short mathMarks) {
        this.mathMarks = mathMarks;
    }

    public short getPhysMarks() {
        return physMarks;
    }

    public void setPhysMarks(short physMarks) {
        this.physMarks = physMarks;
    }

    public short getChemMarks() {
        return chemMarks;
    }

    public void setChemMarks(short chemMarks) {
        this.chemMarks = chemMarks;
    }

    public short getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(short totalMarks) {
        this.totalMarks = totalMarks;
    }

    public short getTotalMarksMP() {
        return totalMarksMP;
    }

    public void setTotalMarksMP(short totalMarksMP) {
        this.totalMarksMP = totalMarksMP;
    }
}

/*
        Question20 question20 = new Question20();
        question20.input();
        question20.checkEligible();
 */