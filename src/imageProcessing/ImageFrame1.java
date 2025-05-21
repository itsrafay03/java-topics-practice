// Program to add frame around the picture.
package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageFrame1 {
    public static void main(String[] args) {
        // First load picture from Disk to BufferedImage.
        BufferedImage sourceImage = null, effectImage = null;
        File file;
        try {
            sourceImage = ImageIO.read(new File("D:\\CAS\\Image Processing Pictures\\ImageInFrame\\picture.jpg"));}
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        // Make the blueprint of the effectImage(ModifiedImage).
        effectImage = new BufferedImage(sourceImage.getWidth()+200,sourceImage.getHeight()+200, sourceImage.getType());
        // Add frame around the picture, but it will lose some pixels from all sides.
        for (int col = 0; col < effectImage.getWidth(); col++) {
            for (int row = 0; row < effectImage.getHeight(); row++) {
                if((col<=99 || col>=effectImage.getWidth()-100) || (row<=99 || row>=effectImage.getHeight()-100)){
                    effectImage.setRGB(col, row, Color.GREEN.getRGB());
                }else {
                    //effectImage.setRGB(col, row, sourceImage.getRGB(col, row);
                    effectImage.setRGB(col, row, sourceImage.getRGB(col-100, row-100));
                }
            }
        }

        // Save the modified image to Disk.
        try {
            ImageIO.write(effectImage, "jpg", new File("D:\\CAS\\Image Processing Pictures\\ImageInFrame\\picture1.jpg"));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Completed....");
    }
}
