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
public class ToPostfix {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>(); 
        String operator = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Infix expr: ");
        String infix = input.nextLine();
        StringBuilder postfix = new StringBuilder();
        
        //infix = infix.replaceAll(" ", "");
        System.out.print(infix + " = ");
      
        Scanner parser = new Scanner(infix);
        while(parser.hasNext()){
            if(parser.hasNextInt())
                postfix.append("" + parser.nextInt() + " ");
            else{
                operator = parser.next();
                if(ops.isEmpty())
                    ops.push(operator);
                else if(operator.equals("("))
                    ops.push(operator);
                else if(operator.equals(")")) {
                    while(!ops.peek().equals("("))
                        postfix.append(ops.pop() + " ");
                    ops.pop();
                }
                
                else if(prec(ops.peek()) < prec(operator))
                    ops.push(operator);
                else{
                    while(!ops.isEmpty() && prec(ops.peek()) >= prec(operator))
                        postfix.append(ops.pop() + " ");
                    ops.push(operator);
                }
            }
        }//End of parser
        while(!ops.isEmpty())
            postfix.append(ops.pop() + " ");
        
        
        System.out.println(postfix);
        
    }
    public static int prec(String op){
        int priority = 0;
        switch(op){
            case "^": priority++;
            case "%": 
            case "*":
            case "/": priority++;
            case "-":
            case "+": priority++;    
        }
        return priority;
    }
}
