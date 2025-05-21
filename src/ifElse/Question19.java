// Write a java program to accept a coordinate point in a X-Y coordinate system and
// determine in which quadrant the coordinate point lies?
package ifElse;

import java.util.Scanner;

public class Question19 {
    static Scanner scanner = new Scanner(System.in);
    private int coordinate;
    private String quadrant;

    // Default Constructor.
    public Question19() {
    }

    // Constructor Overloading.
    public Question19(int coordinate) {
        this.coordinate = coordinate;
    }

    // Input Method.
    public void input(){
        System.out.println("The Coordinate points are always measured in Degrees.");
        System.out.print("Enter Coordinate value : ");
        setCoordinate(scanner.nextInt());
    }

    public void quadrantNumber(){
        if(getCoordinate()>=0 && getCoordinate()<=90){
            {
                setQuadrant("1st");
            }
        } else if (getCoordinate()>90 && getCoordinate()<=180) {
            {
                setQuadrant("2nd");
            }
        } else if (getCoordinate()>180 && getCoordinate()<=270) {
            {
                setQuadrant("3rd");
            }
        }else{
            {
                setQuadrant("4th");
            }
        }
        System.out.println("This coordinate point lies in "+getQuadrant()+" Quadrant.");
    }



    // Getter Setter.
    public int getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int coordinate) {
        if(coordinate >= 0){
            {
                while (coordinate > 360){
                    {
                        coordinate -= 360;
                    }
                }
                this.coordinate = coordinate;
            }
        }else{
            {
                System.out.println("Sorry! Enter the correct positive Coordinate value.");
            }
        }
    }

    public String getQuadrant() {
        return quadrant;
    }

    public void setQuadrant(String quadrant) {
        this.quadrant = quadrant;
    }
}

/*
        Question19 question19 = new Question19();
        question19.input();
        question19.quadrantNumber();
 */