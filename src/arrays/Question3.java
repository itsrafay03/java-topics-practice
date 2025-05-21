// Write a Java program to calculate average value of an array elements.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    static Scanner scanner = new Scanner(System.in);
    public static void avgOfArrayElements(){
        int length, sum;
        float average;
        sum = 0;
        System.out.print("Enter the length of array : ");
        length = scanner.nextInt();
        int [] numArray = new int[length];
        for (int i = 0; i < numArray.length; i++) {
            System.out.print("Enter the value for arrayNum["+i+"] = ");
            numArray[i] = scanner.nextInt();
            sum += numArray[i];
        }
        System.out.println("The Array is : \n"+ Arrays.toString(numArray));
        average = ((float) sum /numArray.length);
        System.out.print("The Average of elements of array is : "+average);
    }
}

/*
Question3.avgOfArrayElements();
 */