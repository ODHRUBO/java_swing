import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    
        JMenuBar menuBar ;
        JMenu fileMenu ;
        JMenu editMenu ;
        JMenu helpMenu;

        JMenuItem laodItem ;
        JMenuItem saveItem ;
        JMenuItem exitItem ;
    
    MyFrame(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,450);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        laodItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        laodItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);


        fileMenu.setMnemonic(KeyEvent.VK_F);//Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E);//Alt + e for file
        helpMenu.setMnemonic(KeyEvent.VK_H);//Alt + h for file
        laodItem.setMnemonic(KeyEvent.VK_L);//l for load
        saveItem.setMnemonic(KeyEvent.VK_S);//s for save
        exitItem.setMnemonic(KeyEvent.VK_E);//e for exit

        fileMenu.add(laodItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == laodItem){
            System.out.println("You load a file");
        }

        if (e.getSource() == saveItem){
            System.out.println("You save a file");
        }

        if (e.getSource() == exitItem){
            System.exit(0);
        }
    }

}
