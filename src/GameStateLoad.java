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

    public void setContext(GameContext context){
        this.context = context;
    }

    public void draw(Graphics g){
        i++;
        font = new Font("Arial", Font.BOLD, 50);
        color = new Color(6, 185, 3);
        g.setColor(color);
        g.setFont(font);
        g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);
        g.drawString("Game will start in: \n", 300, 320);
        color = new Color(6, 185, 3);
        g.drawString("Ready Player One! \n", 300, 200);
        if(i < 45){
            g.drawString("3",500, 450);
        }
        else if(i < 90){
            g.drawString("2",500, 450);
        }
        else if(i < 140){
            g.drawString("1",500, 450);
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
    public void update(){}
    public void over(){}
    public void win(int winner){}



}

