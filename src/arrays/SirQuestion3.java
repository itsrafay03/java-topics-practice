// Find out the even and odd numbers in array.
package arrays;

import java.util.Scanner;

public class SirQuestion3 {
    static Scanner scanner = new Scanner(System.in);
//    public static void countEvensOddsInArray() {
//        int length;
//        System.out.print("Enter the length of array : ");
//        length = scanner.nextInt();
//        int [] list = new int[length];
//        for (int i = 0; i < list.length; i++) {
//            System.out.print("Enter the value for list["+i+"] = ");
//            list[i] = scanner.nextInt();
//        }
//
//        int even, odd;
//        even = odd = 0;
//
//        for (int i = 0; i < list.length; i++) {
//            if(isEvenNumber(list[i])){
//                int evenNum = list[i];
//                even++;
//                int [] evenNumbers = new int[even+1];
//                for (int j = 0; j < evenNumbers.length; j++) {
//                    evenNumbers[j] = evenNum;
//                    System.out.print(evenNumbers[j]+", \b");
//                }
//            }else {
//                int oddNum = list[i];
//                odd++;
//                int [] oddNumbers = new int[odd+1];
//                for (int j = 0; j < oddNumbers.length; j++) {
//                    oddNumbers[j] = oddNum;
//                    System.out.print("\n"+oddNumbers[j]+", \b");
//                }
//            }
//        }
//        System.out.println("\nIn array the count of Even numbers is : "+even+"\nand count of Odd numbers is : "+odd);

    public static void evensOddsInArray() {
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
            if (isEvenNumber(list[i])) {
                System.out.println(list[i]+" is Even Number.");
                even++;
            } else {
                System.out.println(list[i]+" is Odd Number.");
                odd++;
            }
        }
        System.out.println("\nIn array the count of Even numbers is : " + even + "\nand count of Odd numbers is : " + odd);
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
SirQuestion3.evensOddsInArray();
 */