// Write a java program to check whether a triangle is Equilateral, Isosceles or Scalene?
/*
Based on the sides, the classification of triangles is:

Scalene triangle(All 3 sides are of different length.)
Isosceles triangle(Any two sides are of equal length and one is of different length.)
Equilateral triangle(All 3 sides are of equal length.)
Based on the angles, the classification of triangles is:

Acute-angled isosceles: All three angles are acute (less than 90 degrees).
Obtuse-angled isosceles: One angle is obtuse (greater than 90 degrees).
Right-angled isosceles: One angle is right (90 degrees), making it a right triangle as well.
 */
package ifElse;

import java.util.Scanner;

public class Question24 {
    static Scanner scanner = new Scanner(System.in);
    private float side1;
    private float side2;
    private float side3;
    //private short sumAngles;
    //public static final short totalAnglesOfTriangle = 180;

    // Default Constructor.
    public Question24() {
    }

    // Constructor Overloading.
    public Question24(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Input Method.
    public void input(){
        System.out.println("There are 3 sides of Triangle.");
        System.out.print("Enter value of first_side : ");
        setSide1(scanner.nextFloat());
        System.out.print("Enter value of second_side : ");
        setSide2(scanner.nextFloat());
        System.out.print("Enter value of third_side : ");
        setSide3(scanner.nextFloat());
    }

    // Method to check the type of Triangle.
    public void determineTriangle(){
        if(getSide1() == getSide2() && getSide2() == getSide3()){
            {
                System.out.println("A triangle is Equilateral triangle.");
            }
        } else if (getSide1() != getSide2() && getSide1() != getSide3() && getSide2() != getSide3()) {
            {
                System.out.println("A triangle is Scalene triangle.");
            }
        }else{
            {
                System.out.println("A triangle is Isosceles triangle.");
            }
        }
    }


    // Getters Setters.

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }
}

/*
        Question24 question24 = new Question24();
        question24.input();
        question24.determineTriangle();
 */