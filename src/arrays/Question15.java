// Write a Java program to remove duplicate elements from an array.
package arrays;

import java.util.Scanner;

public class Question15 {
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


    // Find Unique values of Original Array.
    public static void UniqueValue(int[] originalArray){
        int count = 0;
        boolean isZeroAdded = false;
        int [] uniqueElementArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i+1; j < originalArray.length; j++) {
                if (originalArray[i] != originalArray[j]) {
                    // if zero is for the first time then add in array otherwise for next time don't ass in array.
                    if(!isZeroAdded){
                        if(originalArray[i] == 0){
                            uniqueElementArray[count] = 0;
                            count++;
                            isZeroAdded = true;
                        }
                    }

                    boolean isPresent = false;
                    // to check if the current element is not already in uniqueElementArray.
                    for (int k = 0; k < uniqueElementArray.length; k++) {
                        if(originalArray[i] == uniqueElementArray[k]){
                            isPresent = true;
                            break;
                        }
                    }
                    // add the element if not present in uniqueElementArray.
                    if(!isPresent){
                        uniqueElementArray[count] = originalArray[i];
                        count++;
                    }
                }
            }

            // check if the last element of array is unique and is included in array or not.
            if(i == originalArray.length-(1)) {
                boolean isLastValuePresent = false;
                for (int k = 0; k < uniqueElementArray.length; k++) {
                    if(originalArray[i] == uniqueElementArray[k]){
                        isLastValuePresent = true;
                        break;
                    }
                }
                if(!isLastValuePresent){
                    uniqueElementArray[count] = originalArray[i];
                    count++;
                }
            }
        }
        // Print the array having no duplicate element in it.
        if(count == 0){
            System.out.println("This is Array with all duplicate elements.");
        }else {
            System.out.println("The Array with out duplicate elements is : ");
            System.out.print("[");
            for (int i = 0; i < count; i++) {
                System.out.print(uniqueElementArray[i]+", ");
            }
            System.out.println("\b\b]");
            //System.out.println(Arrays.toString(uniqueElementArray));
        }
    }
}

/*
Question15.UniqueValue(Question15.constructArray());
 */
