package inputOutput.housingManagementSystem;

import java.util.Scanner;

public class House {
    static Scanner scanner = new Scanner(System.in);
    private String houseNumber;
    private char houseBlock;
    private int houseArea;
    private byte houseFloors;
    private short numOfRooms;
    private static float housePrice;

    // Default Constructor.
    public House(){

    }

    // Constructors Overloading.
    public House(String houseNumber){
        this.houseNumber = houseNumber;
    }
    public House(String houseNumber, char houseBlock){
        this.houseNumber = houseNumber;
        this.houseBlock = houseBlock;
    }
    public House(String houseNumber, char houseBlock, int houseArea){
        this.houseNumber = houseNumber;
        this.houseBlock = houseBlock;
        this.houseArea = houseArea;
    }
    public House(String houseNumber, char houseBlock, int houseArea, float housePrice){
        this.houseNumber = houseNumber;
        this.houseBlock = houseBlock;
        this.houseArea = houseArea;
        this.housePrice = housePrice;
    }


    public House(String houseNumber, char houseBlock, int houseArea, float housePrice, byte houseFloors, short numOfRooms) {
        this.houseNumber = houseNumber;
        this.houseBlock = houseBlock;
        this.houseArea = houseArea;
        this.housePrice = housePrice;
        this.houseFloors = houseFloors;
        this.numOfRooms = numOfRooms;
    }

    // Input Method.
    private void input(){
        System.out.print("Enter House Number: ");
        setHouseNumber(scanner.nextLine()+scanner.nextLine());
        System.out.print("Enter Block of House(A,B,C): ");
        setHouseBlock(scanner.next().charAt(0));
        System.out.print("Enter Area of House(in Marla): ");
        setHouseArea(scanner.nextInt());
        System.out.print("Enter Stories of House: ");
        setHouseFloors(scanner.nextByte());
        System.out.print("Enter Number of Rooms: ");
        setNumOfRooms(scanner.nextShort());
        System.out.print("Enter Price of House: ");
        setHousePrice(scanner.nextFloat());
    }
    // Encapsulated access of input method through public buyHouse method.
    public void buyHouse(){
        System.out.print("Do you want to buy a House?\nEnter y/n : ");
        String x = scanner.next();
        if(x.equals("y") || x.equals("Y")){
            input();
        }else{
            System.out.println("Sorry! Try Again.");
            buyHouse();
        }
    }

    // Output Method.
    public void output(){
        System.out.println("House: "+getHouseNumber()+"-"+getHouseBlock()+" BwP Avenue Society, Bahawalpur.");
        System.out.println("House Area(in Marla): "+getHouseArea());
        System.out.println("Stories of House : "+getHouseFloors());
        System.out.println("Rooms of House: "+getNumOfRooms());
        System.out.println("Price of House: "+getHousePrice()+"$");
    }

    // Getters Setters.
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public char getHouseBlock() {
        return houseBlock;
    }

    public void setHouseBlock(char houseBlock) {
        this.houseBlock = houseBlock;
    }

    public int getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(int houseArea) {
        this.houseArea = houseArea;
    }

    public static float getHousePrice() {
        return housePrice;
    }

    public static void setHousePrice(float housePrice) {
        House.housePrice = housePrice;
    }

    public byte getHouseFloors() {
        return houseFloors;
    }

    public void setHouseFloors(byte houseFloors) {
        this.houseFloors = houseFloors;
    }

    public short getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(short numOfRooms) {
        this.numOfRooms = numOfRooms;
    }
}

