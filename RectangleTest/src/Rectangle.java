/*Cole Proffitt
Due: 3/21/17
Rectangle.java
Brief Description: Makes two private doubles
then make a default constructor that
sets the height and width for the first rectangle.
Then is makes a 2-args constructor 
with values being placed into the width and height.
The get and set methods help cycle the values 
put into the system by the TestRectangle.java file.
Then the last lines of th code find the area of the rectangle given.
*/
public class Rectangle {
    private double width;
    private double height;
    private static String color;
    
    public Rectangle(){
        color = "white";
        width = 1.0;
        height = 1.0;
    }
    public Rectangle(double w, double h, String c){
    width = w;
    height = h;
    color = c;
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
    public double findArea(){
        return (width * height);
    }
}