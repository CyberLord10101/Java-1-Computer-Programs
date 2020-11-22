/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Imaginary extends Complex {
    
    public Imaginary(){
        this(0);
    }
    public Imaginary(double value){
        super(0, value);
    }
   
    @Override
    public String toString(){
        return getImaginary() + "i";
    }
}
