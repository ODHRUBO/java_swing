import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class MyFrame extends JFrame implements KeyListener {
    
    JLabel label;
    ImageIcon icon;
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.addKeyListener(this);
        this.setLayout(null);

        icon = new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\WhatsApp Image 2024-08-20 at 14.31.58_3e410dcc.jpg");

        
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.green);
        label.setIcon(icon);
        label.setOpaque(true);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
        

    }
    @Override
    public void keyTyped(KeyEvent e){
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-15,label.getY());
                break;
            case 'w': label.setLocation(label.getX(),label.getY()-15);
                break;
            case 's': label.setLocation(label.getX(),label.getY()+15);
                break;
            case 'd': label.setLocation(label.getX()+15,label.getY());
                break;
        
        }

    }

    @Override
    public void keyPressed(KeyEvent e){
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-15,label.getY());
                break;
            case 38: label.setLocation(label.getX(),label.getY()-15);
                break;
            case 39: label.setLocation(label.getX()+15,label.getY());
                break;
            case 40: label.setLocation(label.getX(),label.getY()+15);
                break; 
        }
    }

    @Override
    public void keyReleased (KeyEvent e){
        System.out.println("you released key char: " + e.getKeyChar());
        System.out.println("you released key code: " + e.getKeyCode());
    }


}
