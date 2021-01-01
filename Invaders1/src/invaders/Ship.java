package invaders;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;


public class Ship extends Polygon{
    private int u = 5;
    private Point location;
    private boolean alive;
    private Color shipColor;
    public enum Direction{LEFT, RIGHT};
    
    //Creates the ship with a bright color
    public Ship(int x, int y){
        shipColor = new Color(0,255,0);
        alive = true;
        location = new Point(x,y);
        
        npoints = 16;
        xpoints = new int[npoints];
        ypoints = new int[npoints];
        xpoints[0] = x;
        xpoints[1] = x + u;
        xpoints[2] = x + u;
        xpoints[3] = x + 5*u;
        xpoints[4] = x + 5*u;
        xpoints[5] = x + 6*u;
        xpoints[6] = x + 6*u;
        xpoints[7] = x + 7*u;
        xpoints[8] = x + 7*u;
        xpoints[9] = x + 8*u;
        xpoints[10] = x + 8*u;
        xpoints[11] = x + 12*u;
        xpoints[12] = x + 12*u;
        xpoints[13] = x + 13*u;
        xpoints[14] = x + 13*u;
        xpoints[15] = x;
        
        ypoints[0] = y + 4*u;
        ypoints[1] = y + 4*u;
        ypoints[2] = y + 3*u;
        ypoints[3] = y + 3*u;
        ypoints[4] = y + u;
        ypoints[5] = y + u;
        ypoints[6] = y;
        ypoints[7] = y;
        ypoints[8] = y + u;
        ypoints[9] = y + u;
        ypoints[10] = y + 3*u;
        ypoints[11] = y + 3*u;
        ypoints[12] = y + 4*u;
        ypoints[13] = y + 4*u;
        ypoints[14] = y + 8*u;
        ypoints[15] = y + 8*u;
        
    }
    //Sets a color for the ship
    public Color getColor(){
        return shipColor;
    }
    //Methods to move and tell whare the ships location is.
    @Override 
    public void translate(int x, int y){
        super.translate(x,y);
        location.x +=x;
        location.y +=y;
    }
    public int getY(){
        return ypoints[6];
    }
    public int getX(){
        return xpoints[0];
    }
    public int getWidth(){
        return 13*u;
    }
    
}
