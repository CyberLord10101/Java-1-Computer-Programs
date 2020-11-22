/*Cole Proffitt
Due:3/28/2017
Rectangle.java
Desription: Is the main place from which the rest of
the program is orginated from having 
the set and get methods for width,height, and color.As well as using the 
toString method to cross the Box and Rectangle classes into one.
*/

public class Rectangle {
    private double width;
    private double height;
    private String color;
  
    public Rectangle(){
        color = "white";
        width = 1.0;
        height = 1.0;
    }
    public Rectangle(double w, double h, String color){
        width = w;
        height = h;
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double newWidth){
        width = newWidth;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    
    @Override
    public String toString(){
        String connect1 = ""; 
        return connect1;
    }
}