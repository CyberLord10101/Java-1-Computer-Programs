/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Point;

/**
 *
 * @author student
 */
public class CPoint extends Point implements Comparable<CPoint>{
    
    public CPoint(){
        this(0,0);
    }
    public CPoint(int a, int b){
        this.x = a;
        this.y = b;
    }

    @Override
    public int compareTo(CPoint t) {
        //2-Norm distance as suggestion A
        double a = Math.sqrt(t.x*t.x + t.y*t.y);
        double b = Math.sqrt(this.x*this.y + this.x*this.y);
        
        
        
        //1-Norm distance(City-Block or Manhattan distance);
        int d1 = Math.abs(t.x) + Math.abs(t.y);
        int d2 = Math.abs(this.x) + Math.abs(this.y);
        
        if(a < b)
            return 1;
        else if(a == b)
            return 0;
        else
            return -1;
    }
    
    //Wildcard character
    public static <? extends Number> void foo6(){
        
    }
}
