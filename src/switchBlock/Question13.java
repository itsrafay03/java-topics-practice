// Write a java program to display user details using id?
package switchBlock;

import java.util.Scanner;

public class Question13 {
    static Scanner scanner = new Scanner(System.in);
    private static final String id= "Cas.220";
    private String input_id;

    public Question13() {
    }

    public Question13(String input_id) {
        this.input_id = input_id;
    }

    public void input(){
        System.out.print("Enter your user ID : ");
        setInput_id(scanner.nextLine());
    }

    private String user_Details(){
        return """
                Name : Muhammad Rafay
                CNIC : 32102-002739-9
                Phone.no : 0300-1234567
                E-mail : rafay@gmail.com
                Address : House-no 4, Bahawalpur.""";
    }

    public String check_User_ID(){
        return switch (getInput_id()){
            case id -> user_Details();
            default -> "Sorry, Incorrect User-ID.";
        };
    }


    public String getInput_id() {
        return input_id;
    }

    public void setInput_id(String input_id) {
        this.input_id = input_id;
    }
}

/*
        Question13 question13 = new Question13();
        question13.input();
        System.out.println(question13.check_User_ID());
 */
