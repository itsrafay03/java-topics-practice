// Write a Java program to find the common elements between two arrays of integers.
package arrays;

import java.util.Objects;
import java.util.Scanner;

public class Question14 {
    static Scanner scanner = new Scanner(System.in);
    // Method to make first Array.
    public static int[] constructArray1(){
        System.out.print("Enter the size of Array1 : ");
        int length = scanner.nextInt();
        scanner.nextLine();
        int[] integersArray1 = new int[length];
        for (int i = 0; i < integersArray1.length; i++) {
            System.out.print("Enter the value of integersArray1["+i+"] = ");
            integersArray1[i] = scanner.nextInt();
        }
        return integersArray1;
    }

    // Method to make second Array.
    public static int[] constructArray2(){
        System.out.print("Enter the size of Array2 : ");
        int length = scanner.nextInt();
        scanner.nextLine();
        int[] integersArray2 = new int[length];
        for (int i = 0; i < integersArray2.length; i++) {
            System.out.print("Enter the value of integersArray2["+i+"] = ");
            integersArray2[i] = scanner.nextInt();
        }
        return integersArray2;
    }

    // Method to find common elements between two Arrays.
    public static void commonElements(int[] array1, int[] array2){
        int count = 0;
        boolean isZeroAdded = false;
        int [] commonElementsArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(Objects.equals(array1[i], array2[j])){
                    // if zero is not added, add it for the first time and don't add another time.
                    if(!isZeroAdded){
                        if(array1[i] == 0){
                            commonElementsArray[count] = 0;
                            count++;
                            isZeroAdded = true;
                        }
                    }

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
    private static void outputCommonElements(int count, int[] commonElementsArray){
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
        Question14.commonElements(Question14.constructArray1(),Question14.constructArray2());

 */