import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;

interface GameState {

    public void draw(Graphics g);
    public void processKey(KeyEvent e);
    public void clickMouse(MouseEvent e);
    public void start();
    public void load();
    public void playerOne();
    public void playerTwo();
    public void update();
    public void over();
    public void win(int winner);
    public void setContext(GameContext cont);
    //public void getImages();
}

