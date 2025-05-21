// Programs to modify the color of Image by changing the value of each color shade in pixel of Image.
// There is a use of bit wise Shift operators to know the value of each color of pixel.

package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class PracticePixelsProcessing {
    public static void main(String[] args) {
        // Load Image to be modified from disk to this BufferedImage(RAM).
        BufferedImage sourceImage = null, editedImage = null;
        File file = new File("C:\\Users\\itsra\\Pictures\\Screenshots\\picture.png");
        try {
            sourceImage = ImageIO.read(file);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // Blueprint of effectImage.
        editedImage = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), sourceImage.getType());

        // Find the value of each color of pixel separately.
        int pixel = 0;
        int blue = 0;
        int green = 0;
        int red = 0;
        int alpha = 0;
        // Find the value each color by separating it form pixel one by one.
        for (int col = 0; col < sourceImage.getWidth(); col++) {
            for (int row = 0; row < sourceImage.getHeight(); row++) {
                pixel = sourceImage.getRGB(col, row);
                blue = pixel & 0XFF;
                green = pixel >> 8 & 0XFF;
                red = pixel >> 16 & 0XFF;
                alpha = pixel >> 24 & 0XFF;

                // r1:
////                for black and white image;
//                blue = (blue+green+red)/3;
//                green = (blue+green+red)/3;
//                red = (blue+green+red)/3;

                // r2:
//                blue = pixel - blue;
//                green = pixel - green;
//                red = pixel - red;

                // r3:
//                blue = (blue+green+red)/3;
//                green = (blue+green+red)/3;
//                red = (blue+green+red)/3;
//                blue = pixel - blue;
//                green = pixel - green;
//                red = pixel - red;
//                alpha = pixel - alpha;


                // r4:
                // we can create thousands of shades of complete image by changing the value of these colors.
//                blue = 100;
//                green = 170;
//                red = 245;


                // r5:
                // we can create thousands of shades of each color in image by changing the value of these colors.
//                blue = blue - 50;
//                green = green - 50;
//                red = red - 50;


                // r6:
//                blue = blue - 70;
//                green = green - 150;
//                red = red - 25;


//                // r7:
//                blue = blue - 50;


//                // r8:
//                blue = blue + 50;

                // r9:
//                blue = blue + 20;

                // r10:
                // complexion glow.
//                blue = blue + 20;
//                green = green + 15;


                // r11:
//                if(col <50 || row < 50){
//                    //blue = blue + 99;
//                    green = red-50;
//                } else if (col<100 || row<100) {
//                    blue = red+158;
//                } else if (col<150 || row<150) {
//                    blue = red+18;
//                } else if (col<200 || row<200) {
//                    green = red-blue;
//                }


//                // r12:
//                green = green + 200;

//                // r13:
//                blue = red;

//                // r14:
//                blue = red + 47+green - 2*blue;

//                // r15:
//                blue = red + green * blue;

//                // r16:
//                blue = red * green * blue;

//                // r17:
//                blue = green & 255;

//                // r18:
//                blue = green & 25;

//                // r19:
//                blue = alpha;

//                // r20:
//                red = alpha;

//                // r21:
//                green = alpha;

//                // r22:
//                green = red-blue+alpha;

                // r23:
//                green = alpha+250*red;
//
                // Packing the colors all together in one pixel one by one.
                pixel = alpha<<24|red<<16|green<<8|blue;
                editedImage.setRGB(col, row, pixel);
                pixel = sourceImage.getRGB(col, row);
                blue = pixel & 0XFF;
                green = pixel >> 8 & 0XFF;
                red = pixel >> 16 & 0XFF;
                alpha = pixel >> 24 & 0XFF;

            }
        }

        // Save the modified Image to disk and also if cause error the tell about it.
        try {
            ImageIO.write(editedImage, "png", new File("C:\\Users\\itsra\\Pictures\\Screenshots\\picture1.png"));
            System.out.println("Completed.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
