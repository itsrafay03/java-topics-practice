package inputOutput.housingManagementSystem;
public class HousingSociety {
    private static String housingSocietyName;
    private static String housingSocietyAddress;
    private static int housingSocietyArea;
    private static String housingSocietyOwner;
    private static String housingSocietyContactNo;
    private static byte noOfBlocks;
    private static int noOfHouses;

    // Static Blocks.
    static{
        housingSocietyName = "BwP Avenue Society";
        housingSocietyAddress  = "CH-63, Hasilpur Road, Bahawalpur.";
        housingSocietyArea = 500;
    }
    static{
        housingSocietyOwner = "Muhammad Rafay";
        housingSocietyContactNo = "062-1234567";
    }
    static{
        noOfBlocks = 3;
        noOfHouses = 1000;
    }

    // Default Constructor.
    public HousingSociety(){

    }

    // Constructors Overloading.
    public HousingSociety(String housingSocietyName){

    }
    public HousingSociety(String housingSocietyName, String housingSocietyAddress){

    }
    public HousingSociety(String housingSocietyName, String housingSocietyAddress, int housingSocietyArea){

    }

    // Output Method.
    public void output(){
        System.out.println("Housing society name: "+getHousingSocietyName());
        System.out.println("Housing society address: "+getHousingSocietyAddress());
        System.out.println("Housing society area(in Acres): "+getHousingSocietyArea());
        System.out.println("Housing society owner: "+getHousingSocietyOwner());
        System.out.println("Housing society contactNo: "+getHousingSocietyContactNo());
        System.out.println("Housing society blocks: "+getNoOfBlocks());
        System.out.println("Housing society houses(in each Block): "+getNoOfHouses());
    }


    // Getters Setters.
    public static String getHousingSocietyName() {
        return housingSocietyName;
    }

    public static void setHousingSocietyName(String housingSocietyName) {
        HousingSociety.housingSocietyName = housingSocietyName;
    }
    public static String getHousingSocietyAddress(){
        return housingSocietyAddress;
    }
    public static void setHousingSocietyAddress(String housingSocietyAddress){
        HousingSociety.housingSocietyAddress = housingSocietyAddress;
    }

    public static int getHousingSocietyArea() {
        return housingSocietyArea;
    }

    public static void setHousingSocietyArea(int housingSocietyArea) {
        HousingSociety.housingSocietyArea = housingSocietyArea;
    }

    public static String getHousingSocietyOwner() {
        return housingSocietyOwner;
    }

    public static void setHousingSocietyOwner(String housingSocietyOwner) {
        HousingSociety.housingSocietyOwner = housingSocietyOwner;
    }

    public static String getHousingSocietyContactNo() {
        return housingSocietyContactNo;
    }

    public static void setHousingSocietyContactNo(String housingSocietyContactNo) {
        HousingSociety.housingSocietyContactNo = housingSocietyContactNo;
    }

    public static byte getNoOfBlocks() {
        return noOfBlocks;
    }

    public static void setNoOfBlocks(byte noOfBlocks) {
        HousingSociety.noOfBlocks = noOfBlocks;
    }

    public static int getNoOfHouses() {
        return noOfHouses;
    }

    public static void setNoOfHouses(int noOfHouses) {
        HousingSociety.noOfHouses = noOfHouses;
    }
}
