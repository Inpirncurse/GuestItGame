import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Time implements Runnable, ActionListener {

    private Timer time;

    public Time(){
        time = new Timer(500, this);
    }

    public void actionPerformed(ActionEvent e){
        HUD.getHud().setTime();
    }

    public void run(){}

    public void startTime(){
        time.start();
    }

}
