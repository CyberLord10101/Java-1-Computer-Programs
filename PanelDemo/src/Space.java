/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author student
 */
public class Space extends JPanel{
    private ImageIcon jellyfish;
    private Point rectLoc;
    private Random rand;
    private double rotationAngle;
    
    public Space(){
        super();
        setBackground(Color.BLACK);
        jellyfish = new ImageIcon("Jellyfish.jpg");
        rectLoc = new Point(50,50);
        rand = new Random();
        rotationAngle = 0.0;
    }
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        
        //Fun with g2 methods
        g2.setColor(Color.YELLOW.brighter());
        g2.drawRect(rand.nextInt(100) + 50, rand.nextInt(100) + 50, 80, 40);
        g2.drawOval(rand.nextInt(100) + 150, rand.nextInt(100) + 250, 100, 100);
        g2.setColor(Color.CYAN);
        g2.fillOval(rand.nextInt(100) + 450, 500, 100, 40);
        
        //Drawing the bordered rectangle 
        g2.fillRect(rectLoc.x, rectLoc.y, 200, 40);
        g2.setColor(Color.MAGENTA);
        g2.drawRect((int)rectLoc.getX(), (int)rectLoc.getY(), 200, 40);
        
        
        
        //Draw octagon
        g2.setColor(Color.RED);
        int[] xValue = {100,120,134,134,120,100,86,86};
        int[] yValue = {80,80,94,114,128,128,114,94};
        g2.rotate(rotationAngle, 110, 104);
        g2.fillPolygon(xValue, yValue,8);
        g2.setColor(Color.WHITE);
        g2.drawPolygon(xValue,yValue,8);
        g2.drawString("STOP", 95, 110);
        g2.rotate(-rotationAngle, 110, 104);
        
        g2.drawImage(jellyfish.getImage(), rand.nextInt(100) + 350,
                rand.nextInt(100) + 250, null);
        
        //Update new rectangle position & angle rotation
        rectLoc.x += 10;
        rectLoc.y += 15;
        rotationAngle += .1;
    }
}
