/*
Write a java program to accept id from user to confirm department using switch case?
Department:                  Id:
Computer Science            CS-1
Software Engineering        SE-2
Information Technology      IT-3
Artificial Intelligence     AI-4
Anonymous Department        AD-0

 */
package switchBlock;

import java.util.Scanner;

public class Question11 {
    static Scanner scanner = new Scanner(System.in);
    private String id;

    public Question11() {
    }

    public Question11(String id) {
        this.id = id;
    }

    public void input(){
        System.out.print("Enter the Department ID : ");
        setId(scanner.nextLine());
    }

    public String Department(){
        return switch (getId()){
            case "CS-1" -> "Computer Science";
            case "SE-2" -> "Software Engineering";
            case "IT-3" -> "Information Technology";
            case "AI-4" -> "Artificial Intelligence";
            case "AD-0" -> "Anonymous Department";
            default -> "No Department for this ID.";
        };
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/*
        Question11 question11 = new Question11();
        question11.input();
        System.out.println("Department : "+question11.Department());
 */