import java.awt.*;
import java.awt.image.BufferedImage;

public class HUD {

    public static HUD hud;
    public int time = 0;
    private int p1, p2;
    private int[][] times = new int[2][3];
    private int turns = 0;

    public static HUD getHud(){
        if(hud == null){
            hud = new HUD();
        }
        return hud;
    }

    public void setTime(){
        time++;
    }

    public void setTimeValue(int time){
        this.time = time;
    }

    public int getTime(){
        return time;
    }

    public int getP1(){
        p1 = times[0][0] + times[0][1] + times[0][2];
        return p1;
    }

    public int getP2(){
        p2 = times[1][0] + times[1][1] + times[1][2];
        return p2;
    }

    public int setTimes(int player, int turn, int timeRound){
        return times[player][turn] = timeRound;
    }

    public void setTurns(int turn){
        this.turns = turn;
    }

    public void hud(Graphics g, int round){
        g.drawString("Time: "+ time, 50, 200);
        g.drawString("Round: "+ round, 250, 200);
        g.drawString("Times: ", 75, 425);
        g.drawString("Round 1: ", 125, 625);
        g.drawString("" + times[turns][0], 155,660);
        g.drawString("Round 2: ", 425, 625);
        g.drawString("" + times[turns][1], 455,660);
        g.drawString("Round 3: ", 725, 625);
        g.drawString("" + times[turns][2], 755,660);
    }
}
