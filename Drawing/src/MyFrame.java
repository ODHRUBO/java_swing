import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame(){
        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setLocationRelativeTo(null);//visible the frmae in the middle of the screen
        this.pack();
        this.setVisible(true);
    }
  
}
