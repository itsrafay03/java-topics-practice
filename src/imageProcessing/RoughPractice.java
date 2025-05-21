package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class RoughPractice {

    public static BufferedImage readImage(String path){
        BufferedImage sourceImg = null;
        try {
            sourceImg = ImageIO.read(new File(path));
        }catch (Exception ex){
            System.out.println("Message: "+ex);
        }
        return sourceImg;
    }

    public static void writeImage(BufferedImage img, String format, String path){
        try {
            ImageIO.write(img, format, new File(path));
            System.out.println("Successfully Done.");
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static BufferedImage imageProcessing(BufferedImage sourceImg){
        BufferedImage effectImage = new BufferedImage(sourceImg.getWidth(), sourceImg.getHeight(), sourceImg.getType());
        Graphics2D g = effectImage.createGraphics();
        System.out.println(sourceImg.getWidth());
        System.out.println(sourceImg.getHeight());
        for (int col = 0; col < sourceImg.getWidth(); col++) {
            for (int row = 0; row < sourceImg.getHeight(); row++) {
                if((col<=50 || col>=1230) || (row<=50 || row>=670)){
                    effectImage.setRGB(col, row, Color.red.getRGB());
                } else if((col<=100 || col>=1180) || (row<=100 || row>=620)){
                    effectImage.setRGB(col, row, Color.green.getRGB());
                }else {
                    effectImage.setRGB(col, row, sourceImg.getRGB(col, row));
                }
            }
        }
        return effectImage;
    }


    public static void main(String[] args) {
        BufferedImage sourceImage = RoughPractice.readImage("C:\\Users\\itsra\\Pictures\\Camera Roll\\me.jpg");
        BufferedImage effectImage = RoughPractice.imageProcessing(sourceImage);
        RoughPractice.writeImage(effectImage, "jpg", "C:\\Users\\itsra\\Pictures\\Camera Roll\\pic3.jpg");
    }
}
