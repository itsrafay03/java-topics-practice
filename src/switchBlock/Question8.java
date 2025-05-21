// Write a java program to find roots of a quadratic equation using switch case?
package switchBlock;

import java.util.Scanner;

public class Question8 {
    static Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;
    private int c;
    public static final byte constant_for_4ac = 4;
    public static final byte constant_for_2a = 2;

    // default constructor.
    public Question8() {
    }

    // Constructor Overloading.
    public Question8(int a, int b, int c) {
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
    public String findRoots(){
        int negative_b = -getB();
        //System.out.println("value of minus b : "+d);
        int square_of_b = getB()*getB();
        //System.out.println("value of square of b : "+e);
        int value_of_4ac = constant_for_4ac*getA()*getC();
        //System.out.println("value of 4ac : "+f);
        int disc = square_of_b - value_of_4ac;
        //System.out.println("Disc : "+disc);
        char value_of_disc = Integer.toString(disc).charAt(0);
        switch (value_of_disc){
            case '-':
                return "Roots does not Exist.";
            default:
                double underRoot_of_disc = (Math.sqrt(disc));
                //System.out.println("Under root of Disc : "+h);
                double plus = negative_b + underRoot_of_disc;
                //System.out.println("value of (-b + (√(b^2 - 4a*c)) : "+plus);
                double minus = negative_b - underRoot_of_disc;
                //System.out.println("value of (-b - (√(b^2 - 4a*c)) : "+minus);
                double value_of_2a = constant_for_2a*getA();
                //System.out.println("value of 2a : "+i);
                double first_root = plus / value_of_2a;
                double second_root = minus / value_of_2a;
                return "First root : "+first_root+"\nSecond root : "+second_root;
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

        Question8 question8 = new Question8();
        question8.input();
        System.out.println(question8.findRoots());
 */