// Statement : . Prompt user to enter his name , father name , age , occupation , goal , aspirations and print a
//paragraph showing details (As we did in Essay “My Self” in small classes). In short print My Self
//of user.

package inputOutput;

import java.util.Scanner;

public class Question6 {
    private String name;
    private String fatherName;
    private short age;
    private String occupation;
    private String goal;
    private String aspirations;

    public Question6(){

    }

    public Question6(String name, String fatherName, short age, String occupation, String goal, String aspirations) {
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.occupation = occupation;
        this.goal = goal;
        this.aspirations = aspirations;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        setName(scanner.nextLine());
        System.out.print("Enter your father name: ");
        setFatherName(scanner.nextLine());
        System.out.print("Enter your age: ");
        setAge(scanner.nextShort());
        scanner.nextLine();
        System.out.print("Enter your occupation: ");
        setOccupation(scanner.nextLine());
        System.out.print("Enter your goal: ");
        setGoal(scanner.nextLine());
        System.out.print("Enter your aspirations: ");
        setAspirations(scanner.nextLine());
    }

    public void output(){
        System.out.print("\nHere is your 'MY Self' essay:");
        System.out.println("My name is "+getName()+".\nI am a son of "+getFatherName()+".\nI am "+getAge()+" years old.\nMy occupation is "+getOccupation()+".\nThe goal of my life is to "+getGoal()+".\n" +"My aspirations are that "+getAspirations());
    }


    // Getters Setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getAspirations() {
        return aspirations;
    }

    public void setAspirations(String aspirations) {
        this.aspirations = aspirations;
    }
}


//        Question6 question6 = new Question6();
//        question6.input();
//        question6.output();