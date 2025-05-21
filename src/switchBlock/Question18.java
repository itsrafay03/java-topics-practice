// Write a program to check whether a person is eligible to vote or not using switch statement ?
package switchBlock;

import java.util.Scanner;

public class Question18 {
    static Scanner scanner = new Scanner(System.in);
    private short age;

    public Question18() {
    }

    public Question18(short age) {
        this.age = age;
    }

    public void input(){
        System.out.print("Enter your age : ");
        setAge(scanner.nextShort());
    }

    public String eligible_to_vote(){
        return switch (getAge()){
            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17 -> "No. Your age is "+getAge()+" so you are not eligible to cast vote.";
            default -> "Yes. Your age is "+getAge()+" so you are eligible to cast vote.";
        };
    }


    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}

/*
        Question18 question18 = new Question18();
        question18.input();
        System.out.println(question18.eligible_to_vote());
 */