
package testbox;
public class Box extends Rectangle {
    private double length;
    
    public Box(){
        length = 1.0;
    }
    public Box(double w,double h, String c, double length){
        super(w,h,c);
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double newLength){
        length = newLength;
    }
    public double findAreaL(){
       return (2*(getWidth()*getHeight()+getWidth()
               *length+getHeight()*length));
    }
    
    public String toString(){
        return ("Dimensions = " +getWidth() + "," + getHeight() + "," + 
        getLength() + "," + "||Color = " + getColor()
        + "||Area = " + findAreaL());
    }          
}
