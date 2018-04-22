import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.util.*;
import java.awt.event.MouseEvent;
import java.util.List;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;


 public class PlayerTwo implements GameState {

  private GetImage image = new GetImage();
  private Random randomGenerator = new Random();
  private int letter;
  private char letterr;
  private int turn = 0;
  private boolean correct = false;
  private Time time = new Time();
  private int round = 1;
  int[] timeRound = new int[3];
  int totalTime = 0;
  int j = 0;
  MouseEvent e;
  GameContext context;
  List<BufferedImage> img = new ArrayList<BufferedImage>();
  private boolean flag = true;
  private boolean[] blockt = {false, false, false};

  public PlayerTwo(){
  }

  public PlayerTwo(GameContext c){
   this.context = context;
  }


  public void draw(Graphics g){
  //System.out.println("Estoy en StatePlayerOne bienvenido");
  HUD.getHud().setTurns(1);
  g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);

  if(flag == true) {
     HUD.getHud().setTimeValue(0);
     letter = randomGenerator.nextInt(6);
     flag = false;
   }

   HUD.getHud().hud(g, round);
   g.setFont(new Font("Arial", Font.BOLD, 40));
   g.drawString("Player Two...¿Which Animal starts with " + image.getLetter(letter) + "?", 100, 40);
   g.drawString("Round " + round, 200, 200);
   letterr = image.getLetter(letter);
   img = image.getImages(letterr);

   int x_m = 0, y_m = 250;
   for(int i = 0; i < 3; i++){
    g.drawImage(img.get(i),x_m, y_m,null);
    x_m += 350;
   }

   if (blockt[0] == true && correct == false) {
    g.drawImage(ImageLoader.getImageLoader().getBad(), 40 , 280, null);
   }
   if (blockt[1]== true && correct == false) {
    g.drawImage(ImageLoader.getImageLoader().getBad(), 380 , 280, null);
   }
   if (blockt[2]== true && correct == false) {
    g.drawImage(ImageLoader.getImageLoader().getBad(), 750 , 280, null);
   }

  }

  public void processKey(KeyEvent e){}
  public void clickMouse(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();

   switch(letterr){
    case 'L':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      correct = true;
     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      System.out.println("mal era el leon 1");
      blockt[1] = true;

     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      System.out.println("mal era el leon 2");
      blockt[2] = true;
     }
     break;
    case 'B':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      System.out.println("mal era el oso 1");
      blockt[0] = true;

     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      correct = true;


     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      System.out.println("mal era el oso 2");
      blockt[2] = true;


     }
     break;
    case 'P':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      System.out.println("mal era el oso polar 1");
      blockt[0] = true;

     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      correct = true;

     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      System.out.println("mal era el oso polar 2");
      blockt[2] = true;

     }
     break;
    case 'T':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      System.out.println("mal era el tigre 1");
      blockt[0] = true;

     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      System.out.println("mal era el tigre 2");
      blockt[1] = true;

     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      correct = true;


     }
     break;
    case'Z':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      System.out.println("mal era la zebra 1");
      blockt[0] = true;

     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      System.out.println("mal era la zebra 2");
      blockt[1] = true;

     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      correct = true;


     }
     break;
    case 'R':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      System.out.println("mal era el rino 1");
      blockt[0] = true;

     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      System.out.println("mal era el rino 2");
      blockt[1] = true;

     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      correct = true;

     }
     break;
   }
  }
  public void start(){}
  public void load(){}
  public void playerOne(){context.setState(context.getPlayerOne());}
  public void playerTwo(){}
  public void win(int winner){context.setState(context.getGameStateWin(winner));}
  public void over(){}
  public void setContext(GameContext context){ this.context = context;}


  public void update() {
    if (correct == true) {
     HUD.getHud().setTimes(1, j, HUD.getHud().getTime());
     if (round == 3) {
      //falta ver quién ganó con los timings. y mandar el ganador.
      win(2);
     }else {
     round++;
     flag = true;
     correct = false;
     j++;
     img.clear();
     for (int i = 0; i < 3; i++) {
      blockt[i] = false;
     }
       playerOne();

     }
    }
   }
 }





