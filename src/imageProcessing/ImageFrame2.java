// Put single frame around the picture.(without cutting of a single pixel.)

package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageFrame2 {
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
    public static void writeImageToDisk(BufferedImage image, String imageFormat , String path){
        try{
            ImageIO.write(image, imageFormat, new File(path));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    // Method to add single frame to the Image.
    public static BufferedImage framedImage(BufferedImage sourceImage, int frameSize, String color){
        // Increase the size of effectImage to prevent the pixels loss.
        BufferedImage framedImage = new BufferedImage(sourceImage.getWidth()+(frameSize*CONSTANT_FOR_FRAME_SIZE), sourceImage.getHeight()+(frameSize*CONSTANT_FOR_FRAME_SIZE), sourceImage.getType());

        for (int col = 0; col < framedImage.getWidth(); col++) {
            for (int row = 0; row < framedImage.getHeight(); row++) {
                if((col<=((frameSize)-INDEX_OF_nth_COUNT) || col>=framedImage.getWidth()-(frameSize)) || (row<=((frameSize)-INDEX_OF_nth_COUNT) || row>=framedImage.getHeight()-(frameSize))){
                    framedImage.setRGB(col, row, hexaDecimalValueOfColor(color));
                }else{
                    framedImage.setRGB(col, row, sourceImage.getRGB(col-frameSize, row-frameSize));
                }
            }
        }
        return framedImage;
    }

    // Method to select the color of Frame.
    public static int hexaDecimalValueOfColor(String color){
        return switch (color.toLowerCase()){
            case "white" -> 0xFFFFFF;
            case "red" -> 0xFF0000;
            case "lime" -> 0x00FF00;
            case "blue" -> 0x0000FF;
            case "yellow" -> 0xFFFF00;
            case "cyan" -> 0x00FFFF;
            case "magenta" -> 0xFF00FF;
            case "silver" -> 0xC0C0C0;
            case "gray" -> 0x808080;
            case "maroon" -> 0x800000;
            case "olive" -> 0x808000;
            case "green" -> 0x008000;
            case "purple" -> 0x800080;
            case "teal" -> 0x008080;
            case "navy" -> 0x000080;
            default -> 0x000000;
        };
    }
}

/*
BufferedImage sourceImage = ImageFrame2.readImageFromDisk("D:\\CAS\\Image Processing Pictures\\ImageInFrame\\wheeling.jpg");
        BufferedImage effectImage = ImageFrame2.framedImage(sourceImage, 150, "cyan");
        ImageFrame2.writeImageToDisk(effectImage, "jpg", "D:\\CAS\\Image Processing Pictures\\ImageInFrame\\wheeling1.jpg");
 */