/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigInteger;


/**
 *
 * @author student
 */
public class LLDemo {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create LinkedList        
        
        LinkedList ourList = new LinkedList();
        
        System.out.println("Empty? " + ourList.isEmpty());
        System.out.println("Current size:" + ourList.size());
        ourList.add(5);
        System.out.println(ourList);
        ourList.add(10);
        System.out.println(ourList);
        ourList.add(15);
        System.out.println(ourList);
        ourList.add(3);
        System.out.println(ourList);
        ourList.add(8);
        System.out.println(ourList);
        System.out.println("Empty? " + ourList.isEmpty());
        System.out.println("Current size:" + ourList.size());
        ourList.add(20);
        System.out.println(ourList);
        System.out.println("Has 7? " + ourList.indexOf(7));
        System.out.println("Has 3? " + ourList.indexOf(3));
        System.out.println("Has 10? " + ourList.indexOf(10));
        System.out.println("Has 20? " + ourList.indexOf(20));
        System.out.println("Has 7? " + ourList.contains(7));
        System.out.println("Has 3? " + ourList.contains(3));
        System.out.println("Has 10? " + ourList.contains(10));
        System.out.println("Has 20? " + ourList.contains(20));
        System.out.println("Has 7? " + ourList.indexOf(7));
        
        ourList.remove(7);
        System.out.println(ourList);
        ourList.remove(5);
        System.out.println(ourList);
    }
    
    
        
    
    
}
