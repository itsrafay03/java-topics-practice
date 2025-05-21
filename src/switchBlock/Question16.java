// Write a java Program to find the maximum between three numbers. Using the
// switch statement?
package switchBlock;

import java.util.Scanner;

public class Question16 {
    static Scanner scanner = new Scanner(System.in);
    private double first_num;
    private double second_num;
    private double third_num;

    public Question16() {
    }

    public Question16(double first_num, double second_num, double third_num) {
        this.first_num = first_num;
        this.second_num = second_num;
        this.third_num = third_num;
    }

    public void input(){
        System.out.print("Enter first_number : ");
        setFirst_num(scanner.nextDouble());
        System.out.print("Enter second_number : ");
        setSecond_num(scanner.nextDouble());
        System.out.print("Enter third_number : ");
        setThird_num(scanner.nextDouble());
    }

    public String Maximum_number(){
        switch ((int) ((getSecond_num()/getFirst_num())+(getThird_num()/getFirst_num()))){
            case 0:
                return "The first_number "+getFirst_num()+" is Maximum.";
            default:
                //switch ((int) ((getFirst_num()/getSecond_num())+(getThird_num()/getSecond_num()))){
                switch ((int) ((getFirst_num()/getThird_num())+(getSecond_num()/getThird_num()))){
                    case 0:
                        return "The third_number "+getThird_num()+" is Maximum.";
                    default:
                        return "The second_number "+getSecond_num()+" is Maximum.";
                }
        }
    }



    public double getFirst_num() {
        return first_num;
    }

    public void setFirst_num(double first_num) {
        this.first_num = first_num;
    }

    public double getSecond_num() {
        return second_num;
    }

    public void setSecond_num(double second_num) {
        this.second_num = second_num;
    }

    public double getThird_num() {
        return third_num;
    }

    public void setThird_num(double third_num) {
        this.third_num = third_num;
    }
}
/*

 */