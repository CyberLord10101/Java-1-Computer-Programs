/*Cole Proffitt
Due: 3/28/17
TestBox.java
Description: Sets new vaules to for the height,width,length, and color by the 
use of the default constructor for box1 and a quaduple argument one for box2. 
The program then takes these new values and prints them in a order fashion.
*/
package testbox;
public class TestBox {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setWidth(2.0);
        box1.setHeight(4.0);
        box1.setLength(6.0);
        box1.setColor("red");
  
        
        Box box2 = new Box(3,5,"yellow",7);
       
      
        System.out.println(box1);
        System.out.println(box2);
    }
}
/*Program Output
Dimensions = 2.0,4.0,6.0,||Color = red||Area = 88.0
Dimensions = 3.0,5.0,7.0,||Color = yellow||Area = 142.0
*/

