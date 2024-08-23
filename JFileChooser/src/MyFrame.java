import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener {
    
    JButton button ;
    
    MyFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("select file");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button){
           JFileChooser fileChooser = new JFileChooser();
           //fileChooser.setCurrentDirectory(new File("."));//select current file
           fileChooser.setCurrentDirectory(new File("C:\\Users\\HP\\OneDrive\\Desktop"));//select current file
           
           //int response = fileChooser.showSaveDialog(null);//select file to save
           int response = fileChooser.showOpenDialog(null);//select file to open
           
           if (response == JFileChooser.APPROVE_OPTION){
                File file = new File (fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
           }
        }
    }
}
