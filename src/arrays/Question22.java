// Write a Java program to test the equality of two arrays.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question22 {
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

    // check the equality of arrays.
    // Arrays are equal when the number of elements of both arrays is equal and the order of elements of both arrays is equal.
    public static void testEqualityOfArrays(int array1[], int array2[]){
        System.out.print(" First Array is : "+ Arrays.toString(array1));
        System.out.print("\nSecond Array is : "+ Arrays.toString(array2));
        int count = 0;
        // if length of both arrays are not equal then it means that these arrays are not equal.
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] == array2[i]){
                    count++;
                }
            }
        }
        System.out.println();
        //System.out.println("Count : "+count);
        // if count and length of array are equal this means every element of both arrays are equal.
        if((count != array1.length)){
            System.out.println("No, Arrays are not Equal.");
        }else{
            System.out.println("Yes, Arrays are Equal.");
        }
    }
}

/*
        Question22.testEqualityOfArrays(Question22.constructArray1(),Question22.constructArray2());

 */
