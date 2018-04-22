import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Time implements Runnable, ActionListener {

    private Timer time;
    private Thread clock;
    int i = 0;

    public Time(){
        time = new Timer(500, this);
    }

    public void actionPerformed(ActionEvent e){
        HUD.getHud().setTime();
//        i++;
//        System.out.println(i);
    }

    public void addNotify(){
        super.notify();
        startTime();
    }

    public void run(){}

    public void startTime(){
        time.start();
    }

    public void startClock(){
        if(clock == null){
            clock = new Thread(this);
            clock.start();
        }
    }

}
