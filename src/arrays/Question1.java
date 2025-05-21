// Write a Java program to sort an numeric array and a string array.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    static Scanner scanner = new Scanner(System.in);

    // Method to construct the integers Array.
    public static int[] constructIntegerArray() {
        int length;
        System.out.print("Enter the length of Integer Array : ");
        length = scanner.nextInt();
        int[] actualArray = new int[length];
        for (int i = 0; i < actualArray.length; i++) {
            System.out.print("Enter the value of actualArray[" + i + "] = ");
            actualArray[i] = scanner.nextInt();
        }
        return actualArray;
    }

    // Method to make a Sorted Array of a given Integer Array.
    public static void sortedIntegerArray(int[] originalArray) {
        char sortingType;
        System.out.print("Enter \"A/a\" for Ascending order Sorting and any other character for Descending order Sorting : ");
        sortingType = scanner.next().toLowerCase().charAt(0);
        System.out.println("Original Integer Array : "+ Arrays.toString(originalArray));
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                if (sortingType == 'a') {
                    integersAscendingBubbleSort(originalArray, i, j);
                } else {
                    integersDescendingBubbleSort(originalArray, i, j);
                }
            }
        }
        System.out.println("Sorted Integer Array  : "+ Arrays.toString(originalArray));
    }


    // Method for Ascending order Bubble sort for Integers.
    private static void integersAscendingBubbleSort(int[] givenArray, int i, int j) {
        // if current value is greater then next one, then swap their places.
        if (givenArray[i] > givenArray[j]) {
            int temp = givenArray[i];
            givenArray[i] = givenArray[j];
            givenArray[j] = temp;
        }
    }


    // Method for Descending order Bubble sort for Integers.
    private static void integersDescendingBubbleSort(int[] givenArray, int i, int j) {
        // if current value is smaller then next one, then swap their places.
        if (givenArray[i] < givenArray[j]) {
            int temp = givenArray[i];
            givenArray[i] = givenArray[j];
            givenArray[j] = temp;
        }
    }


    // Now it a time for String Array.


    // Method to construct the String Array.
    public static String[] constructStringArray() {
        System.out.println();
        int length;
        System.out.print("Enter the length of String Array : ");
        length = scanner.nextInt();
        String[] actualArray = new String[length];
        scanner.nextLine();
        for (int i = 0; i < actualArray.length; i++) {
            System.out.print("Enter the value of actualArray[" + i + "] = ");
            actualArray[i] = scanner.nextLine();
        }
        return actualArray;
    }

    // Method to make a Sorted Array of a given String Array.
    public static void sortedStringArray(String[] originalArray) {
        char sortingType;
        System.out.print("Enter \"A/a\" for Ascending order Sorting and any other character for Descending order Sorting : ");
        sortingType = scanner.next().toLowerCase().charAt(0);
        System.out.println("Original Integer Array : "+ Arrays.toString(originalArray));
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                if(sortingType == 'a'){
                    stringAscendingBubbleSort(originalArray, i, j);
                }else{
                    stringDescendingBubbleSort(originalArray, i, j);
                }
            }
        }
        System.out.print("Sorted Integer Array   : "+ Arrays.toString(originalArray));
    }

    // Method for Ascending order Bubble sort for String.
    private static void stringAscendingBubbleSort(String[] givenArray, int i, int j) {
        // if current value is greater then next one, then swap their places.
        if(givenArray[i].toLowerCase().charAt(0) > givenArray[j].toLowerCase().charAt(0)){
            String temp = givenArray[i];
            givenArray[i] = givenArray[j];
            givenArray[j] = temp;
        }
    }


    // Method for Descending order Bubble sort for string.
    private static void stringDescendingBubbleSort(String[] givenArray, int i, int j) {
        // if current value is smaller then next one, then swap their places.
        if(givenArray[i].toLowerCase().charAt(0) < givenArray[j].toLowerCase().charAt(0)){
            String temp = givenArray[i];
            givenArray[i] = givenArray[j];
            givenArray[j] = temp;
        }
    }
}

/*
        Question1.sortedIntegerArray(Question1.constructIntegerArray());
        Question1.sortedStringArray(Question1.constructStringArray());
 */