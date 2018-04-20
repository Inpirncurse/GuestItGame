import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageLoader {

    private BufferedImage leon;
    private BufferedImage oso;
    private BufferedImage oso_polar;
    private BufferedImage rinoceronte;
    private BufferedImage tigre;
    private BufferedImage zebra;
    private  BufferedImage background;
    public static ImageLoader imgLoader;

    public ImageLoader() {
        try {
             leon = ImageIO.read(new File("src\\imagenes_animales\\leon.png"));
             oso = ImageIO.read(new File("src\\imagenes_animales\\oso.png"));
             oso_polar = ImageIO.read(new File("src\\imagenes_animales\\oso_polar.png"));
             rinoceronte = ImageIO.read(new File("src\\imagenes_animales\\rinoceronte.png"));
             tigre = ImageIO.read(new File("src\\imagenes_animales\\tigre.png"));
             zebra = ImageIO.read(new File("src\\imagenes_animales\\zebra.png"));
             background = ImageIO.read(new File("src\\imagenes_animales\\background.jpg"));
        }
        catch(IOException e){}
    }

    public static ImageLoader getImageLoader(){
        if(imgLoader == null){
            imgLoader = new ImageLoader();
        }
        return imgLoader;
    }

    public BufferedImage getLion() {
        return leon;
    }

    public BufferedImage getBear() {
        return oso;
    }

    public BufferedImage getPolar_bear() {
        return oso_polar;
    }

    public BufferedImage getRhino() {
        return rinoceronte;
    }

    public BufferedImage getTiger() {
        return tigre;
    }

    public BufferedImage getZebra() {
        return zebra;
    }

    public BufferedImage getBackground() {
        return background;
    }

}