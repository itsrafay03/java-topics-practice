// this program is a game of Mad Lips.
package inputOutput;

import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    private String noun1;
    private String noun2;
    private String noun3;
    private String noun4;
    private String noun5;
    private String verb1;
    private String verb2;
    private String verb3;
    private String verb4;
    private String adjective1;
    private String adjective2;
    private String adjective3;
    private String adjective4;

    public Game(){

    }

    public Game(String noun1, String noun2, String noun3, String noun4, String noun5, String verb1, String verb2, String verb3, String verb4, String adjective1, String adjective2, String adjective3, String adjective4) {
        this.noun1 = noun1;
        this.noun2 = noun2;
        this.noun3 = noun3;
        this.noun4 = noun4;
        this.noun5 = noun5;
        this.verb1 = verb1;
        this.verb2 = verb2;
        this.verb3 = verb3;
        this.verb4 = verb4;
        this.adjective1 = adjective1;
        this.adjective2 = adjective2;
        this.adjective3 = adjective3;
        this.adjective4 = adjective4;
    }

    public void input(){
        System.out.print("Enter the following requirements for Mad Lips Game.");
        // Nouns.
        System.out.print("\nEnter Noun (person name) : ");
        setNoun1(scanner.nextLine());
        System.out.print("Enter Noun (place name) : ");
        setNoun2(scanner.nextLine());
        System.out.print("Enter Noun (place name) : ");
        setNoun3(scanner.nextLine());
        System.out.print("Enter Noun (person name) : ");
        setNoun4(scanner.nextLine());
        System.out.print("Enter Noun (plural noun) : ");
        setNoun5(scanner.nextLine());
        // Adjectives.
        System.out.print("Enter Adjective : ");
        setAdjective1(scanner.next());
        System.out.print("Enter Adjective : ");
        setAdjective2(scanner.next());
        System.out.print("Enter Adjective : ");
        setAdjective3(scanner.next());
        System.out.print("Enter Adjective : ");
        setAdjective4(scanner.next());
        // Verbs.
        System.out.print("Enter Verb : ");
        setVerb1(scanner.next());
        System.out.print("Enter Verb : ");
        setVerb2(scanner.next());
        System.out.print("Enter Verb : ");
        setVerb3(scanner.next());
        System.out.print("Enter Verb (with ing) : ");
        setVerb4(scanner.next());
    }

    public void output(){
        System.out.println("My friend is "+getNoun1()+". He is a very "+getAdjective1()+
                "\nand "+getAdjective2()+" guy. We both "+getVerb1()+" together. On every"+
                "\nSunday we both went to "+getNoun2()+". In "+getNoun3()+" he "+getVerb2()+
                "\nwith "+getNoun4()+". He even managed to win multiple "+getNoun5()+"\nfor "+
                "his "+getAdjective3()+" work. Ali "+getVerb3()+" with me yesterday, but I was"+
                " \n"+getVerb4()+". Now still he is my "+getAdjective4()+" partner.");
    }

    // Getters Setters.
    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Game.scanner = scanner;
    }

    public String getNoun1() {
        return noun1;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public String getNoun4() {
        return noun4;
    }

    public void setNoun4(String noun4) {
        this.noun4 = noun4;
    }

    public String getNoun5() {
        return noun5;
    }

    public void setNoun5(String noun5) {
        this.noun5 = noun5;
    }

    public String getVerb1() {
        return verb1;
    }

    public void setVerb1(String verb1) {
        this.verb1 = verb1;
    }

    public String getVerb2() {
        return verb2;
    }

    public void setVerb2(String verb2) {
        this.verb2 = verb2;
    }

    public String getVerb3() {
        return verb3;
    }

    public void setVerb3(String verb3) {
        this.verb3 = verb3;
    }

    public String getVerb4() {
        return verb4;
    }

    public void setVerb4(String verb4) {
        this.verb4 = verb4;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public String getAdjective3() {
        return adjective3;
    }

    public void setAdjective3(String adjective3) {
        this.adjective3 = adjective3;
    }

    public String getAdjective4() {
        return adjective4;
    }

    public void setAdjective4(String adjective4) {
        this.adjective4 = adjective4;
    }
}


//        Game game = new Game();
//        game.input();
//        game.output();
