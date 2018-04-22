import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class GameStateOver implements GameState {

    GameContext context;
    private int i;
    private Color color;

    public GameStateOver(){}
    public GameStateOver(GameContext context){
        this.context = context;
    }
    public void draw(Graphics g){
        color=new Color(122, 24, 232);
        g.setColor(color);
        g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);
        g.drawString("Game over",200, 200);
        if(i>200){
            context.setState(this);
        }
    }
    public void setContext(GameContext context){
        this.context = context;
    }

    public void processKey(KeyEvent e){}
    public void clickMouse(MouseEvent e) {}
    public void start(){}
    public void load(){}
    public void playerOne(){}
    public void playerTwo(){}
    public void update(){}
    public void win(int winner){}
    public void over(){}


}
