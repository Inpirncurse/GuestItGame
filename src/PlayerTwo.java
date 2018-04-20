import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;
import java.awt.Font;

public class PlayerTwo implements GameState {
    private ArrayList<Character> correctLetters;   // correct guesses
    private ArrayList<Character> secret_word_arr;	//the secret word converted to array
    private Scanner scan = new Scanner(System.in); // for user input
   // private ChooseWord word;
    private	String secretword;
    private String s;
    private int i=0;
    private int t=0;
    private Color color;
    private Font font;
    private boolean clap;
    GameContext context;

    public PlayerTwo(){

    }

    public PlayerTwo(GameContext c){
    }

    public void draw(Graphics g){
     System.out.println("Estoy en StatePlayerTwo bienvenido");
     g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);
    }

    public void processKey(KeyEvent e){
    }



    public void clickMouse(MouseEvent e) {}
    public void start(){}
    public void load(){}
    public void playerOne(){context.setState(context.getPlayerOne());}
    public void playerTwo(){}
    public void over(){}
    public void win(int winner){}
    public void setContext(GameContext context){ this.context = context;}


}

