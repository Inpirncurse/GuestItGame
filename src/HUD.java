import java.awt.*;

public class HUD {

    public static HUD hud;
    public int accum_time = 0;
    private int p1, p2;
    private int[][] player_turn = new int[2][3];
    private int turns = 0;

    public static HUD getHud(){
        if(hud == null){
            hud = new HUD();
        }
        return hud;
    }
    public int getTime(){ return accum_time;}
    public void setTime(){ accum_time++; }
    public void setTimeValue(int time){ this.accum_time = time; }
    public void setTurns(int turn){this.turns = turn; }
    public int getP1(){
        p1 = player_turn[0][0] + player_turn[0][1] + player_turn[0][2];
        return p1;
    }
    public int getP2(){
        p2 = player_turn[1][0] + player_turn[1][1] + player_turn[1][2];
        return p2;
    }
    public int setTimes(int player, int turn, int timeRound){
        return player_turn[player][turn] = timeRound;
    }
    public void hud(Graphics g, int round){
        g.drawString("Time: "+ accum_time, 50, 200);
        g.drawString("Round: "+ round, 250, 200);
        g.drawString("Points Round 1:" + " " + player_turn[turns][0], 125, 625);
        g.drawString("Points Round 2:" + " " + player_turn[turns][1], 125, 675);
        g.drawString("Points Round 3:" + " " + player_turn[turns][2], 125, 725);
    }
}
