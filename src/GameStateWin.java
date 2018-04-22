import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class GameStateWin implements GameState {
    private int i = 0;
    private int player;
    GameContext context;
    private Color color;
    private Font font;

    public GameStateWin(int p){
        player = p;
    }
    public GameStateWin(GameContext context){

        this.context = context;
    }

    public void draw(Graphics g){
        i++;
        font = new Font("Arial", Font.BOLD, 50);
        color = new Color(6, 185, 3);
        g.setColor(color);
        g.setFont(font);
        g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);
        //g.drawImage(ImageLoader.getImageLoader().getFireworks(),0,0,null);
        g.drawString("Player "+player+" won!!",300, 100);
        if (i>200){
            over();
        }
    }
    public void setContext(GameContext cont){
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
    public void over(){ }

}
