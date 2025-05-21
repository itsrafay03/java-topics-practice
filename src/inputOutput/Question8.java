package inputOutput;

import java.util.Scanner;

public class Question8 {
    private short age;
    private long ageSeconds;

    public Question8(){

    }

    public Question8(short age, long ageSeconds) {
        this.age = age;
        this.ageSeconds = ageSeconds;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        setAge(scanner.nextShort());
    }
    public void output(){
        setAgeSeconds((long) getAge() *365*24*60*60);
        System.out.print("The Seconds of your age are "+getAgeSeconds());
    }
//    public void output(){
//        //setAgeSeconds(getAge()*365*24*60*60);
//        System.out.print("The Seconds of your age are "+getAge()*365*24*60*60);
//    }

    //Getters Setters
    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public long getAgeSeconds() {
        return ageSeconds;
    }

    public void setAgeSeconds(long ageSeconds) {
        this.ageSeconds = ageSeconds;
    }
}


//        Question8 question8 =new Question8();
//        question8.input();
//        question8.output();
