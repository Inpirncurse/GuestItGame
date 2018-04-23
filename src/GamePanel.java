import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GamePanel extends JPanel implements Runnable {

    private static final int PWIDTH = 1000;
    private static final int PHEIGHT = 800;
    private Thread animator;
    private volatile boolean over = false;
    private GameContext game;

    public GamePanel(){
        setBackground(Color.white);
        setPreferredSize(new Dimension(PWIDTH,PHEIGHT));
        setFocusable(true);
        requestFocus();
        game = new GameContext();
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                game.clickMouse(e);
            }
        });
    }
    public void addNotify(){
        super.addNotify();
        startGame();
    }
    private void startGame(){
        if(animator == null ){
            animator = new Thread(this);
            animator.start();
        }
    }
    public void run(){
        while(over == false){
            gameUpdate();
            gameRender();
            paintScreen();
            try{
                Thread.sleep(15);
            }
            catch(InterruptedException e){}
        }
        System.exit(0);
    }
    private void gameUpdate(){game.update();}

    private Graphics dbg;
    private Image dbImage = null;

    private void gameRender(){
        if(dbImage == null){
            dbImage = createImage(PWIDTH,PHEIGHT);
            if(dbImage == null){
                System.out.println("Error in the gameRender");
                return;
            }else{
                dbg = dbImage.getGraphics();
            }
        }
        dbg.setColor(Color.white);
        dbg.fillRect(0,0,PWIDTH,PHEIGHT);
        dbg.setColor(Color.black);
        game.draw(dbg);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(dbImage != null)
            g.drawImage(dbImage, 0, 0, null);
    }

    private void paintScreen(){
        Graphics g;
        try{
            g = this.getGraphics();
            if((g != null) && (dbImage != null))
                g.drawImage(dbImage,0,0,null);
            Toolkit.getDefaultToolkit().sync();
            g.dispose();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void main(String args[]){
        Time clock = new Time();
        clock.startTime();
        JFrame panel = new JFrame("Guess the Animal!!");
        panel.setContentPane(new GamePanel());
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
        panel.setLayout(new BorderLayout());
        panel.setResizable(true);
        panel.pack();
        panel.setLocationRelativeTo(null);
    }
}
