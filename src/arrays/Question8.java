// Write a Java program to insert an element (specific position) into an array.
package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question8 {
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

    // Method to insert an element (specific position) into an array.
    public static void insertElement(int[] originalArray){
        int [] newArray = new int[originalArray.length+1];
        System.out.print("\nEnter the Number you want to insert : ");
        int number = scanner.nextInt();
        System.out.print("Enter the Index at which you want to insert "+number+" : ");
        int index = scanner.nextInt();
        System.out.println("Original Array : "+ Arrays.toString(originalArray));
        if((index < 0) || (index > originalArray.length)){
            System.out.println("Index out of range. You can enter index from 0 to "+originalArray.length);
            System.out.print("Enter the Index at which you want to insert "+number+" : ");
            index = scanner.nextInt();
        }else {
            boolean isDone = false;
            for (int i = 0; i < newArray.length; i++) {
                if(!isDone){
                    if(i != index){
                        newArray[i] = originalArray[i];
                    }else{
                        newArray[i] = number;
                        isDone = true;
                    }
                }else {
                    newArray[i] = originalArray[i-1];
                }
                //System.out.println(Arrays.toString(newArray));
            }
            System.out.println("The New Array  : "+Arrays.toString(newArray));
        }
    }
}


/*
        Question8.insertElement(Question8.constructArray());

 */
