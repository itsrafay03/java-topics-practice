// Cut the Image in the form of Diamond shape.
// NOTE : Pick that Image whose width and height is equal.


package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageInDiamond {
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
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Method to cut the pixels of image in diamond shape and put the color outside of diamond.
    public static BufferedImage imageCutInDiamondShape(BufferedImage sourceImage){
        BufferedImage effectImage = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), sourceImage.getType());
//        System.out.println("Columns : "+sourceImage.getWidth());
//        System.out.println("Rows : "+sourceImage.getHeight());

        int start, end, mid;
        start = end = mid = sourceImage.getWidth()/2;
//        System.out.println(start);
//        System.out.println(mid);
//        System.out.println(end);
        for (int row = 0; row < sourceImage.getHeight(); row++) {
            for (int col = 0; col < sourceImage.getHeight(); col++) {
                if(col>=start && col<=end){
                    effectImage.setRGB(col, row, sourceImage.getRGB(col, row));
                }else {
                    effectImage.setRGB(col, row, 0x008080);
                }
            }
            //System.out.println();
            if(row < mid){
                start--;
                end++;
            }else {
                start++;
                end--;
            }
        }
        return effectImage;
    }
}

/*
BufferedImage sourceImage = ImageInDiamond.readImageFromDisk("D:\\CAS\\Image Processing Pictures\\ImageInDiamond\\man.jpg");
        BufferedImage effectImage = ImageInDiamond.imageCutInDiamondShape(sourceImage);
        ImageInDiamond.writeImageToDisk(effectImage, "jpg", "D:\\CAS\\Image Processing Pictures\\ImageInDiamond\\man1.jpg");
 */