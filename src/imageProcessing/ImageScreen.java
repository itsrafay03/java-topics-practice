// Write a java program to put image in TV screen.
package imageProcessing;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageScreen {
    public static final int STARTING_COL_OF_SCREEN = 532;
    public static final int ENDING_COL_OF_SCREEN = 4480;
    public static final int STARTING_ROW_OF_SCREEN = 555;
    public static final int ENDING_ROW_OF_SCREEN = 2780;

    // Method to load picture from Disk to BufferedImage.
    public static BufferedImage readImageFromDisk(String path){
        BufferedImage sourceImage = null;
        File file = new File(path);
        try{
           sourceImage = ImageIO.read(file);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return sourceImage;
    }

    // Method to save the modified image on Disk.
    public static boolean writeImageToDisk(BufferedImage image, String imageFormat, String path){
        boolean isSaved = true;
        try{
            isSaved = ImageIO.write(image, imageFormat, new File(path));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            isSaved = false;
        }
        return isSaved;
    }

    // Method to load the TV image from Disk to BufferedImage.
    private static BufferedImage readTvImage(){
        BufferedImage sourceImage = null;
        try{
            sourceImage = ImageIO.read(new File("D:\\CAS\\Image Processing Pictures\\ImageInScreen\\tv.jpg"));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return sourceImage;
    }

    // Method to put picture in TV screen.
    public static BufferedImage imageInScreen(BufferedImage image){
        BufferedImage sourceImage = readTvImage(), effectImage = null;
        effectImage = new BufferedImage(sourceImage.getWidth(),sourceImage.getHeight(), sourceImage.getType());
        for (int col = 0; col < sourceImage.getWidth(); col++) {
            for (int row = 0; row < sourceImage.getHeight(); row++) {
                if ((col>STARTING_COL_OF_SCREEN && col<ENDING_COL_OF_SCREEN) && (row>STARTING_ROW_OF_SCREEN && row<ENDING_ROW_OF_SCREEN)){
                    effectImage.setRGB(col, row, image.getRGB(col,row));
                }else {
                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
                }
            }
        }
        return effectImage;
    }
}

/*
BufferedImage sourceImage = ImageScreen.readImageFromDisk("D:\\CAS\\Image Processing Pictures\\ImageInScreen\\picture.jpg");
        BufferedImage effectImage = ImageScreen.imageInScreen(sourceImage);
        ImageScreen.writeImageToDisk(effectImage, "jpg", "D:\\CAS\\Image Processing Pictures\\ImageInScreen\\pic1.jpg");

 */