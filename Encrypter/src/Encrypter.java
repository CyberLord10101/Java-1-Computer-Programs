/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author colep_000
 */
public class Encrypter {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mScan = new Scanner(System.in);
        
        System.out.println("Is this being encrypted or decrypted?: yes or no");
        String input = mScan.next();
        String alphabet =    "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String revAlphabet = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        
        if(input.toLowerCase().equals("yes")){
            System.out.println("Please enter a word that you would"
                    + " like to encrypt:");
            String secret = mScan.next();
            String temp = secret;
            //Possible for loop
            
            for(int i = 0; i < secret.length(); i++){
                //Problem with the program replacing chars already replaced
               
                secret = secret.replace(secret.charAt(i), revAlphabet.charAt(alphabet.indexOf(secret.charAt(i))));    
                //if(temp.charAt(i) == revAlphabet.charAt(i))
                    //i = alphabet.length() -1;
                    System.out.println(secret);
            }
            System.out.println(secret);
            System.exit(0);
        }
        else if(input.toLowerCase().equals("no")){
            System.out.println("This most certainly is decryption:");
            String exposed = new String();
            System.exit(0);
        }
            
    }
    
}
