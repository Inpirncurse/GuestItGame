import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.*;

public class GameStateLoad implements GameState {

    GameContext context;
    private int i;
    private Color color;
    private Font font;

    public GameStateLoad(){}

    public GameStateLoad(GameContext context){
        this.context = context;
    }

    public void setContext(GameContext context){
        this.context = context;
    }

    public void draw(Graphics g){
        System.out.println("Estoy en StateLoad bienvenido");
        i++;
        font = new Font("Arial", Font.BOLD, 50);
        color = new Color(6, 185, 3);
        g.setColor(color);
        g.setFont(font);
        g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);

        if(i < 100){
            g.drawString("3",500, 380);
        }
        else if(i < 200){
            g.drawString("2",500, 380);
        }
        else if(i < 300){
            g.drawString("1",500, 380);
        }
        else{
            playerOne();
        }
    }

    public void processKey(KeyEvent e){}
    public void clickMouse(MouseEvent e) {}
    public void start(){}
    public void load(){}
    public void playerOne(){ context.setState(context.getPlayerOne());}
    public void playerTwo() {}
    public void over(){}
    public void win(int winner){}



}

