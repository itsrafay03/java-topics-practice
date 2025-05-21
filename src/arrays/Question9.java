// Write a Java program to find the maximum and minimum value of an array.
package arrays;

import java.util.Scanner;

public class Question9 {
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

    public static void findMaxMinValueOfArray(int[] list){
        int max, min;
        max = min = list[0];
        for (int i = 0; i < (list.length-1); i++) {
            if(max > list[i+1]){
                max = list[i+1];
            }
            if(min < list[i+1]){
                min = list[i+1];
            }
        }
        System.out.println("The Maximum number of array is : "+max);
        System.out.println("The Minimum number of array is : "+min);
    }
}

/*
Question9.findMaxMinValueOfArray(Question9.constructArray());
 */
