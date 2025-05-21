// Write a Java program to print all ASCII character with their values?
package doWhileLoop;

public class Question22 {
    public static void printASCIIChars(){
        System.out.println("The ASCII characters with their values are following : ");
        int value = 0;
        do{
            System.out.println((char)value+" = "+value);
            value++;
        }while(value <= 255);
    }
}

/*
Question22.printASCIIChars();
 */