public class Complex extends Number{
    
    private double real, imaginary;
    
    //Constructors
    public Complex(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public Complex(){
        this(0,0);
    }
    
    //Mutators
    public void setReal(double real){
        this.real = real;
    }
    
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }
    
    //Acessors 
    public double getReal(){
        return  this.real;
    }
    public double getImaginary(){        
        return this.imaginary;
    }
    
    //Functionality
    public Complex add(Complex c){
        //double a = this.real + c.real;
        //double b  = this.imaginary +c.imaginary;
        //return new Complex(a, b);
        return new Complex(real + c.real, imaginary + c.imaginary);
    }
    
    public Complex subtract(Complex c){
        
        return new Complex(real - c.real, imaginary - c.imaginary);
    }
    
    public Complex multipy(Complex c){
        
        return new Complex(real*c.real-imaginary*c.imaginary,
                real*c.imaginary + imaginary*c.real);
    }
    
    public Complex divide(Complex c){
        double den = c.real*c.real+ c.imaginary*c.imaginary;
        return new Complex((real*c.real-imaginary*c.imaginary)/den,
                (-real*c.imaginary + imaginary*c.real)/den);
    }
    
    public Complex conjugate(){
        
        return new Complex(real, -imaginary);
    }
    
    public double abs(){
        
        return Math.sqrt(real*real + imaginary*imaginary);
    }
    /**
     * Determines the angle between the current complex number
     * and the passed complex number, in radians 
     * @param c Second Complex number in complex plane 
     * @return Angle between in radians
     */
    public double angleBetween(Complex c){
        
        return getTheta() - c.getTheta();
    }
    
    public double getTheta(){
        return Math.atan(imaginary/real);
    }
    
    @Override
    public String toString(){
        return real + " + " + imaginary + " i ";
    }
    
    @Override 
    public boolean equals(Object o){
        return real == ((Complex)o).real && 
                imaginary == ((Complex)o).imaginary;
    }

    @Override
    public int intValue() {
        return (int)real;
    }

    @Override
    public long longValue() {
       return (long)real;
    }

    @Override
    public float floatValue() {
        return (float)real;
    }

    @Override
    public double doubleValue() {
        return real;
    }

  
}
