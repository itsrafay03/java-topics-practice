// Write a java program take input of age of 3 people by user and determine oldest
// and youngest among them?
package ifElse;

import java.util.Scanner;

public class Question12 {
    static Scanner scanner = new Scanner(System.in);
    private short firstAge;
    private short secondAge;
    private short thirdAge;

    // Default Constructor.
    public Question12() {
    }

    // Constructor Overloading.
    public Question12(short firstAge, short secondAge, short thirdAge) {
        this.firstAge = firstAge;
        this.secondAge = secondAge;
        this.thirdAge = thirdAge;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter Age of first_person : ");
        setFirstAge(scanner.nextShort());
        System.out.print("Enter Age of second_person : ");
        setSecondAge(scanner.nextShort());
        System.out.print("Enter Age of third_person : ");
        setThirdAge(scanner.nextShort());
    }

    // Method to check oldest and youngest person.
    public void ageAnalysis(){
        String oldest,youngest;
        if(getFirstAge()>getSecondAge()){
            if(getSecondAge()>getThirdAge()){
                oldest = "First";youngest = "Third";
            }else{
                if(getFirstAge()>getThirdAge()){
                    oldest = "First";youngest = "Second";
                }else{
                    oldest = "Third";youngest = "Second";
                }
            }
        }else{
            if(getFirstAge()>getThirdAge()){
                oldest = "Second";youngest = "Third";
            }else{
                if(getSecondAge()>getThirdAge()){
                    oldest = "Second";youngest = "First";
                }else{
                    oldest = "Third";youngest = "First";
                }
            }
        }
        System.out.println(oldest+"_person is oldest and "+youngest+"_person is youngest.");
    }


    // Getters Setters.
    public short getFirstAge() {
        return firstAge;
    }

    public void setFirstAge(short firstAge) {
        this.firstAge = firstAge;
    }

    public short getSecondAge() {
        return secondAge;
    }

    public void setSecondAge(short secondAge) {
        this.secondAge = secondAge;
    }

    public short getThirdAge() {
        return thirdAge;
    }

    public void setThirdAge(short thirdAge) {
        this.thirdAge = thirdAge;
    }
}

/*
        Question12 question12 = new Question12();
        question12.input();
        question12.ageAnalysis();
 */
