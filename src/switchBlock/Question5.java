// Write a java program to find maximum between two numbers using switch case?
package switchBlock;

import java.util.Scanner;

public class Question5 {
    static Scanner scanner = new Scanner(System.in);
    private int first_num;
    private int second_num;

    public Question5() {
    }

    public Question5(int first_num, int second_num) {
        this.first_num = first_num;
        this.second_num = second_num;
    }

    public void input(){
        System.out.print("Enter first_number : ");
        setFirst_num(scanner.nextInt());
        System.out.print("Enter second_number : ");
        setSecond_num(scanner.nextInt());
    }

    // Method to find maximum number. As if getSecond_num()/getFirst_num() = 0 means 1st
    // number is greater then 2nd one. if ans != 0 then 2nd number is greater.

//
//    public int greater(){
//        return getSecond_num()/getFirst_num();
//    }
//
//    // We can use the return value of one function in the switch expression as we have done
//    // here. Simply we have to call the function in switch expression and the function return
//    // value will come here in expression place of switch.
//
//    public String findMaximum() {
//        switch (greater()){
//            case 0:
//                return "first_number is maximum.";
//            default:
//                return "Second_number is maximum.";
//    }

    public String findMaximum() {
        return switch (getSecond_num() / getFirst_num()) {
            case 0 -> "The first_number " + getFirst_num() + " is Maximum.";
            default -> "The second_number " + getSecond_num() + " is Maximum.";
        };
    }


    // Getters Setters.
    public int getFirst_num() {
        return first_num;
    }

    public void setFirst_num(int first_num) {
        this.first_num = first_num;
    }

    public int getSecond_num() {
        return second_num;
    }

    public void setSecond_num(int second_num) {
        this.second_num = second_num;
    }
}

/*
        Question5 question5 = new Question5();
        question5.input();
        System.out.println(question5.findMaximum());
 */
