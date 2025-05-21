// Write a Java program to read the age of a candidate and determine whether it is
// eligible for casting his/her own vote?
package ifElse;

import java.util.Scanner;

public class Question3 {
    static Scanner scanner = new Scanner(System.in);
    private short age;
    public static final int eligibleAge = 18;   // Memory Constant.

    // Default Constructor.
    public Question3() {
    }
    // Constructor Overloading.
    public Question3(short age) {
        this.age = age;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your Age (in years) : ");
        setAge(scanner.nextShort());
    }

    // Method to check the age that eligible to cast the vote.
    public void castVote(){
        System.out.println("Your Age is "+getAge()+" years.");
        if(getAge() >= eligibleAge){
            {
                System.out.println("Congratulation! You can cast your vote.");
            }
        }else{
            {
                System.out.println("Sorry! You can not cast your vote.");
            }
        }
    }

    // Getters Setters.
    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        if (age >= 0){
            {
                this.age = age;
            }
        }else{
            {
                System.out.println("Sorry. Enter correct Age in positive number.");
                input();
            }
        }

    }
}

/*
        Question3 question3 = new Question3();
        question3.input();
        question3.castVote();
 */