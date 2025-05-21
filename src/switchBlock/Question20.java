// Take char input from user (either in uppercase or lowercase) print the relative
// color using switch case , following VIBGYOR spectrum ?
package switchBlock;

import java.util.Scanner;

public class Question20 {
    static Scanner scanner = new Scanner(System.in);
    private char color;

    public Question20() {
    }

    public Question20(char color) {
        this.color = color;
    }

    public void input(){
        System.out.print("Enter the color character : ");
        setColor(scanner.next().charAt(0));
    }

    public String displayColor(){
        return switch (getColor()){
            case 'V','v' -> "Violet";
            case 'I','i' -> "Indigo";
            case 'B','b' -> "Blue";
            case 'G','g' -> "Green";
            case 'O','o' -> "Yellow";
            case 'Y','y' -> "Orange";
            case 'R','r' -> "Red";
            default -> "Not include in VIBGOYR spectrum.";
        };
    }


    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}

/*
        Question20 question20 = new Question20();
        question20.input();
        System.out.println(question20.displayColor());
 */
