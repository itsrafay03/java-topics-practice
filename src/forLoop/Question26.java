// Write a Java program to find the Sum of GP series?
/*

 */
package forLoop;

import java.util.Scanner;

public class Question26 {
    static Scanner scanner = new Scanner(System.in);
    private double firstTerm;
    private double commonRatio;
    private double numberOfTerms;

    public Question26() {
    }

    public Question26(double firstTerm, double commonRatio, double numberOfTerms) {
        this.firstTerm = firstTerm;
        this.commonRatio = commonRatio;
        this.numberOfTerms = numberOfTerms;
    }

    public void input(){
        System.out.print("Enter the first term : ");
        setFirstTerm(scanner.nextDouble());
        System.out.print("Enter the common ratio : ");
        setCommonRatio(scanner.nextDouble());
        System.out.print("Enter the number of terms : ");
        setNumberOfTerms(scanner.nextDouble());
    }



    // Method to find out the sum of Geometric progression (GP) series by using For loop.
    public double sumOfGPSeries(){
        double sumOfSeries = getFirstTerm();
        double currentTerm = getFirstTerm();
        if(getFirstTerm() == 1){
            sumOfSeries *= getNumberOfTerms();
        }else {
            for (int term = 2; term <= getNumberOfTerms(); term++) {
                currentTerm *= getCommonRatio();
                sumOfSeries += currentTerm;
            }
        }
        System.out.print("Sum of the Geometric progression series is : ");
        return sumOfSeries;
    }


    // Getter Setters.
    public double getFirstTerm() {
        return firstTerm;
    }

    public void setFirstTerm(double firstTerm) {
        this.firstTerm = firstTerm;
    }

    public double getCommonRatio() {
        return commonRatio;
    }

    public void setCommonRatio(double commonRatio) {
        this.commonRatio = commonRatio;
    }

    public double getNumberOfTerms() {
        return numberOfTerms;
    }

    public void setNumberOfTerms(double numberOfTerms) {
        this.numberOfTerms = numberOfTerms;
    }
}

/*
        Question26 question26 = new Question26();
        question26.input();
        System.out.println(question26.sumOfGPSeries());
 */
