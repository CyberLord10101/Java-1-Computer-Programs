import javax.swing.*;
import java.awt.*;

public class Lab10B extends JFrame{
    
    public static void main(String[] args) {
       JFrame frame = new Lab10B();
       frame.setTitle("Lab10B Cole Proffitt");
       frame.pack();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setLayout(new GridLayout(2,1));
       frame.setVisible(true);
    }
    public Lab10B(){
           NewPanel p1 = new NewPanel(1);
           NewPanel p2 = new NewPanel(4);
           getContentPane().add(p1);
           getContentPane().add(p2);
    }
}
