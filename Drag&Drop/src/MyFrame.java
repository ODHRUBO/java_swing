import javax.swing.*;
public class MyFrame extends JFrame {
    
    DragPanel dragPanel = new DragPanel();
    MyFrame(){

        
        this.setTitle("Drag and drop demo");
        this.setSize(500,500);
        this.add(dragPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
