// Write a java program to put image in TV screen.
package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageScreen1 {
    public static void main(String[] args) {
        // Load Image from disk.
        BufferedImage sourceImage = null, sourceImage2 = null, effectImage = null;
        File file;
        try {
            sourceImage = ImageIO.read(new File("D:\\CAS\\Image Processing Pictures\\ImageInScreen\\tv.jpg"));
            sourceImage2 = ImageIO.read(new File("D:\\CAS\\Image Processing Pictures\\ImageInScreen\\picture.jpg"));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        // Make template of effectImage.
        effectImage = new BufferedImage(sourceImage.getWidth(),sourceImage.getHeight(), sourceImage.getType());
        // Put image in TV screen.
        for (int col = 0; col < sourceImage.getWidth(); col++) {
            for (int row = 0; row < sourceImage.getHeight(); row++) {
                if ((col>532 && col<4480) && (row>555 && row<2780)){
                    effectImage.setRGB(col, row, sourceImage2.getRGB(col,row));
                }else {
                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
                }
            }
        }

        // Save image to disk.
        try {
            ImageIO.write(effectImage, "jpg", new File("D:\\CAS\\Image Processing Pictures\\ImageInScreen\\output.jpg"));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Completed....");
    }
}