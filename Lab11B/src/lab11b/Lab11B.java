package lab11b;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab11B extends JFrame implements ActionListener {

RectanglePanel rectPanel = new RectanglePanel();
OvalPanel ovalPanel = new OvalPanel();
CirclePanel circlePanel = new CirclePanel();

JPanel shapePanel = rectPanel;

private JButton jbtRect = new JButton("Rect");
private JButton jbtOval = new JButton("Oval");
private JButton jbtCircle = new JButton("Circle");

public Lab11B(){
    getContentPane().add(shapePanel, BorderLayout.CENTER);
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(1,3));
    
    p.add(jbtRect);
    p.add(jbtOval);
    p.add(jbtCircle);
    
    jbtRect.addActionListener(this);
    jbtOval.addActionListener(this);
    jbtCircle.addActionListener(this);
    
    getContentPane().add(p, BorderLayout.SOUTH);
    
}


    public static void main(String[] args) {
        Lab11B frame = new Lab11B();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setTitle("Shapes Lab11B by Cole Proffitt");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getContentPane().remove(shapePanel);
        if(e.getSource() == jbtRect)
            shapePanel = rectPanel;
        else if(e.getSource() == jbtOval)
            shapePanel = ovalPanel;
        else if(e.getSource() == jbtCircle)
            shapePanel = circlePanel;
        
        getContentPane().add(shapePanel);
        getContentPane().repaint();
        getContentPane().validate();
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