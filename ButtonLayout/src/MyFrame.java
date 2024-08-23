import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class MyFrame extends JFrame  implements MouseListener{


    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;
    ImageIcon horrible;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\ssc & hsc certificate\\download.jpeg");
        nervous = new ImageIcon("C:\\Users\\HP\\Downloads\\feeling-nervous-or-fear-2235126073.jpg");
        pain = new ImageIcon("C:\\Users\\HP\\Downloads\\pain.jpg");
        dizzy = new ImageIcon("C:\\Users\\HP\\Downloads\\dizzy.jpeg");
        horrible = new ImageIcon("C:\\Users\\HP\\Downloads\\images.jpeg");

        label.setIcon(smile);
        //label.setIcon(nervous);
        
        this.add(label);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        label.setIcon(horrible);

    }

    @Override
    public void mousePressed(MouseEvent e){
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e){
        label.setIcon(horrible);
    }


    @Override
    public void mouseEntered(MouseEvent e){
        label.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e){
        label.setIcon(smile);
    }
    
}