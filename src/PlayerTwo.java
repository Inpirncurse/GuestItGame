import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.awt.event.MouseEvent;
import java.util.List;

 public class PlayerTwo implements GameState {

  private GetImage image = new GetImage();
  private Random randomGenerator = new Random();
  private int letter;
  private char letterr;
  private boolean correct = false;
  private int round = 1;
  private int iterator_HUD = 0;
  private int playerNumber = 1;
  GameContext context;
  List<BufferedImage> img = new ArrayList<BufferedImage>();
  private boolean flag = true;
  private boolean[] blockt = {false, false, false};

  public PlayerTwo(){ }

  public void draw(Graphics g){
  g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);

  if(flag == true) {
     HUD.getHud().setTimeValue(0);
     letter = randomGenerator.nextInt(6);
     flag = false;
   }
   HUD.getHud().hud(g, round);
   g.setFont(new Font("Arial", Font.BOLD, 40));
   g.drawString("Player Two...¿Which Animal starts with " + image.getLetter(letter) + "?", 100, 40);

   letterr = image.getLetter(letter);
   img = image.getImages(letterr);

   int x_m = 0, y_m = 250;
   HUD.getHud().setTurns(1);
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
  public void clickMouse(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();

   switch(letterr){
    case 'L':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      correct = true;
     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      blockt[1] = true;
     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      blockt[2] = true;
     }
     break;
    case 'B':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      blockt[0] = true;
     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      correct = true;
     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      blockt[2] = true;
     }
     break;
    case 'P':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      blockt[0] = true;
     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      correct = true;
     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      blockt[2] = true;
     }
     break;
    case 'T':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      blockt[0] = true;
     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      blockt[1] = true;
     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      correct = true;
     }
     break;
    case'Z':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      blockt[0] = true;
     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
      blockt[1] = true;
     }else if(x >= 702 && x < 993 && y >= 251 && y < 501 && blockt[2] == false){
      correct = true;
     }
     break;
    case 'R':
     if(x >= 1 && x < 298 && y >= 251 && y < 501 && blockt[0] == false){
      blockt[0] = true;
     }else if(x >= 350 && x < 647 && y >= 251 && y < 501 && blockt[1] == false){
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
     HUD.getHud().setTimes(playerNumber, iterator_HUD, HUD.getHud().getTime());
     if (round == 3) {
      int p1 = 0;
      int p2 = 0;
      p1 = HUD.getHud().getP1();
      p2 = HUD.getHud().getP2();
       if(p1 < p2){
        win(1);
       }else{
        win(2);
       }
     }else {
     round++;
     flag = true;
     correct = false;
     iterator_HUD++;
     img.clear();
     for (int i = 0; i < 3; i++) {
      blockt[i] = false;
     }
       playerOne();
     }
    }
   }
 }





