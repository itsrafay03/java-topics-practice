// Write a Java program to find all pairs of elements in an array whose sum
// is equal to a specified number.
package arrays;

import java.util.Scanner;

public class Question21 {
    static Scanner scanner = new Scanner(System.in);

    // Make Original Array by asking it's length and inputs at each indexes from user.
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

    // Method to find all pairs of elements equal to Sum of a specified number.
    public static void calculation(int[] originalArray){
        int targetNumber;
        System.out.print("Enter the Target Number : ");
        targetNumber = scanner.nextInt();
        int sumOfPairs = 0;
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i+1; j < originalArray.length; j++) {
                sumOfPairs = originalArray[i] + originalArray[j];
                if(sumOfPairs == targetNumber){
                    System.out.println("("+originalArray[i]+","+originalArray[j]+")");
                }
            }
        }
    }
}

/*
Question21.calculation(Question21.constructArray());
 */