// Write a java program to find the largest of three numbers?
// 1st Number = 120938 , 2nd Number = 25894 , 3rd Number = 52244562
package ifElse;

public class Question18 {
    private final int first_Number = 120938;
    private final int second_Number = 25894;
    private final int third_Number = 52244562;

    // Default Constructor.
    public Question18() {
    }

    // Method to find largest number.
    public void largestNumber(){
        System.out.println("Given that 1st Number = 120938 , 2nd Number = 25894 , 3rd Number = 52244562");
        System.out.print("The Largest number is ");
        if(first_Number>second_Number && first_Number>third_Number){
            {
                System.out.print("First_Number: "+first_Number);
            }
        } else if (second_Number>first_Number && second_Number>third_Number) {
            {
                System.out.print("Second_Number: "+second_Number);
            }
        } else if (third_Number>first_Number && third_Number>second_Number) {
            {
                System.out.print("Third_Number: "+third_Number);
            }
        }
    }
}

/*
        Question18 question18 = new Question18();
        question18.largestNumber();
 */