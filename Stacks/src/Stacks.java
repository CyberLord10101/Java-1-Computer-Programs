/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author student
 */
public class Stacks {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int worldSize;
        Scanner input = new Scanner(System.in);
        worldSize = input.nextInt();
        Stack<Integer>[] world = new Stack[worldSize];
        int[] location = new int[worldSize];
        String actionA = new String();
        String actionB = new String();
        int blockA = 0; int blockB = 0;
        Stack<Integer> temp = new Stack();
        
        for(int i = 0; i < world.length; i++) {
            world[i] = new Stack<>();
            world[i].push(i);
            location[i] = i;
    }
    // Reads in Action
        actionA = input.next();
    while(!actionA.toLowerCase().equals("quit")) {
        blockA = input.nextInt();
        actionB = input.next();
        blockB = input.nextInt();
    
    
    //Verify
    if (blockA<worldSize && blockB<worldSize &&
          (actionA.equals("move") || actionA.equals("pile")) &&
          (actionB.equals("onto") || actionB.equals("over")) &&
          location[blockA] != location[blockB] && blockA >= 0 &&
          blockB >= 0) {
    
    // Move   
    if(actionA.equals("move")) {
        while(!world[location[blockA]].isEmpty() && 
                blockA != world[location[blockA]].peek()) {
        location[world[location[blockA]].peek()] 
                = world[location[blockA]].peek();
        world[world[location[blockA]].peek()].push
        (world[location[blockA]].pop());
        }
    world[location[blockA]].pop();
    temp.push(blockA);             
    
    //Over or onto    
    if(actionB.equals("over")) {
        while(!temp.isEmpty()){
            world[location[blockB]].push(temp.pop());
            location[blockA] = location[blockB];
            
      }
    }
    else {
          while(!world[location[blockB]].peek().equals(blockB)) {
            location[world[location[blockB]].peek()] 
            = world[location[blockB]].peek();
            world[world[location[blockB]].peek()].push
            (world[location[blockB]].pop());  
          }
          while(!temp.isEmpty()) {
            world[location[blockB]].push(temp.pop());
            }
          location[blockA] = location[blockB];
          }
    }
    //Pile
    else {
        do{
            temp.push(world[location[blockA]].pop());
        }while (!world[location[blockA]].isEmpty() 
                && !temp.peek().equals(blockA));
    //Over or Onto
    if(actionB.equals("over")) {
        while(!temp.isEmpty()){
            location[temp.peek()] = location[blockB];
            world[location[blockB]].push(temp.pop());
            location[blockA] = location[blockB];
        }
    }
    else {
     while(blockB != world[location[blockB]].peek()) {
     location[world[location[blockB]].peek()] = world[location[blockB]].peek();
     world[world[location[blockB]].peek()].push(world[location[blockB]].pop());
      }
        while(!temp.isEmpty()){
            location[temp.peek()] = location[blockB];
            world[location[blockB]].push(temp.pop());
            }location[blockA]= location[blockB];
    }
        
    }
    }
    
    /*for(int i=0; i<world.length; i++) {
       System.out.println(world[i] + " location of:" + i + " = " + location[i]);
    }*/
    
   
    actionA=input.next();}//End of while loop
    // Final Print
    for(int i = 0; i<world.length; i++) {
            System.out.print(i + ":");
            while(!world[i].isEmpty()){
            temp.push(world[i].pop());
            }
            while(!temp.isEmpty())
                System.out.print(" " + temp.pop());
            System.out.print("\n");
        }
    System.exit(0);} 
 }





/*for(int i = 0; i < worldSize; i++){
        System.out.print(location[i] + ": ");
        System.out.println(world[i]);
        if(i==worldSize - 1){
            System.exit(0); 
        }
    }*/