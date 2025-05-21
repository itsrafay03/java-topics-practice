// Write a Java program to convert an array-To-Array List.
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question19 {
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

    // Method to convert an Array to Array-List.
    public static void constructArrayList(int[] array){
        System.out.println("Array : "+ Arrays.toString(array));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);   // Use `add` to simply append elements.
        }
        System.out.println("Array-List : "+list);
    }
}

/*
Question19.constructArrayList(Question19.constructArray());
 */