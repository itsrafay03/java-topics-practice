// Write a java program to count total number of notes in given amount?
package ifElse;

import java.util.Scanner;

public class Question32 {
    static Scanner scanner = new Scanner(System.in);
    private int amount;
    private int notes;
    private int extra;

    // Default Constructor.
    public Question32() {
    }

    // Constructor Overloading.
    public Question32(int amount) {
        this.amount = amount;
    }

    // Input Method.
    public void input(){
        System.out.print("Enter the amount : ");
        setAmount(scanner.nextInt());
    }

    // Method to calculate the number of notes.
    public void notesCalculate(){
        if(getAmount()>=5000){
            setNotes(getAmount()/5000);
            setExtra(getAmount() % 5000);
            //System.out.println("5000 notes : "+getNotes()+" and extra : "+getExtra());
            System.out.println("5000 notes : "+getNotes());
            setAmount(getExtra());
        }if(getAmount()>=1000){
            setNotes(getAmount()/1000);
            setExtra(getAmount() % 1000);
            //System.out.println("1000 notes : "+getNotes()+" and extra : "+getExtra());
            System.out.println("1000 notes : "+getNotes());
            setAmount(getExtra());
        }if(getAmount()>=500){
            setNotes(getAmount()/500);
            setExtra(getAmount() % 500);
            //System.out.println("500 notes : "+getNotes()+" and extra : "+getExtra());
            System.out.println("500 notes : "+getNotes());
            setAmount(getExtra());
        }if(getAmount()>=100){
            setNotes(getAmount()/100);
            setExtra(getAmount() % 100);
            //System.out.println("100 notes : "+getNotes()+" and extra : "+getExtra());
            System.out.println("100 notes : "+getNotes());
            setAmount(getExtra());
        }if(getAmount()>=50){
            setNotes(getAmount()/50);
            setExtra(getAmount() % 50);
            //System.out.println("50 notes : "+getNotes()+" and extra : "+getExtra());
            System.out.println("50 notes : "+getNotes());
            setAmount(getExtra());
        }if(getAmount()>=20){
            setNotes(getAmount()/20);
            setExtra(getAmount() % 20);
            //System.out.println("20 notes : "+getNotes()+" and extra : "+getExtra());
            System.out.println("20 notes : "+getNotes());
            setAmount(getExtra());
        }if(getAmount()>=10){
            setNotes(getAmount()/10);
            setExtra(getAmount() % 10);
            //System.out.println("10 notes : "+getNotes()+" and extra : "+getExtra());
            System.out.println("10 notes : "+getNotes());
            setAmount(getExtra());
        }if(getAmount()>=5) {
            setNotes(getAmount() / 5);
            setExtra(getAmount() % 5);
            //System.out.println("5 coins : "+getNotes()+" and extra : "+getExtra());
            System.out.println("5 coins : " + getNotes());
            setAmount(getExtra());
        }if(getAmount()>=2) {
            setNotes(getAmount() / 2);
            setExtra(getAmount() % 2);
            //System.out.println("2 coins : "+getNotes()+" and extra : "+getExtra());
            System.out.println("2 coins : " + getNotes());
            setAmount(getExtra());
        }if(getAmount()>=1) {
            setNotes(getAmount());
            setExtra(getAmount());
            //System.out.println("1 coins : "+getNotes()+" and extra : "+getExtra());
            System.out.println("1 coins : " + getNotes());
            setAmount(getExtra());
        }
//        else{
//            System.out.println(getAmount());
//            if(getAmount()>0){
//                System.out.println("Coins : "+getAmount());
//            }
//        }
        System.out.println("\nAll Done.");
    }



    // Getter Setter.
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

}

/*
        Question32 question32 = new Question32();
        question32.input();
        question32.notesCalculate();
 */
