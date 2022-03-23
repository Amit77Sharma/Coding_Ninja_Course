package Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
 
 
public class ImgeIO1 {    
 
    public static void main( String[] args ){
      imageIoWrite();
    }
     
    public static void imageIoWrite() {
         BufferedImage bImage = null;
         try {
             File initialImage = new File("D:\\image.jpg");
             bImage = ImageIO.read(initialImage);
 
             ImageIO.write(bImage, "gif", new File("D:\\image.jpg"));
             ImageIO.write(bImage, "jpg", new File("D:\\image.jpg"));
             ImageIO.write(bImage, "bmp", new File("D:\\image.jpg"));
 
         } catch (IOException e) {
               System.out.println("Exception occured :" + e.getMessage());
         }
         System.out.println("Images were written succesfully.");
    }
 
}
