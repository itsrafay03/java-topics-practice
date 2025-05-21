// Write a Java program to find the sum of first 10 natural numbers?
package forLoop;

public class Question2 {

    // A static method to find and display the Sum of first 10 natural numbers.
    public static int sumNaturalNumbers(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.print("The Sum of first 10 natural numbers is : ");
        return sum;
    }
}

/*
System.out.println(Question2.sumNaturalNumbers());
 */
