import java.awt.Graphics;
import java.awt.event.MouseEvent;

interface GameState {
    public void draw(Graphics g);
    public void clickMouse(MouseEvent e);
    public void start();
    public void load();
    public void playerOne();
    public void playerTwo();
    public void update();
    public void over();
    public void win(int winner);
    public void setContext(GameContext cont);
}

