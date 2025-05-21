// Write a Java program to find frequency of each digit in a given integer?
package whileLoop;

import java.util.Scanner;

public class Question24 {
    static Scanner scanner = new Scanner(System.in);

    private long number;

    public Question24() {
    }

    public Question24(long number) {
        this.number = number;
    }

    public void input(){
        System.out.print("Enter the number : ");
        setNumber(scanner.nextLong());
    }

    public void checkFrequency(){
        if(getNumber()<0){
            setNumber(-getNumber());
            frequency();
        }else{
            setNumber(getNumber());
            frequency();
        }
    }

    private void frequency() {
        int last_digit;
        int zero, one, two, three, four, five, six, seven, eight, nine, special_char;
        zero = one = two = three = four = five = six = seven = eight = nine = special_char = 0;

        while (getNumber() > 0) {
            last_digit = (int) (getNumber() % 10);
            switch (last_digit) {
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                case 7:
                    seven++;
                    break;
                case 8:
                    eight++;
                    break;
                case 9:
                    nine++;
                    break;
                default:
                    special_char++;
            }
            setNumber(getNumber() / 10);
        }
        System.out.print("Frequency of each digit in given number is : \n");
        System.out.print("Digit 0 appears " + zero + " times.\n");
        System.out.print("Digit 1 appears " + one + " times.\n");
        System.out.print("Digit 2 appears " + two + " times.\n");
        System.out.print("Digit 3 appears " + three + " times.\n");
        System.out.print("Digit 4 appears " + four + " times.\n");
        System.out.print("Digit 5 appears " + five + " times.\n");
        System.out.print("Digit 6 appears " + six + " times.\n");
        System.out.print("Digit 7 appears " + seven + " times.\n");
        System.out.print("Digit 8 appears " + eight + " times.\n");
        System.out.print("Digit 9 appears " + nine + " times.\n");
        System.out.print("Special char appears " + special_char + " times.");
    }


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}

/*
        Question24 question24 = new Question24();
        question24.input();
        question24.checkFrequency();
 */