import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.*;
import java.awt.event.MouseEvent;
import java.util.List;


public class PlayerOne implements GameState {

    private GetImage image = new GetImage();
    private Random randomGenerator = new Random();
    MouseEvent e;
    private int x, y;
    private int letter;
    private char letterr;
    GameContext context;
    ImageClickListener click = new ImageClickListener();
    List<BufferedImage> img = new ArrayList<BufferedImage>();
    private boolean flag = true;

    public PlayerOne(){}

    public PlayerOne(GameContext c){
        this.context = context;
    }

    public void draw(Graphics g){
        //System.out.println("Estoy en StatePlayerOne bienvenido");
        g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);
        if(flag) {
            letter = randomGenerator.nextInt(3);
            flag = false;
        }

        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("¿Which Animal starts with " + image.getLetter(letter) + "?", 220, 40);
        letterr = image.getLetter(letter);
        img = image.getImages(letterr);
        int x_m = 0, y_m = 250;
        for(int i = 0; i < 3; i++){
            g.drawImage(img.get(i),x_m, y_m,null);
            x_m += 350;
        }
    }

    public void processKey(KeyEvent e){}
    public void clickMouse(MouseEvent e) {}
    public void start(){}
    public void load(){}
    public void playerOne(){}
    public void playerTwo(){ context.setState(context.getPlayerTwo());}
    public void win(int winner){context.setState(context.getGameStateWin(winner));}
    public void over(){}
    public void setContext(GameContext context){ this.context = context;}

}

