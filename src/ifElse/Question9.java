/*
Write a java program a shop will give discount of 10% if the cost of purchased
quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user?

 */
package ifElse;

import java.util.Scanner;

public class Question9 {
    static Scanner scanner = new Scanner(System.in);
    private float quantity;
    private float quantityCost;

    public static final float discountPercent = 0.1f;   // 10 Percent.
    public static final int unitPerCost = 100;
    public static final int discountCostLimit = 1000;

    // Default Constructor.
    public Question9() {
    }
    // Constructor Overloading.
    public Question9(float quantity) {
        this.quantity = quantity;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the number of Quantity : ");
        setQuantity(scanner.nextFloat());
    }

    // Calculate Cost.
    public void calculateCost(){
        setQuantityCost(quantity*unitPerCost);
    }

    // Cost with Discount.
    private void withDiscount(){
        setQuantityCost(getQuantityCost() - (getQuantityCost() * discountPercent));
    }

    // Cost without Discount.
    private void withOutDiscount(){
        setQuantityCost(getQuantityCost());
    }


    // Method to calculate Cost.
    public void totalCost(){
        calculateCost();
        if(getQuantityCost() > discountCostLimit){
            {
                withDiscount();
            }
        }else {
            {
                withOutDiscount();
            }
        }
        System.out.printf("Your Total Cost is : $%.2f",getQuantityCost());
    }



    // Getters Setters.
    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        if(quantity > 0){
            {
                this.quantity = quantity;
            }
        }else{
            {
                System.out.println("Please enter correct value.");
            }
        }
    }

    public float getQuantityCost() {
        return quantityCost;
    }

    public void setQuantityCost(float quantityCost) {
        this.quantityCost = quantityCost;
    }

}


/*
        Question9 question9 = new Question9();
        question9.input();
        question9.totalCost();
 */