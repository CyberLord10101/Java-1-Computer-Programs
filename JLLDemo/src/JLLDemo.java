/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/**
 *
 * @author student
 */
public class JLLDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList<Integer> ourList = new LinkedList<>();
        LinkedList<String> nameList = new LinkedList<>();
        for(int i = 0; i < 20; i++)
            ourList.add(new Integer (rand.nextInt(100) + 1));
        
        //Print the elements of the list
        System.out.println(ourList);
        
        //Other ways to print a list
        for(int i = 0; i < ourList.size(); i++)
            System.out.print(ourList.get(i) + " ");//Not ourList[i]
        System.out.println();
        for(Integer data : ourList)
            System.out.print(data + " ");
        
        System.out.println();
        ListIterator iter = ourList.listIterator();
        Iterator iter2 = ourList.iterator();
        while(iter2.hasNext())
            System.out.print(iter2.next() + " ");
        
        
    }
    
}
