
import javax.swing.JOptionPane;
public class Main {
   public static void main(String[] args) {
    //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
    //JOptionPane.showMessageDialog(null, "Here is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
    //JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
    //JOptionPane.showMessageDialog(null, "your computr is under attack!!!", "title", JOptionPane.WARNING_MESSAGE);
    //JOptionPane.showMessageDialog(null, "ERROR!!!!", "title", JOptionPane.ERROR_MESSAGE);
    
    //int answer = JOptionPane.showConfirmDialog(null, "Do you even code", "Title",JOptionPane.YES_NO_CANCEL_OPTION);
  
    //String name =  JOptionPane.showInputDialog("What is your name?: ");
    //System.err.println("hello,"+name);

    String[] responses ={":)","(:","cancel"};
    JOptionPane.showOptionDialog(
        null, 
        "you are awasome!",
        "secret message",
        JOptionPane.YES_NO_CANCEL_OPTION ,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        responses,
        0);

   } 
}
