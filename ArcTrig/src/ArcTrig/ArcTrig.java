package ArcTrig;

import java.util.Scanner;

public class ArcTrig {

   //Hello Testing the repo Hope this fixes the issue
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        char answer = 'y';
        double sine,cosine,tangent,degree;
                
        while(answer == 'y'){
            System.out.println("Please, enter a degree that you would like to find: ");
            degree = Math.toRadians(myInput.nextDouble());
            sine = Math.asin(degree);
            cosine = Math.acos(degree);
            tangent = Math.atan(degree);
            System.out.println(sine + " " + cosine + " " + tangent);
        
            System.out.println("Would you like to enter another degree: " + answer + " or n?");
            String ansStr = myInput.next();
            answer = ansStr.charAt(0);
        }
        
    }
}
