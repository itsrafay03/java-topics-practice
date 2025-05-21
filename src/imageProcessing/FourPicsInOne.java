// Put same Image 4 times in one pic and make it one picture.
package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferDouble;
import java.io.File;
import java.nio.Buffer;

public class FourPicsInOne {
    // Method to load picture from Disk to BufferedImage.
    public static BufferedImage readImageFromDisk(String path){
        BufferedImage sourceImage = null;
        File file = new File(path);
        try{
            sourceImage = ImageIO.read(file);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return sourceImage;
    }

    // Method to save the modified image on Disk.
    public static void writeImageToDisk(BufferedImage image, String imageFormat, String path){
        try{
            ImageIO.write(image, imageFormat, new File(path));
        }catch(Exception s){
            System.out.println(s.getMessage());
        }
    }

    // Method to put four Images in one pic.
    public static BufferedImage fourPicsOfOnePic(BufferedImage sourceImage) {
        // Make the blueprint of effectImage too large that 4 images can set in it.
        BufferedImage effectImage = new BufferedImage(1300, 900, sourceImage.getType());

        System.out.println("Columns : "+sourceImage.getWidth());
        System.out.println("Rows : "+sourceImage.getHeight());
        System.out.println(effectImage.getWidth());
        System.out.println(effectImage.getHeight());
        for (int col = 0; col < effectImage.getWidth(); col++) {
            for (int row = 0; row < effectImage.getHeight(); row++) {
                if((col>=600 && col<700) || (row>=400 && row<500)){
                    effectImage.setRGB(col, row, Color.cyan.getRGB());
                }
                if((col>=0 && col<600)) {
                    if((row>=0 && row<400)){
                        effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
                    }else if(row>=500){
                        effectImage.setRGB(col, row, sourceImage.getRGB(col, row-500));
                    }
                }
                if((col>=700 && col<1300)) {
                    if((row>=0 && row<400)){
                        effectImage.setRGB(col, row, sourceImage.getRGB(col-700, row));
                    }else if(row>=500){
                        effectImage.setRGB(col, row, sourceImage.getRGB(col-700, row-500));
                    }
                }
            }
        }
        return effectImage;
    }
}

/*
        BufferedImage sourceImage = FourPicsInOne.readImageFromDisk("D:\\CAS\\Image Processing Pictures\\fourPicsInOneImage\\car.png");
        BufferedImage effectImage = FourPicsInOne.fourPicsOfOnePic(sourceImage);
        FourPicsInOne.writeImageToDisk(effectImage, "png", "D:\\CAS\\Image Processing Pictures\\fourPicsInOneImage\\fourCars.png");
 */

