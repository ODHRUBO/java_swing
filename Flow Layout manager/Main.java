import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class Main {
   public static void main(String[] args) {
    JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,500);
       frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
       
       JPanel panel = new JPanel();
       panel.setBackground(Color.lightGray);
       panel.setLayout(new FlowLayout());
       panel.setPreferredSize(new Dimension(200,200));
       panel.setLayout(new FlowLayout());

 
       panel.add(new JButton("1"));
       panel.add(new JButton("2"));
       panel.add(new JButton("3"));
       panel.add(new JButton("4"));
       panel.add(new JButton("5"));
       panel.add(new JButton("6"));
       panel.add(new JButton("7"));

       frame.add(panel);
       frame.setVisible(true);
       

   } 
}
