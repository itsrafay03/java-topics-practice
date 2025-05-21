// Write a Java program to copy an array by iterating the array.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
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

    public static void copyArray(int[] list){
        int [] copyArray = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            copyArray[i] = list[i];
        }
        System.out.println("Original Array : "+Arrays.toString(list));
        System.out.println("Copied Array   : "+Arrays.toString(copyArray));
    }
}

/*
        Question7.copyArray(Question7.constructArray());

 */