// Count the number of even and odd numbers in array.
package arrays;

import java.util.Scanner;

public class SirQuestion2 {
    static Scanner scanner = new Scanner(System.in);
    public static void countEvensOddsInArray() {
        int length;
        System.out.print("Enter the length of array : ");
        length = scanner.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the value for list[" + i + "] = ");
            list[i] = scanner.nextInt();
        }

        int even, odd;
        even = odd = 0;
        for (int i = 0; i < list.length; i++) {
            if(isEvenNumber(list[i])){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("In array the count of Even numbers is : "+even+"\nand count of Odd numbers is : "+odd);
    }

    private static boolean isEvenNumber(int num){
        boolean evenNum;
        if(num % 2 == 0){
            evenNum = true;
        }else {
            evenNum = false;
        }
        return evenNum;
    }
}


/*
SirQuestion2.countEvensOddsInArray();
 */