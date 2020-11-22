/*Cole Proffitt
Due: 3/21/2017
TestRectangle.java
Takes default dimensions of width and height 
from a separate class and displays the result
on one line then later producing that default number multipied by three.
The second rectangle's width 
and height are arbitrary values that are displayed with the first rectangle,
then printed out with the second 
instance rectangle one appears after being multipled by three.
Also, displays a new color in place of the default constuctor.
*/



public class TestRectangle {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
         System.out.println("Rectangle one: width = " + r1.getWidth() +
        " height = "  + r1.getHeight() + " color = " + r1.getColor());
        Rectangle r2 = new Rectangle(4.0,5.0,"yellow");
        
            
        
        
        System.out.println("Rectangle one: width = " + r1.getWidth() +
        " height = "  + r1.getHeight() + " color = " + r1.getColor());
       
        System.out.println("Rectangle two: width = " + r2.getWidth() +
        " height = " + r2.getHeight() + " color = " + r2.getColor());
        
        r1.setColor("red");
      
        System.out.println("Rectangle one: width = " + r1.getWidth() +
        " height = " + r1.getHeight() + " color = " + r1.getColor() );
        System.out.println("Rectangle two: width = " + r2.getWidth() +
        " height = " + r2.getHeight() + " color = " + r2.getColor() );
    }  
}        
/*Program Output:
Rectangle one: width = 1.0 height = 1.0 color = white
Rectangle one: width = 1.0 height = 1.0 color = yellow
Rectangle two: width = 4.0 height = 5.0 color = yellow
Rectangle one: width = 1.0 height = 1.0 color = red
Rectangle two: width = 4.0 height = 5.0 color = red
*/    