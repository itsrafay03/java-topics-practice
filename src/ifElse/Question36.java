/*
Given the length and breadth of a rectangle, write a program to find whether the
area of the rectangle is greater than its perimeter. For example, the area of the
rectangle with length = 5 and breadth = 4 is greater than its perimeter.
 */
package ifElse;

import java.util.Scanner;

public class Question36 {
    static Scanner scanner = new Scanner(System.in);
    private float length;
    private float breadth;
    private float area;
    private float perimeter;

    // Default Constructor.
    public Question36() {
    }

    // Constructor Overloading.
    public Question36(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter Length of a rectangle : ");
        setLength(scanner.nextFloat());
        System.out.print("Enter Breadth of a rectangle : ");
        setBreadth(scanner.nextFloat());
    }

    // Method to find Area of rectangle.
    private void findArea(){
        setArea(getLength()*getBreadth());
    }

    // Method to find Perimeter of rectangle.
    private void findPerimeter(){
        setPerimeter(2*getLength() + 2*getBreadth());
    }

    // Method to print Output with condition.
    public void conditionalOutput(){
        findArea();
        findPerimeter();
        System.out.println("Area : "+getArea());
        System.out.println("Perimeter : "+getPerimeter());
        if(getArea() > getPerimeter()){
            {
                System.out.println("Yes. The Area of the rectangle with length = "+getLength()+" and breadth = "+getBreadth()+" is greater than it's perimeter.");
            }
        }else{
            {
                if(getArea() == getPerimeter()){
                    {
                        System.out.println("The Area of the rectangle with length = "+getLength()+" and breadth = "+getBreadth()+" is equal to it's perimeter.");
                    }
                }else {
                    {
                        System.out.println("No. The Area of the rectangle with length = "+getLength()+" and breadth = "+getBreadth()+" is not greater than it's perimeter.");
                    }
                }
            }
        }
    }


    // Getters Setters.
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Question36.scanner = scanner;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }
}
/*
        Question36 question36 = new Question36();
        question36.input();
        question36.conditionalOutput();
 */