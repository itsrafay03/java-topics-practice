package inputOutput.housingManagementSystem;

import java.util.Scanner;


public class Payment {
    static Scanner scanner = new Scanner(System.in);
    House house = new House();    // Object of the House class.
    private float amount;
    private float dueAmount;
    private float extraAmount;
    private String date;

    // Constructors Overloading.
    // Default Constructor.
    public Payment(){

    }
    public Payment(float amount){
        this.amount = amount;

    }
    public Payment(String date){
        this.date= date;
    }
    public Payment(float amount, String date){
        this.amount = amount;
        this.date= date;
    }
    public Payment(String date, float amount){
        this.date= date;
        this.amount = amount;
    }
    public Payment(float amount, float dueAmount, float extraAmount, String date) {
        this.amount = amount;
        this.dueAmount = dueAmount;
        this.extraAmount = extraAmount;
        this.date = date;
    }

    // input method.
    private void input(){
        System.out.println("The Price of your House is: "+House.getHousePrice()+"$");
        System.out.print("Enter your Payment Amount: ");
        setAmount(scanner.nextFloat());
        System.out.print("Enter date: ");
        setDate(scanner.nextLine()+scanner.nextLine());
    }
    //Encapsulated access of input method through public payHouse method.
    public void payHouse(){
        System.out.print("Do you want to pay Amount of your House?\nEnter y/n : ");
        String x = scanner.next();
        if(x.equals("y") || x.equals("Y")){
            input();
        }else{
            System.out.println("Sorry! You have to Pay the Amount to buy your House.");
            payHouse();
        }
    }

    // Remaining and Due Amount method.
    public void calculate(){
        setExtraAmount(getAmount()-house.getHousePrice());
        setDueAmount(house.getHousePrice()-getAmount());
        if(getAmount() >= house.getHousePrice()){
            System.out.println("Congratulations! You have successfully paid for your house.\nThe Extra Amount is: "+getExtraAmount()+"$\nThe Due Amount is: "+0.0+"$");
        }else{
            System.out.println("Okay! You have successfully paid some amount for your house.\nThe Due Amount is: "+getDueAmount()+"$");
        }
        System.out.print("Date: "+getDate());
    }



    // Output Method.
    public void output(){
        payHouse();
        calculate();
    }

    // Getters Setters.
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(float dueAmount) {
        this.dueAmount = dueAmount;
    }

    public float getExtraAmount() {
        return extraAmount;
    }

    public void setExtraAmount(float extraAmount) {
        this.extraAmount = extraAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
