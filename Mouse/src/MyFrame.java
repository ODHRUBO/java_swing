import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class MyFrame extends JFrame  implements MouseListener{


    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);
        //this.addMouseListener(this);//work intire frame

        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("You clicked the mouse");
        label.setBackground(Color.yellow);

    }

    @Override
    public void mousePressed(MouseEvent e){
        System.out.println("You pressed the mouse");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseReleased(MouseEvent e){
        System.out.println("You relesed the mouse cursor");
       label.setBackground(Color.blue);
    }


    @Override
    public void mouseEntered(MouseEvent e){
        System.out.println("You entered the component");
        label.setBackground(Color.cyan);
    }

    @Override
    public void mouseExited(MouseEvent e){
        System.out.println("You exceded the component");
        label.setBackground(Color.magenta);
    }
    
}
