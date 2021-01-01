package invaders;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;


public class Bullet extends Polygon {
   
    private Point location;
    private int t = 2;
    boolean fired = false;
    public enum Direction{UP};
    
    //Creates the bullet
    public Bullet(int x, int y){
        location = new Point(x,y);
        
        npoints = 4;
        xpoints = new int[npoints];
        ypoints = new int[npoints];
        
        xpoints[0] = x;
        xpoints[1] = x + t;
        xpoints[2] = x + t;
        xpoints[3] = x;
        
        ypoints[0] = y;
        ypoints[1] = y;
        ypoints[2] = y + 8*t;
        ypoints[3] = y + 8*t;
        
    }
    //Propulsion of the bullet
    @Override
    public void translate(int x, int y){
        super.translate(x, y);
        location.y += y;
    }   
    //Keeps getFired true while in flight
    public void setFired(boolean answer){
        fired = answer;
    }
    //Checks if the bullet was fired or not so no spammming happens
    public boolean getFired(){
        return fired;
    }
    //X point of object in question
    public int getX(){
        return xpoints[0];
    }
    //Y point of bullet 
    public int getY(){
        return ypoints[0];
    }
    //Width of the bullet 
    public int getWidth(){
        return 2*t;
    }
}
