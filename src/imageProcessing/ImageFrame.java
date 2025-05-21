// Put double frame around the picture.(without cutting of a single pixel.)
package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageFrame {
    public static final int CONSTANT_FOR_FRAME_SIZE = 2;
    public static final int INDEX_OF_nth_COUNT = 1;

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
    public static boolean writeImageToDisk(BufferedImage image, String imageFormat ,String path){
        boolean isSaved = true;
        try{
            isSaved = ImageIO.write(image, imageFormat, new File(path));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            isSaved = false;
        }
        return isSaved;
    }

    public static BufferedImage framedImage(BufferedImage sourceImage, int frameSize){
        // Increase the size of effectImage to prevent the loss of pixels.
        BufferedImage framedImage = new BufferedImage(sourceImage.getWidth()+(frameSize*CONSTANT_FOR_FRAME_SIZE), sourceImage.getHeight()+(frameSize*CONSTANT_FOR_FRAME_SIZE), sourceImage.getType());

        for (int col = 0; col < framedImage.getWidth(); col++) {
            for (int row = 0; row < framedImage.getHeight(); row++) {
                if((col<=((frameSize/2)-INDEX_OF_nth_COUNT) || col>=framedImage.getWidth()-(frameSize/2)) || (row<=((frameSize/2)-INDEX_OF_nth_COUNT) || row>=framedImage.getHeight()-(frameSize/2))) {
                    framedImage.setRGB(col, row, Color.red.getRGB());
                }else if((col<=((frameSize)-INDEX_OF_nth_COUNT) || col>=framedImage.getWidth()-(frameSize)) || (row<=((frameSize)-INDEX_OF_nth_COUNT) || row>=framedImage.getHeight()-(frameSize))){
                    framedImage.setRGB(col, row, Color.blue.getRGB());
                }else{
                    framedImage.setRGB(col, row, sourceImage.getRGB(col-frameSize, row-frameSize));
                }
            }
        }
        return framedImage;
    }
}

/*
 BufferedImage sourceImage = ImageFrame.readImageFromDisk("D:\\CAS\\Image Processing Pictures\\ImageInFrame\\bike.jpg");
        BufferedImage effectImage = ImageFrame.framedImage(sourceImage, 150);
        ImageFrame.writeImageToDisk(effectImage, "jpg", "D:\\CAS\\Image Processing Pictures\\ImageInFrame\\bike01.jpg");
 */

