// Write a Java program to find the duplicate values of an array of integer values.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question11 {
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


    // Find duplicate values Original Array.
    public static void duplicateValue(int[] originalArray){
        int count = 0;
        boolean isZeroAdded = false;
        int [] duplicateArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i+1; j < originalArray.length; j++) {
                if(originalArray[i] == originalArray[j]){
                    // if zero is not added, add it for the first time and don't add another time.
                    if(!isZeroAdded){
                        if(originalArray[i] == 0){
                            duplicateArray[count] = 0;
                            count++;
                            isZeroAdded = true;
                        }
                    }

                    boolean isPresent = false;
                    // Check if the number is already present or not.
                    for (int k = 0; k < duplicateArray.length; k++) {
                        if(originalArray[i] == duplicateArray[k]){
                            isPresent = true;
                            break;
                        }
                    }
                    // and if not present then add in array.
                    if(!isPresent){
                        duplicateArray[count] = originalArray[i];
                        count++;
                    }
                }
            }
        }
        // Print the Duplicates elements of Array.

        if(count == 0){
            System.out.println("No duplicate number in list.");
        }else {
            System.out.println("The Duplicate values of Array are : ");
            // Iterate the loop up to the count(means number of duplicate numbers) so that it will print only duplicate values,
            // otherwise print 0s up to the length of givenArray.
            for (int i = 0; i < count; i++) {
                System.out.println(duplicateArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        Question11.duplicateValue(Question11.constructArray());

    }
}

/*
Question11.duplicateValue(Question11.constructArray());
 */