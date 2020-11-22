
/*Cole Proffitt
Due: 4/6/2017
Shapes.java Lab11A
Fills two ovals with one that looks like a circle colored
in blue and the oval in green. Red outlines rectangle.
*/

import javax.swing.*;
import java.awt.*;

public class Shapes extends JFrame {


RectanglePanel rectanglePanel = new RectanglePanel();
OvalPanel ovalPanel = new OvalPanel();
CirclePanel circlePanel = new CirclePanel();

public Shapes(){
    Container container = getContentPane();
    container.setLayout(new GridLayout());
    JPanel p1 = new JPanel();
    
    p1.setLayout(new GridLayout(1,3));
    container.add(ovalPanel);
    container.add(rectanglePanel);
    container.add(circlePanel);
}


    public static void main(String[] args) {
        Shapes frame = new Shapes();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,300);
        frame.setTitle("Shapes Lab11A");
        frame.setVisible(true);
    }
   
}
class RectanglePanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawRect(getWidth()/10,getHeight()/10,4 *
                getWidth()/5,4 * getHeight()/5);
    }
}
class OvalPanel extends JPanel {
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.green);
    
    g.fillOval(getWidth()/10,getHeight()/10,4 * getWidth()/5,
            4 * getHeight()/5);
    }
}
class CirclePanel extends JPanel {
    public void paintComponent(Graphics g){
    super.paintComponent(g);
    int diameter;
    if(getWidth() > getHeight()){
        diameter = 4 * getHeight()/5;
    }
    else 
        diameter = 4 * getWidth()/5;
    g.setColor(Color.blue);
    g.fillOval((getWidth() - diameter)/2,(getHeight() - diameter)/2,
            diameter, diameter);
    }
}
