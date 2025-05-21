package inputOutput.housingManagementSystem;

import java.awt.geom.Area;
import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private String customerName;
    private String customerCNIC;
    private String customerPhoneNo;

    // Default Constructor.
    public Customer(){

    }

    // Constructor Overloading.
    public Customer(String customerName){
        this.customerName = customerName;
    }
    public Customer(String customerName, String customerCNIC){
        this.customerName = customerName;
        this.customerCNIC = customerCNIC;
    }

    public Customer(String customerName, String customerCNIC, String customerPhoneNo) {
        this.customerName = customerName;
        this.customerCNIC = customerCNIC;
        this.customerPhoneNo = customerPhoneNo;
    }

    // Copy Constructor.
    public Customer(Customer c){
        customerName = c.customerName;
        customerCNIC = c.customerCNIC;
        customerPhoneNo = c.customerPhoneNo;
    }

    // Input Method.
    private void input(){
        System.out.print("Enter Customer name: ");
        setCustomerName(scanner.nextLine()+scanner.nextLine());
        System.out.print("Enter Customer CNIC: ");
        setCustomerCNIC(scanner.nextLine());
        System.out.print("Enter Customer phoneNo: ");
        setCustomerPhoneNo(scanner.nextLine());
    }
    // Encapsulated access of input method through public registerCustomer method.
    public void registerCustomer(){
        System.out.print("Are you a New Customer?\nEnter y/n : ");
        String x = scanner.next();
        if(x.equals("y") || x.equals("Y")){
            input();
        }else{
            System.out.println("Sorry! Try Again.");
            registerCustomer();
        }
    }

    // Output Method.
    public void output(){
        System.out.println("Name is: "+customerName);
        System.out.println("CNIC is: "+getCustomerCNIC());
        System.out.println("Phone is: "+getCustomerPhoneNo());
    }


    // Getters Setters.
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCNIC() {
        return customerCNIC;
    }

    public void setCustomerCNIC(String customerCNIC) {
        this.customerCNIC = customerCNIC;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }
}
