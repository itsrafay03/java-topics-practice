// Write a Java program to find the duplicate values of an array of string values.
package arrays;

import java.util.Objects;
import java.util.Scanner;

public class Question12 {
    static Scanner scanner = new Scanner(System.in);
    // Make Array by asking it's values at each index from the user.
    public static String[] constructArray(){
        System.out.print("Enter the size of Array : ");
        int length = scanner.nextInt();
        scanner.nextLine();
        String[] stringArray = new String[length];
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print("Enter the value of stringArray["+i+"] = ");
            stringArray[i] = scanner.nextLine();
        }
        return stringArray;
    }

    // Method to find duplicates values of the Array.
    public static void duplicateValue(String [] originalArray){
        int count = 0;
        String [] duplicateArray = new String[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i+1; j < originalArray.length; j++) {
                if(Objects.equals(originalArray[i], originalArray[j])){
                    boolean isPresent = false;
                    // Check if the value is already present or not in Array.
                    for (int k = 0; k < duplicateArray.length; k++) {
                        if(Objects.equals(originalArray[i], duplicateArray[k])){
                            isPresent = true;
                            break;
                        }
                    }
                    // if value not present in Array then add in array.
                    if(!isPresent){
                        duplicateArray[count] = originalArray[i];
                        count++;
                    }
                }
            }
        }
        // Print the Duplicates elements of Array.
        if(count == 0){
            System.out.println("No duplicate value in Array.");
        }else {
            System.out.println("Duplicate values of Array are : ");
            for (int i = 0; i < count; i++) {
                System.out.println(duplicateArray[i]);
            }
        }
    }
}

/*
Question12.duplicateValue(Question12.constructArray());
 */