// Programs to modify the Image in different ways by changing the colors of selected pixels.

package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class PracticeOfImageProcessing {
    public static void main(String[] args) {
        // Load Image to be modified from disk to this BufferedImage(RAM).
        BufferedImage sourceImage = null, effectImage = null;
        File file = new File("D:\\CAS\\Image Processing Pictures\\pictures\\car.png");
        try{
            sourceImage = ImageIO.read(file);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        //Blueprint of effectImage is creating in the below line.
        effectImage =new BufferedImage(sourceImage.getWidth(),sourceImage.getHeight(),sourceImage.getType());

//        //car:1
//        for (int col = 0, maxCol = sourceImage.getWidth()-1; col < sourceImage.getWidth(); col++, maxCol--) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                effectImage.setRGB(col, row, sourceImage.getRGB(maxCol, row));
//
//            }
//        }

//        //car:2
//        for (int col = 0; col < sourceImage.getWidth(); col++) {
//            for (int row = 0, maxRow = sourceImage.getHeight()-1; row < sourceImage.getHeight(); row++, maxRow--) {
//                effectImage.setRGB(col, row, sourceImage.getRGB(col, maxRow));
//
//            }
//        }

//        //car:3
//        for (int col = 0, maxCol = sourceImage.getWidth()-1 ; col < sourceImage.getWidth(); col++, maxCol--) {
//            for (int row = 0, maxRow = sourceImage.getHeight()-1; row < sourceImage.getHeight(); row++,maxRow--) {
//                effectImage.setRGB(col, row, sourceImage.getRGB(maxCol,maxRow));
//            }
//        }


//        //car:4
//        int a = 5, b = 10;
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(col%10==0){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:5
//        int a = 5, b = 10;
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(col%25==0){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:6
//        int a = 5, b = 10;
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(row%15==0){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:7
//        int a = 5, b = 10;
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(col%10==0 && row%25==0){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:8
//        int a = 5, b = 10;
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(col/10==0){     // when the col is less the 10 then col/10 is zero.
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:9
//        int a = 5, b = 10;
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(col/10==5){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:10
//        int a = 5, b = 10;
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(row/10==25){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:11
//        int a = 5, b = 10;
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(col/10==25 && row/10==15){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }



//        //car:12
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(col/10==5 || col/10==15 || col/10==25 || col/10==35 || col/10==45 || col/10==55 ){
//                effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:13
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if(row/10==5 || row/10==15 || row/10==25 || row/10==35 || row/10==45 || row/10==55 ){
//                effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:14
//        int a = 5, b = 10;
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if((col>170&&col<400) && (row>70&&row<120)){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:15
//        int a = 5, b = 10;
//        for (int col = 0; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if ((col > 170 && col < 400) && (row > 120 && row < 300)) {
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else {
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:17
//        int a = 5, b = 10;
//        for (int col = 0; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if ((col > 170 && col < 400) && (row > 70 && row < 120)) {
//                    if ((col > 200 && col < 250) && (row > 85 && row < 100)) {
//                        effectImage.setRGB(col, row, Color.red.getRGB());
//                    }else if ((col > 270 && col < 320) && (row > 85 && row < 100)) {
//                        effectImage.setRGB(col, row, Color.blue.getRGB());
//                    }else if ((col > 340 && col < 390) && (row > 85 && row < 100)) {
//                        effectImage.setRGB(col, row, Color.green.getRGB());
//                    }else {
//                        effectImage.setRGB(col, row, Color.yellow.getRGB());
//                    }
//                }else {
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }

//
//        //car:18
//        for (int col = 0; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if ((col > 170 && col < 400) && (row > 30 && row < 60)) {
//                    effectImage.setRGB(col, row, Color.red.getRGB());
//                }else if ((col > 170 && col < 400) && (row > 70 && row < 100)){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else if ((col > 170 && col < 400) && (row > 110 && row < 140)){
//                    effectImage.setRGB(col, row, Color.green.getRGB());
//                }else if ((col > 170 && col < 400) && (row > 150 && row < 180)){
//                    effectImage.setRGB(col, row, Color.blue.getRGB());
//                }else if ((col > 170 && col < 400) && (row > 190 && row < 220)){
//                    effectImage.setRGB(col, row, Color.pink.getRGB());
//                }else if ((col > 170 && col < 400) && (row > 230 && row < 260)){
//                    effectImage.setRGB(col, row, Color.gray.getRGB());
//                }else if ((col > 170 && col < 400) && (row > 270 && row < 300)){
//                    effectImage.setRGB(col, row, Color.cyan.getRGB());
//                }else if ((col > 170 && col < 400) && (row > 310 && row < 340)){
//                    effectImage.setRGB(col, row, Color.white.getRGB());
//                }else {
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:19
//        int width = sourceImage.getTileWidth();
//        int height = sourceImage.getHeight();
//        for (int col = 0; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if (((col > 0 && col < 10) || (col > width-10 && col < width)) || ((row > 0 && row < 10) || (row > height-10 && row < height))) {
//                    effectImage.setRGB(col, row, Color.red.getRGB());
//                }else {
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:20
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if((col/10==5 || col/10==15 || col/10==25 || col/10==35 || col/10==45 || col/10==55)
//                        && (row/10==5 || row/10==15 || row/10==25 || row/10==35 || row/10==45 || row/10==55)){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:21
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if((col/10==5 || col/10==15 || col/10==25 || col/10==35 || col/10==45 || col/10==55)
//                        || (row/10==5 || row/10==15 || row/10==25 || row/10==35 || row/10==45 || row/10==55)){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//
//                }else{
//                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
//                }
//            }
//        }


//        //car:22
//        System.out.println(sourceImage.getWidth());  // 600
//        System.out.println(sourceImage.getHeight());  // 400
//        for (int col = 0 ; col < sourceImage.getWidth(); col++) {
//            for (int row = 0; row < sourceImage.getHeight(); row++) {
//                if((col > 0 && col <= 300) && (row <= 20 || row > 380 && row < 400)){
//                    effectImage.setRGB(col, row, Color.red.getRGB());
//                }else if ((col>300 && col<=600) && (row<=20||row>380 && row<400)){
//                    effectImage.setRGB(col, row, Color.yellow.getRGB());
//                }else if ((col>0 && col<=20) || (col>580 && col<600)){
//                    effectImage.setRGB(col, row, Color.cyan.getRGB());
//                }else{
//                    effectImage.setRGB(col,row,sourceImage.getRGB(col,row));
//                }
//            }
//        }


       // Save the modified Image to disk and also if cause error the tell about it.
        try {
            ImageIO.write(effectImage, "png", new File("D:\\CAS\\Image Processing Pictures\\pictures\\car23.png"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Completed.");
    }
}