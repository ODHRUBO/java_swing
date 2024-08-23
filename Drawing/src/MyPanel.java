import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel {

    Image image;
    MyPanel(){

        image = new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\WhatsApp Image 2024-08-20 at 14.31.58_3e410dcc.jpg").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }
        public void paint(Graphics g){

            Graphics2D g2D = (Graphics2D) g;
            g2D.drawImage(image,0,0,null);
            g2D.setPaint(Color.green);
            g2D.setStroke((new BasicStroke(5)));
            g2D.drawLine(0,0,500,500);
            g2D.drawRect(0,0 , 200, 120);
            g2D.fillRect(0,0 , 200, 120);

            g2D.setPaint(Color.red);
           // g2D.drawOval(50, 50, 100, 100);
            g2D.fillOval(60,10 , 100, 100);
            
            g2D.setPaint(Color.red);
            g2D.drawArc(200, 200,100, 100, 0, 180);
            g2D.fillArc(200, 200,100, 100, 0, 180);

            g2D.setPaint(Color.white);
            g2D.drawArc(200, 200,100, 100, 180, 180);
            g2D.fillArc(200, 200,100, 100, 180, 180);

            int[]xPoints={150,250,350};
            int[]yPoints={300,150,300};
            g2D.setPaint(Color.yellow);
            g2D.drawPolygon(xPoints,yPoints,3);

            g2D.drawString("Love you Bangladesh", 50, 50);

            
        }
    
}
