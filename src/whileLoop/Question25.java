// Write a Java program to print all ASCII character with their values?
package whileLoop;

public class Question25 {
    public void displayASCIIChars(){
        System.out.println("All ASCII character with their values are as following : ");
        int value = 0;
        while (value <= 255){
            System.out.println((char)value + " = " + value);
            value++;
        }
    }
}

/*
        Question25 question25 = new Question25();
        question25.displayASCIIChars();
 */