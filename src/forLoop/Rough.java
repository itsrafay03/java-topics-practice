package forLoop;

import java.util.Scanner;

public class Rough {
    static Scanner scanner = new Scanner(System.in);
    static int scx;
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(218));
        System.out.println(isPrime(17));
        System.out.println(isPrime(33));
        System.out.println(isPrime(325));
        System.out.println(isPrime(79834));

        for (int i = 0; inputValidate(); i++) {
            System.out.println("No is : "+scx);
            System.out.println(i);
        }
    }
    public static boolean inputValidate(){
        System.out.println("Enter Number:");
        if (scanner.hasNextInt()) {
            scx = scanner.nextInt();
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPrime(int num){
        int n = 2;
        while (num % n != 0){
            n++;
        }
        if (n == num) {
            return true;
        }else {
            return false;
        }


//        do{
//            n++;
//        if (n == num) {
//            return true;
//        }else {
//            return false;
//        }
//
//        }while (num % n != 0);
    }
}
