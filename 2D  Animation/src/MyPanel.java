import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
    
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image enemy2;
    Image backgroundImage;
    Timer timer;
    Timer timer2;
    int xVelocity = 3;
    int yVelocity = 10;

    int x2Velocity = 10;
    int y2Velocity = 2;

    int x = 0;
    int y = 0;
    int x1 = 150;
    int y1 = 120;


    MyPanel(){

        this.setPreferredSize(new Dimension( PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\ssc & hsc certificate\\download - Copy.jpeg").getImage();
        timer = new Timer(1, this);
        timer.start();

        enemy2 = new ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\ssc & hsc certificate\\download - Copy.jpeg").getImage();
        timer2 = new Timer(10, this);
        timer2.start();
        
       
        backgroundImage = new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-08-15 000922.png").getImage();
        

    }
    public void paint(Graphics g){

        super.paint(g);
        Graphics2D g2D = (Graphics2D)g;

        g2D.drawImage(backgroundImage,0,150,null);
        g2D.drawImage(enemy,x,y,null);
        g2D.drawImage(enemy2,x1,y1,null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
 
        if (x>=PANEL_WIDTH-enemy.getWidth(null) || x<0){
            xVelocity  = xVelocity*(-1);
        }
        x = x + xVelocity;


        if (y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0){
            yVelocity  = yVelocity*(-1);
        }
        y = y + yVelocity;

        repaint();

        if (x1>=PANEL_WIDTH-enemy2.getWidth(null) || x1<0){
            x2Velocity  = x2Velocity*(-1);
        }
        x1 = x1 + x2Velocity;
        

        if (y1>=PANEL_HEIGHT-enemy2.getHeight(null) || y1<0){
            y2Velocity  = y2Velocity*(-1);
        }
        y1 = y1 + y2Velocity;

        repaint();

        
    }
   
}
