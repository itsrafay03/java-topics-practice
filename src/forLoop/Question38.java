// Write a Java program to enter the numbers till the user wants and at the end the
// program should display the largest and smallest numbers entered?
package forLoop;

import java.util.Scanner;

public class Question38 {
    static Scanner scanner = new Scanner(System.in);
    private int number;
    private int limit;

    public Question38() {
    }

    public Question38(int number, int limit) {
        this.number = number;
        this.limit = limit;
    }

    public void input(){
        System.out.print("Enter how many numbers do you want to give input : ");
        setLimit(scanner.nextInt());
    }

    public void findLargestSmallestNumber(){
        System.out.print("Enter the number_1 : ");
        setNumber(scanner.nextInt());
        int largestNum,smallestNum;
        largestNum = smallestNum = getNumber();
        for (int count = 2; count <= getLimit(); count++) {
            System.out.print("Enter the number_"+count+" : ");
            setNumber(scanner.nextInt());
            if(getNumber() > largestNum){
                largestNum = getNumber();
            } else if (getNumber() < smallestNum) {
                smallestNum = getNumber();
            }
        }
        System.out.println("The Largest number is : "+largestNum+"\nThe Smallest number is : "+smallestNum);
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

/*
        Question38 question38 = new Question38();
        question38.input();
        question38.findLargestSmallestNumber();
 */