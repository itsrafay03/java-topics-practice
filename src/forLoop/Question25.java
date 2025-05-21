// Write a Java program to find out the sum of an Arithmetic progression series?
/*
The formula to find out the sum of an Arithmetic progression series is :
Sn = (n/2)*(2a+(n−1)d), in which a = first term, n = number of terms, and
d = common difference between consecutive terms.
 */
package forLoop;

import java.util.Scanner;

public class Question25 {
    static Scanner scanner = new Scanner(System.in);
    private double firstTerm;
    private double commonDifference;
    private double numberOfTerms;

    public Question25() {
    }

    public Question25(double firstTerm, double commonDifference, double numberOfTerms) {
        this.firstTerm = firstTerm;
        this.commonDifference = commonDifference;
        this.numberOfTerms = numberOfTerms;
    }

    public void input(){
        System.out.print("Enter the first term : ");
        setFirstTerm(scanner.nextDouble());
        System.out.print("Enter the common difference : ");
        setCommonDifference(scanner.nextDouble());
        System.out.print("Enter the number of terms : ");
        setNumberOfTerms(scanner.nextDouble());
    }


    // Method to find out the sum of an Arithmetic progression series by using formula.
    public double sumOfApSeries() {
        System.out.print("Sum of the Arithmetic progression series is : ");
        return ((getNumberOfTerms() / 2) * (2 * getFirstTerm() + ((getNumberOfTerms() - 1) * getCommonDifference())));
    }


    // Method to find out the sum of an Arithmetic progression series by using For loop.
    public double sumOfAPSeries(){
        double sumOfSeries = getFirstTerm();
        double currentTerm = getFirstTerm();
        for (int term = 2; term <= getNumberOfTerms(); term++) {
            currentTerm += getCommonDifference();
            sumOfSeries += currentTerm;
        }
        System.out.print("Sum of the Arithmetic progression series is : ");
        return sumOfSeries;
    }


    // Getter Setters.
    public double getFirstTerm() {
        return firstTerm;
    }

    public void setFirstTerm(double firstTerm) {
        this.firstTerm = firstTerm;
    }

    public double getCommonDifference() {
        return commonDifference;
    }

    public void setCommonDifference(double commonDifference) {
        this.commonDifference = commonDifference;
    }

    public double getNumberOfTerms() {
        return numberOfTerms;
    }

    public void setNumberOfTerms(double numberOfTerms) {
        this.numberOfTerms = numberOfTerms;
    }
}

/*
        Question25 question25 = new Question25();
        question25.input();
        System.out.println(question25.sumOfAPSeries());
 */