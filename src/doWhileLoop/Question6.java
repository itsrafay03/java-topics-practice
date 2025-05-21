// Write a Java program to find the sum of first 10 natural numbers?
package doWhileLoop;

public class Question6 {
    private static final int LIMIT_OF_NATURAL_NUMBER = 10;
    public static int sumOfNaturalNumbers(){
        System.out.print("The Sum of first "+LIMIT_OF_NATURAL_NUMBER+" natural numbers is ");
        int count = 1;
        int sum = 0;
        do{
            sum += count;
            count++;
        } while(count <= LIMIT_OF_NATURAL_NUMBER);
        return sum;
    }
}

/*
System.out.println(Question6.sumOfNaturalNumbers());
 */



