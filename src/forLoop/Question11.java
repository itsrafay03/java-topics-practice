// Write a Java program to display the n terms of harmonic series and their sum?
package forLoop;

import java.util.Scanner;

public class Question11 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    // Default Constructor.
    public Question11() {
    }

    //Constructor Overloading.
    public Question11(int number) {
        this.number = number;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the number of terms of harmonic series you want : ");
        setNumber(scanner.nextInt());
    }

    // Method to display the harmonic series and their Sum.
    public double printHarmonicSeriesWithSum(){
        System.out.println("The first "+getNumber()+" terms of Harmonic series are : ");
        double term;
        double sum = 0;
        for (int i = 1; i <= getNumber(); i++) {
            term = (double) 1 / i;
            System.out.printf("%.2f",term);
            System.out.print(", ");
            sum += term;
        }
        System.out.print("\nSum of first "+getNumber()+" terms of Harmonic series is : ");
        return sum;
    }


    // Getters Setters.
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question11 question11 = new Question11();
        question11.input();
        System.out.println(question11.printHarmonicSeriesWithSum());
 */