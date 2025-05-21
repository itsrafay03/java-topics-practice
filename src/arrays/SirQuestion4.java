// Find out the prime numbers in array.
package arrays;

import java.util.Scanner;

public class SirQuestion4 {
    static Scanner scanner= new Scanner(System.in);
    public static void primeNumbersInArray() {
        int length;
        System.out.print("Enter the length of array : ");
        length = scanner.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the value for list[" + i + "] = ");
            list[i] = scanner.nextInt();
        }


        for (int i = 0; i < list.length; i++) {
            if (isPrimeNumber(list[i])) {
                System.out.println(list[i]+" is a Prime Number.");
            }
            else {
                System.out.println(list[i]+" is not a prime Number.");
            }
        }
    }

    public static boolean isPrimeNumber(int num){
        boolean isPrime = true;
        if(num == 1){
            isPrime = true;
        }
        int count = 2;
        while (num > count){
            if((num % count == 0) && (count < num)){
                //System.out.println(num+" is not a prime number.");
                isPrime = false;
                break;
            }else {
                //System.out.println(num+" is a prime number.");
                isPrime = true;
            }
            count++;
        }
        return isPrime;
    }
}

/*
SirQuestion4.primeNumbersInArray();
 */