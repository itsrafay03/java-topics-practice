package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class F22Array {
    static Scanner scanner = new Scanner(System.in);
    public static int[] createArray(){
        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " +i + " :");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void displayArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//        }

        // For Each Loop.
//        for(int element : array){
//            System.out.print(element+" ");
//        }

        System.out.println("Sorted Array: "+Arrays.toString(array));

    }

    public static void sortArray(int[] array){
        System.out.println("Enter a if you want ascending order or d for descending.");
        char c = scanner.next().toLowerCase().charAt(0);
        System.out.println("Original Array: "+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(c == 'a'){
                    ASort(array, i, j);
                } else if (c == 'd') {
                    DSort(array, i, j);
                }else {
                    System.out.println("Try Again. Enter proper command.");
                }
            }
        }
        displayArray(array);
    }

    public static void ASort(int[] array, int i, int j){
        if(array[i] > array[j]){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void DSort(int[] array, int i, int j){
        if(array[i] < array[j]){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }


    public static void main(String[] args) {
//        int[] array =  F22Array.createArray();
//        F22Array.displayArray(array);

        F22Array.sortArray(F22Array.createArray());

    }
}
