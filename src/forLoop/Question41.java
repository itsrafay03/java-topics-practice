// Write a Java program to display the pattern like a diamond?
package forLoop;

import java.util.Scanner;

public class Question41 {
    static Scanner scanner = new Scanner(System.in);
    private int limit;

    public Question41() {
    }

    public Question41(int limit) {
        this.limit = limit;
    }

    public void input(){
        System.out.print("Enter the number size of Diamond : ");
        setLimit(scanner.nextInt());
    }

    public void displayDiamond(){
        int start, mid, end;
        start = mid = end = (getLimit()+1)/2;
        for (int row = 1; row <= getLimit(); row++) {
            for (int col = 1; col <= getLimit(); col++) {
                if(col>=start && col<=end){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(row < mid){
                start--;
                end++;
            }else {
                start++;
                end--;
            }
        }
    }


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

/*
        Question41 question41 = new Question41();
        question41.input();
        question41.displayDiamond();
 */


