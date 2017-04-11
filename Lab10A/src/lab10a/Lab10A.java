/*Cole Proffitt
Due: 3/30/17
Lab10A.java
Description: Tells which are animals and which are fruits and how to eat them 
or the more eatable one at least.
*/
package lab10a;

public class Lab10A {
    public static void main(String[] args){
        
        Elephant elephant = new Elephant();
        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();
        Apple apple = new Apple();
        Orange orange = new Orange();
        
        showObject(elephant);
        showObject(tiger);
        showObject(chicken);
        showObject(apple);
        showObject(orange);
    }
    
    public static void showObject(Object object) {
        System.out.println(object);
        if(object instanceof Eatable){
            ((Eatable)object).howToEat();
        }
    }
}
interface Eatable{
    public void howToEat();
}
class Animal{
    public String toString(){
        return "Animal";
    }
}
class Elephant extends Animal{
    
}
class Tiger extends Animal{
    public String toString(){
        return "Tiger";
    }
}
class Chicken extends Animal implements Eatable{
    public void howToEat(){
        System.out.println("Eat the legs only dark meat is better.");
    }
    public String toString(){
        return "Chicken";
    }
}
class Fruit implements Eatable{
    public void howToEat(){
        System.out.println("Wash and eat with your fingers.");
    }
    public String toString(){
        return "Fruit";
    }
}
class Apple extends Fruit{
    
}
class Orange extends Fruit implements Eatable{
    public void howToEat(){
        System.out.println("Peel and eat! After you wash it of course.");
    }
    public String toString(){
        return "Orange";
    }
}
/*Program Output
Animal
Tiger
Chicken
Eat the legs only dark meat is better.
Fruit
Wash and eat with your fingers.
Orange
Peel and eat! After you wash it of course.
*/