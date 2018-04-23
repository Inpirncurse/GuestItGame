import java.awt.*;
import java.awt.event.MouseEvent;

public class GameStateStart implements GameState{

    GameContext context;
    Font font;
    Color color;

    public GameStateStart(){}
    public void draw(Graphics g) {
        font = new Font("Verdana", Font.BOLD, 50);
        color = new Color(6, 185, 3);
        g.setColor(color);
        g.setFont(font);
        g.drawImage((ImageLoader.getImageLoader().getBackground()),0,0,null);
        g.drawString("Welcome to Guess the Animal!!", 75, 200);
        font = new Font("Arial", Font.BOLD, 30);
        color = new Color(255, 255, 255);
        g.setColor(color);
        g.setFont(font);
        g.drawString("Click the screen to start the game!",250, 450);
        g.drawString("The player with less time wins!",280, 550);
    }
    public void setContext(GameContext cont){ this.context = cont; }
    public void start() {}
    public void load(){ context.setState(context.getGameLoadState()); }
    public void playerOne(){}
    public void playerTwo(){}
    public void over(){}
    public void update(){}
    public void win(int winner){}
    public void clickMouse(MouseEvent e) { load();}
}
