// Write a Java program to find the second largest element in an array.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question16 {
    static Scanner scanner = new Scanner(System.in);
    // Method to construct the integers Array.
    public static int [] constructArray(){
        int length;
        System.out.print("Enter the length of Array : ");
        length = scanner.nextInt();
        int [] actualArray = new int[length];
        for (int i = 0; i < actualArray.length; i++) {
            System.out.print("Enter the value of actualArray["+i+"] = ");
            actualArray[i] = scanner.nextInt();
        }
        return actualArray;
    }

    // Method to find 2nd largest element of Array.
    public static int secondLargestNumber(int[] originalArray){
        System.out.println("Original Array : "+Arrays.toString(originalArray));
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i+1; j < originalArray.length; j++) {
                ascendingBubbleSort(originalArray, i, j);
            }
        }
        System.out.println("Sorted Array   : "+Arrays.toString(originalArray));
        //  As Array is sorted in Ascending order so last element is maximum and 2nd last element is 2nd largest element of Array.
        System.out.print("The Second Largest element in an array is : ");
        return originalArray[originalArray.length-2];
    }

    // Method for Ascending order Bubble sort.
    private static void ascendingBubbleSort(int[] givenArray, int i, int j){
        // if current value is greater, then next one then swap their places.
        if(givenArray[i] > givenArray[j]){
            int temp = givenArray[i];
            givenArray[i] = givenArray[j];
            givenArray[j] = temp;
        }
    }
}

/*
        System.out.println(Question16.secondLargestNumber(Question16.constructArray()));
 */