/*
If
x = 2
y = 5
z = 0
then find values of the following expressions:
a. x == 2
b. x != 5
c. x != 5 && y >= 5
d. z != 0 || x == 2
e. !(y < 10)
 */
package ifElse;

public class Question16 {
    public final byte x = 2;
    public final byte y = 5;
    public final byte z = 0;

    // Default Constructor.
    public Question16() {
    }

    // Method to find values of the following expressions.
    public void valuesOfExpressions(){
        System.out.println("Given that x = 2, y = 5, z = 0\nNow Expressions are:");
        System.out.println("Value of (x == 2) is : "+(x == 2));
        System.out.println("Value of (x != 5) is : "+(x != 5));
        System.out.println("Value of (x != 5 && y >= 5) is : "+(x != 5 && y >= 5));
        System.out.println("Value of (z != 0 || x == 2) is : "+(z != 0 || x == 2));
        System.out.println("Value of (!(y < 10)) is : "+(!(y < 10)));
    }
}

/*
        Question16 question16 = new Question16();
        question16.valuesOfExpressions();
 */