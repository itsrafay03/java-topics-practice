package whileLoop;

import java.util.Scanner;

public class Assingment {
    static Scanner scanner = new Scanner(System.in);
//    public static int validInput(String outMessage){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(outMessage);
//        while(!scanner.hasNextInt()){
//            scanner.nextLine();
//            System.out.println("Invalid int ! Try again.");
//            System.out.print(outMessage);
//        }
//        return scanner.nextInt();
//    }

//    public static int validInput(String outMessage,int startRange, int lastRange){
//        int rollNo;
//        System.out.print(outMessage);
//        while(!scanner.hasNextInt()){
//            scanner.nextLine();
//            System.out.println("Invalid int ! Try again.");
//            System.out.print(outMessage);
//        }
//        rollNo = scanner.nextInt();
//        while(!(rollNo>=startRange && rollNo<=lastRange)){
//            scanner.nextLine();
//            System.out.println("Out of Range.!.");
//            System.out.print(outMessage);
//        }
//        return rollNo;
//    }
//    if(!(scanner.nextInt()>startRange && scanner.nextInt()<lastRange)) {
//        System.out.println("Out of Range.!.");
//        System.out.print(outMessage);
//    }

    public static void validInput(String outMessage, int startRange, int lastRange) {
        int rollNo;
        System.out.print(outMessage);
        while (scanner.hasNextInt()) {
            while (scanner.nextInt() >= startRange && scanner.nextInt() <= lastRange) {
                rollNo = scanner.nextInt();
            }
            scanner.nextLine();
            System.out.println("Out of Range.!.");
            System.out.print(outMessage);
        }
        scanner.nextLine();
        System.out.println("Invalid int ! Try again.");
        System.out.print(outMessage);
        //return rollNo;
    }
}
