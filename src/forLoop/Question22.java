// Write a Java program to find the number and sum of all integer between 100 and
// 200 which are divisible by 9?
package forLoop;

public class Question22 {
    public static final int DIVISIBLE_CONSTANT = 9;

    // Method to find which numbers are divisible by 9 between 100 and 200. Also find Sum
    // of these divisible numbers.
    public void numbersDivisibleBy9(){
        int count = 0;
        int sum = 0;
        System.out.println("The numbers divisible by 9 are : ");
        for (int number = 100; number <= 200; number++) {
            if(number % DIVISIBLE_CONSTANT == 0){
                System.out.print(number+", ");
                count++;
                sum += number;
            }
        }
        System.out.println("\b\b");
        System.out.println("Total numbers divisible by 9 : "+count);
        System.out.println("Sum of numbers divisible by 9: "+sum);
    }
}

/*
        Question22 question22 = new Question22();
        question22.numbersDivisibleBy9();
 */