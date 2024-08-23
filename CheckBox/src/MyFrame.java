import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;


public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

       // xIcon = new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-08-19 093535.png");
        //checkIcon = new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-08-19 093617.png");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,20));
       // checkBox.setIcon(xIcon);
        //checkBox.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
    }

}
