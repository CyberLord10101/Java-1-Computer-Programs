/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author student
 */
public class Driver1 {
    public static final int SIZE = 30000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start = 0L, end = 0L;
        int[] data = new int[SIZE];
        //Sort test = new Sort();
        System.out.println("Java Sort :");
        shuffleList(data);
        printList(data);
        start = System.nanoTime();
        Sort.javaSort(data);
        end = System.nanoTime();
        printList(data);
        System.out.println("Elapsed time: " + (end - start)/Math.pow(10,9));
        
        System.out.println("Selection :");
        shuffleList(data);
        printList(data);
        Sort.selection(data);
        printList(data);
        
        System.out.println("Insertion :");
        shuffleList(data);
        printList(data);
        Sort.insertion(data);
        printList(data);
        
        System.out.println("Quick :");
        shuffleList(data);
        printList(data);
        Sort.quick(data);
        printList(data);
        
        System.out.println("Merge :");
        shuffleList(data);
        printList(data);
        Sort.mergeSort(data);
        printList(data);

    }
    public static void printList(int[] a){
        for(int value : a)
            System.out.print(value + " ");
        System.out.println();
    }
    public static void shuffleList(int[] a){
        Random rand = new Random();
        for(int i = 0; i < a.length;i++ )
            a[i] = rand.nextInt(9000) + 1000;
    }
}
