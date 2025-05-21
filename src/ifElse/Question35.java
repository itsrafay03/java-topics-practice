/*
Discount and Revenue:
Revenue can be calculated as the selling price of the product times the quantity
sold, i.e. revenue = price × quantity. Write a program that asks the user to enter
product price and quantity and then calculate the revenue. If the revenue is more
than 5000 a discount is 10% offered. Program should display the discount and net
revenue?
 */
package ifElse;

import java.util.Scanner;

public class Question35 {
    static Scanner scanner = new Scanner(System.in);
    private int priceOfProduct;
    private int quantityOfProduct;
    private int revenue;
    private int netRevenue;
    public static final float discountPercentage = 0.1f;

    // Default Constructor.
    public Question35() {
    }

    // Constructor Overloading.
    public Question35(int priceOfProduct, int quantityOfProduct) {
        this.priceOfProduct = priceOfProduct;
        this.quantityOfProduct = quantityOfProduct;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter Price of product : ");
        setPriceOfProduct(scanner.nextInt());
        System.out.print("Enter Quantity of product : ");
        setQuantityOfProduct(scanner.nextInt());
    }

    // Method to calculate the Revenue.
    public void calcRevenue(){
        setRevenue(getPriceOfProduct()*getQuantityOfProduct());
        System.out.println("Revenue : $"+getRevenue());
    }


    // Method to calculate the net Revenue with discount if needed.
    public void calcNetRevenue(){
        if(getRevenue() > 5000){
            {
                setNetRevenue((int)(getRevenue() - (getRevenue()*discountPercentage)));
            }
        }else {
            {
                setNetRevenue(getRevenue());
            }
        }
        System.out.println("Net Revenue : $"+getNetRevenue());
    }


    // Getters Setters.
    public int getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(int priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Question35.scanner = scanner;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getNetRevenue() {
        return netRevenue;
    }

    public void setNetRevenue(int netRevenue) {
        this.netRevenue = netRevenue;
    }
}

/*
        Question35 question35 = new Question35();
        question35.input();
        question35.calcRevenue();
        question35.calcNetRevenue();
 */