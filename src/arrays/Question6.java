// Write a Java program to remove a specific element from an array.
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question6 {
    // Method to construct Array.
    static Scanner scanner = new Scanner(System.in);
    public static int[] constructArray(){
        int length;
        System.out.print("Enter the length of array : ");
        length = scanner.nextInt();
        int [] numberArray = new int[length];
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("Enter the value for numberArray["+i+"] = ");
            numberArray[i] = scanner.nextInt();
        }
        return numberArray;
    }

    // Method to remove the target number from array.
    public static void checkNumberInArray(int[] list){
        int checkNum;
        System.out.print("Enter the number you want to remove from Array : ");
        checkNum = scanner.nextInt();
        System.out.println("The original Array : "+ Arrays.toString(list));

        // Traverse through complete array and count how many times the target number is present in Array.
        int count = 0;
        for (int j = 0; j < list.length; j++) {
            if(checkNum == list[j]){
                count++;
            }
        }
        //System.out.println(checkNum+" is present in Array "+count+" times");

        if(count == 0){                // count zero means that target number is not present in Array so print the original array in result.
            System.out.println("The required Array : "+ Arrays.toString(list));
        }else{
            int x = 0;    // for index of new array.
            int[] newArray = new int[list.length - (count)];
            for (int i = 0; i < list.length; i++) {
                if(list[i] != checkNum){
                    newArray[x++] = list[i];
                }
            }
            System.out.println("The required Array : "+ Arrays.toString(newArray));
        }
    }
}

/*
Question6.checkNumberInArray(Question6.constructArray());
 */