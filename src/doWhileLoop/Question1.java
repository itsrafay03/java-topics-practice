// Write a Java program to display the first 10 natural numbers?
package doWhileLoop;

public class Question1 {
    // Simple static method to print First 10 natural numbers.
    public static void displayNaturalNumbers(){
        System.out.println("First 10 natural numbers are as following : ");
        int count = 1;
        do{
            System.out.println(count);
            count++;
        }while (count <= 10);
    }
}

/*
Question1.displayNaturalNumbers();
 */
