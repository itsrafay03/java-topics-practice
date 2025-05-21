// Write a Java program to find the common elements between two arrays (string values.
package arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Question13 {
    static Scanner scanner = new Scanner(System.in);
    // Method to make first Array.
    public static String[] constructArray1(){
        System.out.print("Enter the size of Array1 : ");
        int length = scanner.nextInt();
        scanner.nextLine();
        String[] stringArray1 = new String[length];
        for (int i = 0; i < stringArray1.length; i++) {
            System.out.print("Enter the value of stringArray1["+i+"] = ");
            stringArray1[i] = scanner.nextLine().toLowerCase();
        }
        return stringArray1;
    }

    // Method to make second Array.
    public static String[] constructArray2(){
        System.out.print("Enter the size of Array2 : ");
        int length = scanner.nextInt();
        scanner.nextLine();
        String[] stringArray2 = new String[length];
        for (int i = 0; i < stringArray2.length; i++) {
            System.out.print("Enter the value of stringArray2["+i+"] = ");
            stringArray2[i] = scanner.nextLine().toLowerCase();
        }
        return stringArray2;
    }

    // Method to find common elements between two Arrays.
    public static void commonElements(String[] array1, String[] array2){
        int count = 0;
        String [] commonElementsArray = new String[array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(Objects.equals(array1[i], array2[j])){
                    boolean isPresent = false;
                    // Check if the value is already present or not in commonElementsArray.
                    for (int k = 0; k < commonElementsArray.length; k++) {
                        if(Objects.equals(array1[i], commonElementsArray[k])){
                            isPresent = true;
                            break;
                        }
                    }
                    // if value is not in commonElementsArray then add it.
                    if(!isPresent){
                        commonElementsArray[count] = array1[i];
                        count++;
                    }
                }
            }
        }
        // Print the common elements between two Arrays.
        outputCommonElements(count, commonElementsArray);
    }

    // Method to display the Common elements if any between two Arrays.
    private static void outputCommonElements(int count, String[] commonElementsArray){
        if(count == 0){
            System.out.println("No value is common between two Arrays.");
        }else{
            System.out.println("The Common vales between two Arrays are : ");
            for (int i = 0; i < count; i++) {
                System.out.println(commonElementsArray[i]);
            }
        }
    }
}

/*
        Question13.commonElements(Question13.constructArray1(),Question13.constructArray2());

 */