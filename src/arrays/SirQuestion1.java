// take the numbers in array from user and find the maximum among them.
package arrays;

import java.util.Scanner;

public class SirQuestion1 {
    static Scanner scanner = new Scanner(System.in);
    public static void findMaxInArray(){
        int length;
        System.out.print("Enter the length of array : ");
        length = scanner.nextInt();
        int [] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the value for list["+i+"] = ");
            list[i] = scanner.nextInt();
        }
        
        int max = list[0];
        for (int i = 0; i < (list.length-1); i++) {
            if(max < list[i+1]){
                max = list[i+1];
                System.out.println(max);
            }
        }
        System.out.println("The Maximum number in array is : "+max);
    }
}

/*
SirQuestion1.findMaxInArray();
 */