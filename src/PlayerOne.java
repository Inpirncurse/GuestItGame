import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.awt.event.MouseEvent;
import java.util.List;


public class PlayerOne implements GameState {

    private GetImage image = new GetImage();
    private Random randomGenerator = new Random();
    private int letter;
    private char letterr;
    private boolean correct = false;
    private boolean[] blockt = {false, false, false};
    private int round = 1;
    int j = 0;
    GameContext context;
    List<BufferedImage> img = new ArrayList<BufferedImage>();
    private boolean flag = true;

    public void draw(Graphics g){
        HUD.getHud().setTurns(0);
        g.drawImage(ImageLoader.getImageLoader().getBackground(),0,0,null);
        HUD.getHud().hud(g, round);

        if(flag == true) {
            letter = randomGenerator.nextInt(6);
            HUD.getHud().setTimeValue(0);
            flag = false;
        }
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Player One... ¿Which Animal starts with " + image.getLetter(letter) + "?", 100, 40);

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
    public void start(){}
    public void load(){}
    public void playerOne(){}
    public void playerTwo(){ context.setState(context.getPlayerTwo());}
    public void win(int winner){context.setState(context.getGameStateWin(winner));}
    public void over(){}
    public void setContext(GameContext context){ this.context = context;}
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
    public void update(){
        if(correct == true) {
            int iter = 0;
            iter++;
            round ++;
            flag = true;
            correct = false;
            HUD.getHud().setTimes(0,j,HUD.getHud().getTime());
            j++;
            img.clear();
            for (int i = 0; i < 3; i++){
                blockt[i] = false;
            }
                playerTwo();
        }
    }
}

