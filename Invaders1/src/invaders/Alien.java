package invaders;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;


public class Alien extends Polygon{
    private int deltaX, size, value;
    private Color skin;
    private Point position;
    private boolean alive;
    
    //Basis starting position for the aliens 
    public Alien(){
        this(100,100,100);
    }
    //All the aliens need to exist a world to live in
    public Alien(int x, int y, int size){
        deltaX = 5;
        value = 0;
        this.size = size;
        //skin = Color.WHITE;
        position = new Point(x,y);
        alive = true;
        
    }
    //Translation and position of the aliens something to call to
    @Override 
    public void translate(int x, int y){
        super.translate(x, y);
        position.x += x;
        position.y += y;
    }
    
    public int getX(){
        return position.x;
    }
    public int getY(){
        return position.y;
    }
    
    public boolean isAlive(){
        return alive;
    }
    public void setAlive(boolean answer){
        this.alive = answer;
    }
    public void setColor(Color skin){
        this.skin = skin;
        
    }
    public Color getColor(){
        return skin;
    }
    
}
