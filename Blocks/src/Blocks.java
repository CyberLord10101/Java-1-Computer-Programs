/*
Name: Cole Proffitt
Date Created: 05/01/18
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author student
 */
public class Blocks {

    /**
     * @param int Size of the world then the action
     * @return the world and where the blocks were moved
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int worldSize;
        Scanner input = new Scanner(System.in);
        worldSize = input.nextInt();
        String actionA = new String();
        String actionB = new String();
        int blockA = 0, blockB = 0;
        Stack<Integer> temp = new Stack();

        //Create an array of Stacks
        int[] location = new int[worldSize];
        Stack<Integer>[] world = new Stack[worldSize];

        for (int i = 0; i < world.length; i++) {
            world[i] = new Stack<>();
            world[i].push(i);
            location[i] = i;
        }

        //Reads actionA
        actionA = input.next();
        while (!actionA.toLowerCase().equals("quit")) {
            blockA = input.nextInt();
            actionB = input.next();
            blockB = input.nextInt();

            //Verifys the input 
            if (blockA < worldSize && blockB < worldSize
                    && actionA.equals("move") || actionA.equals("pile")
                    || actionB.equals("over") || actionB.equals("onto")
                    || location[blockA] != location[blockB] || blockA >= 0
                    || blockB >= 0) {
                
                //Move
                if (actionA.equals("move")) {
                    while (blockA != world[location[blockA]].peek()) {
                        location[world[location[blockA]].peek()] = world[location[blockA]].peek();
                        world[world[location[blockA]].peek()].push(world[location[blockA]].pop());
                    }

                    world[location[blockA]].pop();
                    temp.push(blockA);

                    //Over/onto
                    if (actionB.equals("over")) {
                        while (!temp.isEmpty()) {
                            world[location[blockB]].push(temp.pop());
                            location[blockA] = blockB;
                        }
                    } else {
                        if (world[location[blockB]].peek().equals(blockB)) {
                            while (!temp.isEmpty()) {
                                world[location[blockB]].push(temp.pop());
                                location[blockA] = blockB;
                            }
                        } else {
                            while (blockB != world[location[blockB]].peek()) {
                                location[world[location[blockB]].peek()]
                                        = world[location[blockB]].peek();
                                world[world[location[blockB]].peek()].
                                        push(world[location[blockB]].pop());
                            }
                            world[location[blockB]].push(temp.pop());
                            location[blockA] = blockB;
                        }
                    }
                }
                
                //Pile
                else {
                    while (blockA != world[location[blockA]].peek()) {
                        temp.push(world[location[blockA]].pop());
                    }
                    world[location[blockA]].pop();
                    temp.push(blockA);
                    
                    //Over and Onto for Pile
                    if (actionB.equals("over")) {
                        while (!temp.isEmpty()) {
                            world[location[blockB]].push(temp.pop());
                            location[blockA] = blockB;
                        }
                    } else {
                        while (blockB != world[location[blockB]].peek()) {
                            location[world[location[blockB]].peek()]
                                    = world[location[blockB]].peek();
                            world[world[location[blockB]].peek()].
                                    push(world[location[blockB]].pop());

                        }
                        while (!temp.isEmpty()) {
                            world[location[blockB]].push(temp.pop());
                            location[blockA] = blockB;
                        }
                    }
                }
            }

            /*for (int i = 0; i < world.length; i++) {
                if (world[i].isEmpty()) {
                    System.out.println(i + ":");
                } else {
                    System.out.println(location[i] + ": " + world[i]);
                }
            }
*/
            actionA = input.next();
        }
        for (int i = 0; i < world.length; i++) {
            if (world[i].isEmpty()) {
                System.out.print(i + ":");
            } else {
                System.out.print(i + ": ");
            }
            while (!world[i].isEmpty()) {
                temp.push(world[i].pop());
            }
            while (!temp.isEmpty()) {
                System.out.print(temp.pop() + " ");
            }
            System.out.print("\b\n");
        }
        System.out.println();
        System.exit(0);

    }
}
