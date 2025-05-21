// Write a Java program to sum values of an array.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    static Scanner scanner = new Scanner(System.in);
    public static void sumOfArrayElements(){
        int length, sum;
        sum = 0;
        System.out.print("Enter the length of array : ");
        length = scanner.nextInt();
        int [] numArray = new int[length];
        for (int i = 0; i < numArray.length; i++) {
            System.out.print("Enter the value for arrayNum["+i+"] = ");
            numArray[i] = scanner.nextInt();
            sum += numArray[i];
        }
        System.out.println("The Array is : \n"+Arrays.toString(numArray));
        System.out.print("The Sum of elements of array is : "+sum);
    }
}

/*
Question2.sumOfArrayElements();
 */