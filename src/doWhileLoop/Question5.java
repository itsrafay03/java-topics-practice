// Write a Java program that prompts the user to input a positive integer. It should
// then output a message indicating whether the number is a prime number?
package doWhileLoop;

import java.util.Scanner;

public class Question5 {
    static Scanner scanner = new Scanner(System.in);
    private int number;

    public Question5() {
    }

    public Question5(int number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the Positive Number : ");
        setNumber(scanner.nextInt());
    }

    public void checkNumberIsPrime(){
        int count = 2;
        int modulusAnswer;
        do{
            if(getNumber() == 1){
                System.out.println("Yes, "+getNumber()+" is a Prime number.");
                break;
            }
            modulusAnswer = getNumber() % count;
            if(modulusAnswer == 0){
                if(count == getNumber()){
                    System.out.println("Yes, "+getNumber()+" is a Prime number.");
                    break;
                }else{
                    System.out.println("No, "+getNumber()+" is not a Prime number.");
                    break;
                }
            }
            count++;
        } while (count <= getNumber());
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

/*
        Question5 question5 = new Question5();
        question5.input();
        question5.checkNumberIsPrime();
 */