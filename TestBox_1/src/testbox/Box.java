/*Cole Proffitt
Due: 3/28/17
Box.java
Description: This add the length accessor and mutator
to the Rectangle class to
then find the surface area of the box using the findAreaL method.
Once that is 
established the string to print out you box objects is put in the toString 
method as a return value.
*/
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
