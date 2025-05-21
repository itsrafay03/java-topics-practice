// Write a Java program to test if an array contains a certain value.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    static Scanner scanner = new Scanner(System.in);
    public static int[] constructArray(){
        int length;
        System.out.print("Enter the length of array : ");
        length = scanner.nextInt();
        int [] numArray = new int[length];
        for (int i = 0; i < numArray.length; i++) {
            System.out.print("Enter the value for arrayNum["+i+"] = ");
            numArray[i] = scanner.nextInt();
        }
        return numArray;
    }

    public static void checkNumberInArray(int[] list){
        int checkNum;
        String status = null;
        System.out.print("Enter the number you want to check in Array : ");
        checkNum = scanner.nextInt();
        System.out.println("The array is : "+Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            if(checkNum == list[i]){
                status = "Yes "+checkNum+" is present in Array.";
                break;
            }else {
                status = "No "+checkNum+" is not present in Array.";
            }
        }
        System.out.println(status);
    }
}

/*
Question4.checkNumberInArray(Question4.constructArray());
 */
