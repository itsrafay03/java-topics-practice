// Write a java program to calculate the roots of a Quadratic Equation?
// Test Data: a = 1 , b = 5 , c = 7
package ifElse;

import java.util.Scanner;

public class Question21 {
    static Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;
    private int c;

    // default constructor.
    public Question21() {
    }

    // Constructor Overloading.
    public Question21(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Input Method
    public void input(){
        System.out.print("Enter value of a : ");
        setA(scanner.nextInt());
        System.out.print("Enter value of b : ");
        setB(scanner.nextInt());
        System.out.print("Enter value of c : ");
        setC(scanner.nextInt());
    }


    // Method to find roots of Quadratic Equation.
    public void findRoots(){
        int d = -getB();
        //System.out.println("value of minus b : "+d);
        int e = getB()*getB();
        //System.out.println("value of square of b : "+e);
        int f = 4*getA()*getC();
        //System.out.println("value of 4ac : "+f);
        int disc = e - f;
        //System.out.println("Disc : "+disc);
        if(disc<0){
            {
                System.out.println("Roots does not Exist.");
            }
        }else{
            {
                double h = (Math.sqrt(disc));
                //System.out.println("Under root of Disc : "+h);
                double plus = d + h;
                //System.out.println("value of (-b + (√(b^2 - 4a*c)) : "+plus);
                double minus = d - h;
                //System.out.println("value of (-b - (√(b^2 - 4a*c)) : "+minus);
                double i = 2*getA();
                //System.out.println("value of 2a : "+i);
                double first_root = plus / i;
                double second_root = minus / i;
                System.out.printf("First root : %.1f",first_root);
                System.out.println();
                System.out.printf("Second root : %.1f",second_root);
            }
        }

    }




    // Getter Setter.
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

/*
        Question21 question21 = new Question21();
        question21.input();
        question21.findRoots();
 */