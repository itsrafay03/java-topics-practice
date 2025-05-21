// Write a Java program to display the first 10 natural numbers?
package whileLoop;

import java.util.Scanner;

public class Question1 {
    public static void displayNaturalNumbers(){
        System.out.println("First 10 Natural numbers are : ");
        int start_Limit = 1;
        int end_limit = 10;
        while (start_Limit<= end_limit){
            //return start_Limit;
            System.out.println(start_Limit);
            start_Limit++;
        }
    }
}

/*
Question1.displayNaturalNumbers();
 */