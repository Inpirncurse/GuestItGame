import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class GameContext {
    GameState start;
    GameState load;
    GameState playerOne;
    GameState playerTwo;
    GameState winOne;
    GameState winTwo;
    GameState over;
    GameState currentState;

    public GameContext() {
        start = Factory.getInstance().newState("start");
        load = Factory.getInstance().newState("load");
        playerOne = Factory.getInstance().newState("playerOne");
        playerTwo = Factory.getInstance().newState("playerTwo");
        over = Factory.getInstance().newState("over");
        winOne = Factory.getInstance().newState("winOne");
        winTwo = Factory.getInstance().newState("winTwo");

        start.setContext(this);
        load.setContext(this);
        playerOne.setContext(this);
        playerTwo.setContext(this);
        over.setContext(this);
        winOne.setContext(this);
        winTwo.setContext(this);
        currentState = start;
    }
    public GameState getGameLoadState(){return load;}
    public GameState getPlayerOne(){return playerOne;}
    public GameState getPlayerTwo(){return playerTwo;}
    public GameState getGameStateOver(){return over;}
    public void update(){ currentState.update();}
    public GameState getGameStateWin(int winner){
        if(winner==1){
            return winOne;
        }else{
            return winTwo;
        }
    }
    public void setState(GameState state){this.currentState = state;}
    public void clickMouse(MouseEvent e) {currentState.clickMouse(e);}
    public void draw(Graphics g){currentState.draw(g);}
    public void start(){currentState.start();}


}
