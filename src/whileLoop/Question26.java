// Write a Java program to find all factors of a number?
package whileLoop;

import java.util.Scanner;

public class Question26 {
    static Scanner scanner = new Scanner(System.in);
    private long number;

    public Question26() {
    }

    public Question26(long number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextLong());
    }

    public void checkFactors(){
        System.out.println("The Factors are : ");
        int count = 1;
        while(getNumber()>=count){
            if(getNumber()%count == 0){
                System.out.print(count+", ");
            }
            count++;
        }
    }



    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}

/*
        Question26 question26 = new Question26();
        question26.input();
        question26.checkFactors();
 */
