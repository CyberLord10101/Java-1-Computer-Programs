/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author student
 */
public class StackEx {

    public static int WORLD_SIZE = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        Random rand = new Random();
        System.out.println("Stack" + demo + ", Size = " + demo.size());
        for(int i = 1; i<= 10; i++)
            demo.push(rand.nextInt(10)+ 1);
        System.out.println("Stack: " + demo + ", size = " + demo.size());
        
        //Process all elements on the stack
        while(!demo.isEmpty()){
            System.out.print(" Top: " + demo.peek());
            demo.pop();
        }
        
        //Create an array of Stacks
        int[] location = new int[WORLD_SIZE];
        Stack<Integer>[] world = new Stack[WORLD_SIZE];
        for(int i = 0; i < world.length; i++){
            world[i] = new Stack<>();
            world[i].push(i);
            location[i] = i;
            world[location[4]].peek();
            
        }
        
    }
    
    public void move(int a){
        
        
    }
    
    public void pile(int nLoc){
        
    }    
}
