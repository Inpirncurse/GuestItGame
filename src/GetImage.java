import java.util.*;
import java.awt.image.BufferedImage;

import java.util.List;

public class GetImage  {

    char[] letters = new char[] {'L', 'B', 'P', 'R', 'T', 'Z'};
    List<BufferedImage> img = new ArrayList<BufferedImage>();

    public List getImages(char letter) {
        if (letter == 'L'){
            img.add(ImageLoader.getImageLoader().getLion());
            img.add(ImageLoader.getImageLoader().getPolar_bear());
            img.add(ImageLoader.getImageLoader().getZebra());
        }else if(letter == 'B'){
            img.add(ImageLoader.getImageLoader().getRhino());
            img.add(ImageLoader.getImageLoader().getBear());
            img.add(ImageLoader.getImageLoader().getZebra());
        }else if(letter == 'P'){
            img.add(ImageLoader.getImageLoader().getBear());
            img.add(ImageLoader.getImageLoader().getPolar_bear());
            img.add(ImageLoader.getImageLoader().getTiger());
        }else if(letter == 'R'){
            img.add(ImageLoader.getImageLoader().getZebra());
            img.add(ImageLoader.getImageLoader().getLion());
            img.add(ImageLoader.getImageLoader().getRhino());
        }else if(letter == 'T'){
            img.add(ImageLoader.getImageLoader().getLion());
            img.add(ImageLoader.getImageLoader().getRhino());
            img.add(ImageLoader.getImageLoader().getTiger());
        }else if(letter == 'Z'){
            img.add(ImageLoader.getImageLoader().getRhino());
            img.add(ImageLoader.getImageLoader().getPolar_bear());
            img.add(ImageLoader.getImageLoader().getZebra());
        }
        return img;
    }
    public char getLetter(int i){
        char letter;
        letter = letters[i];
        return letter;
    }
}
