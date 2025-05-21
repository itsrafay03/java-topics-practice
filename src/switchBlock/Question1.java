// Write a java program to print day of week name using switch case?
package switchBlock;

import java.util.Scanner;

public class Question1 {
    static Scanner scanner = new Scanner(System.in);
    private byte dayNumber;
    private String dayName;

    // Default Constructor.
    public Question1() {
    }

    // Constructor Overloading.
    public Question1(byte dayNumber) {
        this.dayNumber = dayNumber;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the number of day : ");
        setDayNumber(scanner.nextByte());
    }

    // 1st approach by declaring the local variable in method and initializing the value to
    // it to the case. The return D.t of this method is string so we cannot use sout as the last
    // statement of this function. It should return String. The return value of the Switch statement
    // is basically the return value of the function. We can access the return value of function
    // by calling function in sout statement.

//    public String nameOfDay(){
//        String day;
//        switch (getDayNumber()){
//            case 1:
//                day = "Monday";
//                break;
//            case 2:
//                day = "Tuesday";
//                break;
//            case 3:
//                day = "Wednesday";
//                break;
//            case 4:
//                day = "Thursday";
//                break;
//            case 5:
//                day = "Friday";
//                break;
//            case 6:
//                day = "Saturday";
//                break;
//            case 7:
//                day = "Sunday";
//                break;
//            default:
//                return "Invalid day number.";
//        }
//            return "Day "+getDayNumber()+" is "+day;
//    }


    // 2nd approach that we do not use local variables but we simply return the values according
    // to the case as The return value of the Switch statement is basically the return value of
    // the function so we can not return anything from the function as we did and comment it in
    // the end of this function.
//    public String nameOfDay(){
//        switch (getDayNumber()){
//            case 1:
//                return "Monday";
//            case 2:
//                return "Tuesday";
//            case 3:
//                return "Wednesday";
//            case 4:
//                return "Thursday";
//            case 5:
//                return "Friday";
//            case 6:
//                return "Saturday";
//            case 7:
//                return "Sunday";
//            default:
//                return "Invalid day number.";
//        }
//        //System.out.println("Day "+getDayNumber()+" is ");
//        //return "Day "+getDayNumber()+" is ";
//    }


    // 3rd approach is that we define void function and assign value to global data member
    // according to respective case. and in the end of this function we write sout statement
    // to print the result.
//    public void nameOfDay(){
//        switch (getDayNumber()){
//            case 1:
//                dayName = "Monday";
//                break;
//            case 2:
//                dayName = "Tuesday";
//                break;
//            case 3:
//                dayName = "Wednesday";
//                break;
//            case 4:
//                dayName = "Thursday";
//                break;
//            case 5:
//                dayName = "Friday";
//                break;
//            case 6:
//                dayName = "Saturday";
//                break;
//            case 7:
//                dayName = "Sunday";
//                break;
//            default:
//                System.out.println("Invalid day number.");
//        }
//        System.out.println("Day "+getDayNumber()+" is "+dayName);
//    }


    // 4th approach is that in above all we use switch as statement but here it is enhanced
    // switch in which switch is used as an expression. Now we can store switch return value
    // in any variable or we can directly here perform operations with switch return value.
    // These things we can not do when switch is a statement.
    // In enhanced switch a specific case will run and automatically return a value.
    // This work on single line body in case as lambda(->) is a single line function.
        public String nameOfDay(){
        return switch (getDayNumber()){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input.";
        };
    }


    // Getters Setters.
    public byte getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(byte dayNumber) {
        this.dayNumber = dayNumber;
    }
}

/*
        Question1 question1 = new Question1();
        question1.input();
        System.out.println(question1.nameOfDay());
 */

