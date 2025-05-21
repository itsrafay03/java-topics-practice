// Write a Java program to find the second smallest element in an array.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question17 {
    static Scanner scanner = new Scanner(System.in);
    private int length;
    // Method to construct the integers Array.
    public int [] constructArray(){
        System.out.print("Enter the length of Array : ");
        setLength(scanner.nextInt());
        int [] actualArray = new int[getLength()];
        for (int i = 0; i < actualArray.length; i++) {
            System.out.print("Enter the value of actualArray["+i+"] = ");
            actualArray[i] = scanner.nextInt();
        }
        return actualArray;
    }

    // Method to find 2nd smallest element of Array.
    public int secondSmallestNumber(int[] originalArray){
        System.out.println("Original Array : "+ Arrays.toString(originalArray));
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i+1; j < originalArray.length; j++) {
                ascendingBubbleSort(originalArray, i, j);
            }
        }
        System.out.println("Sorted Array   : "+Arrays.toString(originalArray));
        //  As Array is sorted in Ascending order so the first element is smallest element and 2nd element from start is 2nd smallest element of Array.
        System.out.print("The Second Smallest element in an array is : ");
        return originalArray[1];
    }

    // Method for Ascending order Bubble sort.
    private void ascendingBubbleSort(int[] givenArray, int i, int j){
        // if current value is greater, then next one then swap their places.
        if(givenArray[i] > givenArray[j]){
            int temp = givenArray[i];
            givenArray[i] = givenArray[j];
            givenArray[j] = temp;
        }
    }

    // Setter Getter.
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength(){
        return length;
    }
}

/*
        Question17 question17 = new Question17();
        System.out.println(question17.secondSmallestNumber(question17.constructArray()));
 */