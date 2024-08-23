//button
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon icon = new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-05-31 075729.png");
        
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(50,50,350,350);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setText("Button");
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button){
           System.out.println("poo"); 
           //button.setEnabled(false);//enable one then disable
           label.setVisible(true);
        }
    }
}
