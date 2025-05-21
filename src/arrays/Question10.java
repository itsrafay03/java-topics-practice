// Write a Java program to reverse an array of integer values.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question10 {
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

    public static void reverseArray(int[] list){
        int[] reversedArray= new int[list.length];
        for (int i = 0; i < list.length; i++) {
            reversedArray[i] = list[(list.length-1)-i];
        }
        System.out.println("Original Array : "+ Arrays.toString(list));
        System.out.println("Reversed Array : "+Arrays.toString(reversedArray));
    }
}

/*
Question10.reverseArray(Question10.constructArray());
 */