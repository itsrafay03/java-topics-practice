// Write a Java program to convert an array list to an array.
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question20 {
    static Scanner scanner = new Scanner(System.in);
    // Method to construct Array-List.
    public static ArrayList<Integer> constructArrayList(){
        int length;
        System.out.print("Enter the size of Array-List : ");
        length = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the value at index "+i+" : ");
            list.add(i, scanner.nextInt());
        }
        return list;
    }


    // Method to convert an Array-list to an Array.
    public static void constructArray(ArrayList<Integer> list){
        System.out.println("Array-List : "+list);
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        System.out.println("Array : "+Arrays.toString(array));
    }
}

/*
Question20.constructArray(Question20.constructArrayList());
 */