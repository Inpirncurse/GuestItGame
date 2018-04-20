import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GameStateStart implements GameState{

    GameContext context;
    Font font;
    Color color;

    public GameStateStart(){}

    public GameStateStart(GameContext context){
        this.context = context;
    }

    public void draw(Graphics g) {
        //System.out.println("Estoy en StateStart bienvenido");
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

    }

    public void setContext(GameContext cont){ this.context = cont; }
    public void start() {}
    public void load(){ context.setState(context.getGameLoadState()); }
    public void playerOne(){}
    public void playerTwo(){}
    public void over(){}
    public void win(int winner){}
    public void clickMouse(MouseEvent e) { load();}
    public void processKey(KeyEvent e){

    }

}