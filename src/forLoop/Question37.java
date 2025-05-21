package forLoop;

public class Question37 {
    public void first(){
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void second(){
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public void third(){
        int space = 4;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if(space >= col){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
            space--;
        }
    }


    public void fourth(){
        int constant = 5;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= constant; col++) {
                System.out.print("*");
            }
            System.out.println();
            constant--;
        }
    }


    public void fifth(){
        int start = 5;
        int end = 5;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 9; col++) {
                if(col >= start && col <= end){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            start--;
            end++;
        }
    }


    public void sixth(){
        int start = 5;
        int end = 5;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 9; col++) {
                if(col >= start && col <= end){
                    System.out.print(row);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            start--;
            end++;
        }
    }


    public void seventh(){
        int start = 5;
        int end = 5;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 9; col++) {
                if(col >= start && col <= end){
                    switch (col){
                        case 1, 9 -> System.out.print("5");
                        case 2, 8 -> System.out.print("4");
                        case 3, 7 -> System.out.print("3");
                        case 4, 6 -> System.out.print("2");
                        default -> System.out.print("1");
                    }
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            start--;
            end++;
        }
    }


    public void eight(){
        int space = 1;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if(space <= col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            space++;
        }
    }
}


/*
        Question37 question37 = new Question37();
        question37.first();
        question37.second();
        question37.third();
        question37.fourth();
        question37.fifth();
        question37.sixth();
        question37.seventh();
        question37.eight();
 */

