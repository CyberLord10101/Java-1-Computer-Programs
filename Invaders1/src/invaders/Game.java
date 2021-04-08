package invaders;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author student
 */
public class Game {

    private static int numLives;
    private static int curScore;
    private JFrame window;
    private Space screen;
    private Timer aTimer, sTimer, bTimer, baTimer;
    private boolean movingLeft, movingRight;

    private final int ALIEN_TIME_DELAY = 500;//500
    private final int SHIP_TIME_DELAY = 40;
    private final int BULLET_TIME_DELAY = 5;
    private final int BONUS_ALIEN_TIME_DELAY = 100;

    public Game() {

        //Create the window and other stuff
        window = new JFrame("Space invaders v1.0");
        window.setSize(800, 800);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.addKeyListener(new MoveListener());
        window.setResizable(false);


        numLives = 3;
        curScore = 0;

        //Timer for frame
        baTimer = new Timer(BONUS_ALIEN_TIME_DELAY, new BonusListener());
        aTimer = new Timer(ALIEN_TIME_DELAY, new AlienListener());
        sTimer = new Timer(SHIP_TIME_DELAY, new ShipListener());
        bTimer = new Timer(BULLET_TIME_DELAY, new BulletListener());
        //Create the space 
        screen = new Space();

        //Add and display
        window.add(screen);
        window.setVisible(true);

        //populate the screen
        screen.init();
        aTimer.start();
        sTimer.start();
        bTimer.start();
        baTimer.start();

        movingLeft = movingRight = false;

    }

    //Listens for the ship 
    private class BonusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            screen.updateBonus();
            screen.repaint();
        }

    }

    //Uses the timer for to give the aliens life
    private class AlienListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            screen.updateAliens();
            screen.repaint();
        }
    }

    //When you press a direction is associated with that press
    private class ShipListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (movingRight) {
                screen.moveShip(Ship.Direction.RIGHT);
            } else if (movingLeft) {
                screen.moveShip(Ship.Direction.LEFT);
            }
            screen.repaint();
        }

    }

    //Gives the bullet a life 
    private class BulletListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            screen.updateBullet();
            screen.repaint();
        }
    }

    //When you press a directional pad key you get a response in the direction
    //that is related to the direction relative to yourself when facing the keyboard
    private class MoveListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent ke) {
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                movingRight = true;
            } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                movingLeft = true;
            } else if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
                screen.fireBullet();
            }
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                movingRight = false;
            } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                movingLeft = false;
            } else if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
                System.out.println("");
            }

        }
    }
}
