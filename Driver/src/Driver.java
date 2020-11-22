import java.util.Random;


public class Driver {
    
    public static final int SIZE = 20;
    public static void main(String[] args){
        Random rand = new Random();
        Complex c1 = new Complex(), c2 = new Complex(3,4);
        System.out.println("" + c1 + "\n" + c2);
        c1.setReal(-2);
        c1.setImaginary(4.2);
        System.out.println(c1);
        System.out.println("Real part = " + c1.getReal() +
                " Imag part = " + c1.getImaginary());
        System.out.println(c2.add(c1));
        System.out.println(c2.subtract(c1));
        System.out.println(c1.multipy(c2));
        System.out.println(c1.divide(c2));
        System.out.println(c2.multipy(c2).add(c2).subtract(c1));
        
        //Array of Complex values
        Complex[] value = new Complex[SIZE];
        for(int i = 0; i < value.length; i++ )
            value[i] = new Complex(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
        
        //Print the conjugates 
        for(Complex c : value)
            System.out.println(c.conjugate());
        
        System.out.println(c2.abs());
        System.out.println(c2.getTheta());
        System.out.println(c2.angleBetween(c1));
        System.out.println(c2.angleBetween(c2));
        
        
        //Change c1 = c2 and test.
        c1.setImaginary(4);
        c1.setReal(3);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        
        System.out.println(c1.intValue());
        
        //Testing the imaginary  class
        Imaginary i1 = new Imaginary(7), i2 = new Imaginary();
        System.out.println(i1);
        System.out.println(i2);
                
    }
    
}
