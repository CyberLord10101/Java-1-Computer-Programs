import javax.swing.*;
import java.awt.*;

public class DrawingJava extends JPanel {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        DrawingJava d = new DrawingJava();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.add(d);
        f.setTitle("THis");
        f.setSize(300,300);
        f.setVisible(true);
    }
    public DrawingJava(){

    }

    @Override
    public void paintComponent(Graphics g){
        g.drawArc(100, 100, 100, 100, 180, 180);
        g.fillRoundRect(50, 50, 40, 50, 5, 7);

    }

}
