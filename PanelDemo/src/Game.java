/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author student
 */
public class Game {
    private JFrame window;
    private Space screen;
    private Timer timer;
    public int value =0;
    
    public Game(){
        //value = 0;
        timer = new Timer(1000, new TimerListener());
        window = new JFrame();
        window.setSize(800,600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("GUI Demonstration");
        
        //Create the panel
        screen = new Space();
        
        //Add components 
        window.add(screen);
        
        //Display
        window.setVisible(true);
        timer.start();
        System.out.println(timer.isRunning());
    }
    private class TimerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           System.out.print(++value + " ");
           screen.repaint();
        }
        
    }
}
