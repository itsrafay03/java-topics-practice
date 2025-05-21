// Write a program to enter the numbers till the user wants and at the end it should
// display the count of positive, negative and zeros entered.
package whileLoop;

import java.util.Scanner;

public class Question11 {
    static Scanner scanner = new Scanner(System.in);
    private int num;


    public void checkNumbersType(){
        int zero = 0;
        int positive = 0;
        int negative = 0;
        System.out.print("When you want to quit enter any other key.\nEnter the Number : ");
        while(scanner.hasNextInt()){
            setNum(scanner.nextInt());
            if(getNum() == 0){
                zero++;
            }else{
                if(getNum() > 0){
                    positive++;
                }else {
                    negative++;
                }
            }
            System.out.print("Enter the Number : ");
        }
        System.out.println("Finish.");
        System.out.println("Number of zeros : "+zero);
        System.out.println("Number of Positive numbers : "+positive);
        System.out.println("Number of Negative numbers : "+negative);
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

/*
        Question11 question11 = new Question11();
        question11.checkNumbersType();
 */