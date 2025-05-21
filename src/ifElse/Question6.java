// Write a Java program to accept the height of a person in centimeter and categorize
// the person according to their height?
package ifElse;

import java.util.Scanner;

public class Question6 {
    static Scanner scanner = new Scanner(System.in);
    private float height;
    private String heightCategory;

    // Default Constructor.
    public Question6() {
    }
    // Constructor Overloading.
    public Question6(float height) {
        this.height = height;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter your Height (in centimeters) : ");
        setHeight(scanner.nextFloat());
    }

    // Method to categorize the Height.
    public void categorizeHeight(){
        System.out.println("Your Height is "+getHeight()+" cm");
        if(getHeight()<=110){   // 3.5 foot
            {
                setHeightCategory("Very Small Height.");
            }
        }else if(getHeight()<=140){   // 4.5 foot
            {
               setHeightCategory("Small Height.");
            }
        }else if(getHeight()<=170){   // 5.5 foot
            {
                setHeightCategory("Average Height.");
            }
        }else if(getHeight()<=200){   // 6.5 foot
            {
                setHeightCategory("Good Height.");
            }
        }else{
            {
                setHeightCategory("Very Large Height.");
            }
        }
        System.out.println("Height Category : "+getHeightCategory());
    }



    // Getters Setters.
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if(height >= 0){
            {
                this.height = height;
            }
        }else {
            {
                System.out.println("Please enter correct height.");
                input();
            }
        }
    }

    public String getHeightCategory() {
        return heightCategory;
    }

    public void setHeightCategory(String heightCategory) {
        this.heightCategory = heightCategory;
    }
}

/*
        Question6 question6 = new Question6();
        question6.input();
        question6.categorizeHeight();
 */
