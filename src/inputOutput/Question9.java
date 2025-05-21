// Statement : Take long as input from user and print it. Do all this in a single statement using anonymous approach.

package inputOutput;

import java.util.Scanner;

public class Question9 {
    private long value;

    public Question9(){

    }
    public Question9(long value) {
        this.value = value;
    }

    public void display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: " + (new Scanner(System.in).nextLong()));
        System.out.println("The value you enter is "+getValue());

//        System.out.print("Enter value in long D.T: ");
//        setValue(scanner.nextLong());
//        System.out.print("The value you enter is "+getValue());



    }


    // Getters Setters.
     private long getValue() {
        return value;
    }

    private void setValue(long value) {
        this.value = value;
    }
}


//        Question9 question9 = new Question9();
//        question9.display();