import java.awt.*;
import java.awt.event.MouseEvent;

public class GameStateOver implements GameState {

    GameContext context;
    private int i;
    Font font;
    private Color color;

    public GameStateOver(){}
    public void draw(Graphics g){
        i++;
        font = new Font("Verdana", Font.BOLD, 50);
        color = new Color(6, 185, 3);
        g.setColor(color);
        g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);
        g.drawString("Game over",370, 400);
        if(i > 100){
            System.exit(0);
        }
    }
    public void setContext(GameContext context){
        this.context = context;
    }
    public void clickMouse(MouseEvent e) {}
    public void start(){}
    public void load(){}
    public void playerOne(){}
    public void playerTwo(){}
    public void update(){}
    public void win(int winner){}
    public void over(){}


}
