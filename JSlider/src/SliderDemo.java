import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;


public class SliderDemo implements ChangeListener{
   
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label2;
    JSlider slider;

    SliderDemo(){
        frame = new JFrame("slider demo");
        panel = new JPanel();
        label = new JLabel();
       
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));
        
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.ITALIC,15));
        label.setFont(new Font("MV Boli",Font.ITALIC,25));

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("*C = "+ slider.getValue());
        
        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(label);
        
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e){
        label.setText("*C = "+ slider.getValue());  
    }
}
