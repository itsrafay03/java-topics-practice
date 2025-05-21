// Put 4 different Image in one pic and make it one picture.

package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class FourPicsInOne1 {
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
    public static BufferedImage fourPicsOfOnePic(BufferedImage sourceImage1, BufferedImage sourceImage2, BufferedImage sourceImage3, BufferedImage sourceImage4) {
        // Make the blueprint of effectImage too large that 4 images can set in it.
        BufferedImage effectImage = new BufferedImage(1300, 900, sourceImage1.getType());

        for (int col = 0; col < effectImage.getWidth(); col++) {
            for (int row = 0; row < effectImage.getHeight(); row++) {
                if((col>=600 && col<700) || (row>=400 && row<500)){
                    effectImage.setRGB(col, row, Color.cyan.getRGB());
                }
                if((col>=0 && col<600)) {
                    if((row>=0 && row<400)){
                        effectImage.setRGB(col, row, sourceImage1.getRGB(col, row));
                    }else if(row>=500){
                        effectImage.setRGB(col, row, sourceImage2.getRGB(col, row-500));
                    }
                }
                if((col>=700 && col<1300)) {
                    if((row>=0 && row<400)){
                        effectImage.setRGB(col, row, sourceImage3.getRGB(col-700, row));
                    }else if(row>=500){
                        effectImage.setRGB(col, row, sourceImage4.getRGB(col-700, row-500));
                    }
                }
            }
        }
        return effectImage;
    }
}

/*
BufferedImage sourceImage1 = FourPicsInOne2.readImageFromDisk("C:\\Users\\RAFAY\\Desktop\\pic\\car.png");
        BufferedImage sourceImage2 = FourPicsInOne2.readImageFromDisk("C:\\Users\\RAFAY\\Desktop\\pic\\car2.png");
        BufferedImage sourceImage3 = FourPicsInOne2.readImageFromDisk("C:\\Users\\RAFAY\\Desktop\\pic\\car1.png");
        BufferedImage sourceImage4 = FourPicsInOne2.readImageFromDisk("C:\\Users\\RAFAY\\Desktop\\pic\\car3.png");
        BufferedImage effectImage = FourPicsInOne2.fourPicsOfOnePic(sourceImage1, sourceImage2, sourceImage3, sourceImage4);
        FourPicsInOne2.writeImageToDisk(effectImage, "png", "C:\\Users\\RAFAY\\Desktop\\pic\\fourCars1.png");

 */