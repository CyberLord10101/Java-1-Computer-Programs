/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package redrex;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class RedrEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int high = 0,low = Integer.MAX_VALUE, count = 0, score = 0,sum = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the scores (-1 to quit): ");
        score = input.nextInt();
        while(score != -1){
            count++;
            sum += score;
            high = (score > high)?score:high;
            low = (score < low)?score:low;
            score = input.nextInt();
        }
        
        System.out.println("Summary: ");
        System.out.println("\tNum Scores: " + count);
        System.out.println("\tHigh Score: " + high);
        System.out.println("\tLow Score: " + low);
        System.out.println("\tAvg Score: " + (double)sum/count);
    }
    
}
