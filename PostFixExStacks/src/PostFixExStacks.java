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
public class PostFixExStacks {
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String expr = "", operator = "";
        Stack<Integer> operand = new Stack<>();
        int[] arg = new int[2];
        Scanner input = new Scanner(System.in);
        
        System.out.print("Post-fix expr: ");
        expr = input.nextLine();
        
        Scanner parser = new Scanner(expr);
        
        //Main parsing loop
        while(parser.hasNext()){
            if(parser.hasNextInt()){
                operand.push(parser.nextInt());
            }
            else{
                operator = parser.next();
                if(operand.size() > 1){
                    arg[RIGHT] = operand.pop();
                    arg[LEFT] = operand.pop();
                }
                else{
                    System.out.println("Error in postfix notation");
                    System.exit(0);
                }
                switch(operator){
                    case "-": operand.push(arg[LEFT] - arg[RIGHT]);
                        break;
                    case "+": operand.push(arg[LEFT] + arg[RIGHT]);
                        break; 
                    case "/": operand.push(arg[LEFT] / arg[RIGHT]);
                        break;    
                    case "*": operand.push(arg[LEFT] * arg[RIGHT]);
                        break;    
                    case "^": operand.push((int)Math.pow(LEFT, RIGHT));  
                        break;
                    case "%": operand.push(arg[LEFT] % arg[RIGHT]);
                        break;
                    default: System.out.println("Unrecognizable operator");
                             System.exit(0);
                }
            }//end of else statement for operator 
        }//end of parse loop
        if(operand.size() != 1)
            System.out.println("Error in postfix notation: ");
        else
            System.out.println("Evaluation: " + operand.pop());
    }
}
