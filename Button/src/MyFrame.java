import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    JButton button;
    MyFrame(){
        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(e ->System.out.println("poo"));//use lemda expression
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        this.add(button);
    }
}
