/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class RecursiveEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    
        System.out.println("Enter a postive number: ");
        int n = input.nextInt();
        System.out.println(n + "! = " + findFactorialIteratively(n));
        System.out.println(n + "! = " + findFactorialRecursively(n));
        System.out.println("Value = " + guess(n));
        System.out.println("Foo = " + foo(100*n, n));
    }
    public static int guess(int n) {
        if(n == -3 )
            return 2;
        else 
            return n + 2*guess(n-1);
    }
    
    public static int foo(int x, int y){
        if(x - y <= 0)
            return 5;
        else 
            return x + y + foo(x/2, y + 1);
    }
    public static BigInteger findFactorialIteratively(int n){
        BigInteger product = new BigInteger("1");
        
        for(int i = n; i > 1; i--){
            product = product.multiply(new BigInteger("" + i));
        }
        return product;
    }
    public static BigInteger findFactorialRecursively(int n){
        if(n == 0)
            return BigInteger.ONE;
        else 
            return findFactorialRecursively(n - 1).multiply(new BigInteger("" + n));
    }

}
    
