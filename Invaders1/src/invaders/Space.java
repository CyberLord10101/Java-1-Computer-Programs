package invaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import javax.swing.JPanel;

public class Space extends JPanel {

    private MidAlien[][] mEnemy;
    private LowAlien[][] lEnemy;
    private TopAlien[] tEnemy;
    private BonusAlien bEnemy;
    private Ship player;
    private Bullet bullet;

    private static final int COL = 11;
    private static final int NUM_DUP_ROW = 2;
    private static final int ROW_HEIGHT = 60;
    private static final int ROW_FOR_TA = 1;
    private static final int SHIP_DELTAX = 5;

    private static int deltaX = 8;
    private static int deltaY = 4;

    private static int laScore = 10;
    private static int maScore = 20;
    private static int taScore = 30;

    private static boolean defeat = false;
    
    //
    public Space() {

        setBackground(Color.BLACK);
        lEnemy = new LowAlien[NUM_DUP_ROW][COL];
        tEnemy = new TopAlien[COL];
        mEnemy = new MidAlien[NUM_DUP_ROW][COL];

        bEnemy = new BonusAlien(200, 50, 50);
    }
    //Test the bounds for the aliens 
    public void init() {
        int pad = getWidth() / 12;
        int spacing = (getWidth() - 2 * pad) / COL;
        for (int i = 0; i < NUM_DUP_ROW; i++) {
            for (int j = 0; j < COL; j++) {
                lEnemy[i][j] = new LowAlien(pad + spacing * j, 300 + i * ROW_HEIGHT,
                        spacing / 12);

                mEnemy[i][j] = new MidAlien(pad + spacing * j, 180 + i * ROW_HEIGHT,
                        spacing / 12);

            }
        }
        for (int i = 0; i < COL; i++) {
            tEnemy[i] = new TopAlien(pad + spacing * i, 125 + i * ROW_FOR_TA,
                    spacing / 12);
        }
        //Create the player 
        player = new Ship(300, 690);
        bullet = new Bullet(player.xpoints[6], player.ypoints[6]);

    }
    //Paints everything you see on screen: Aliens, Score, Ship, Bullet
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int score = 0;
        BonusAlien b = new BonusAlien(200, 50, 5);

        for (LowAlien[] a : lEnemy) {
            for (LowAlien am : a) {
                if (am.isAlive() == false) {
                    score += laScore;
                }
            }
        }
        for (MidAlien[] a : mEnemy) {
            for (MidAlien am : a) {
                if (am.isAlive() == false) {
                    score += maScore;
                }
            }
        }
        for (TopAlien a : tEnemy) {
            if (a.isAlive() == false) {
                score += taScore;
            }
        }

        g2.setColor(Color.WHITE);

        //Paint the "Lower Aliens"
        for (LowAlien[] l : lEnemy) {
            for (LowAlien a : l) {
                g2.setColor(a.getColor());
                g2.fillPolygon(a);

            }
        }

        //Paint the "Middle Aliens"
        for (MidAlien[] l : mEnemy) {
            for (MidAlien a : l) {
                g2.setColor(a.getColor());
                g2.fillPolygon(a);
            }
        }

        //Paint the "Top Aliens"
        for (TopAlien a : tEnemy) {
            g2.setColor(a.getColor());
            g2.fillPolygon(a);
        }

        g2.setColor(Color.red);
        g2.fillPolygon(b);

        //Setting up the Score keeper
        g2.setColor(Color.GREEN);
        String s = new String("Score: " + Integer.toString(score));

        Font serif1 = new Font("Serif", Font.PLAIN, 30);

        AttributedString as = new AttributedString(s);

        as.addAttribute(TextAttribute.FONT, serif1);

        g2.drawString(as.getIterator(), 630, 50);
        //Win if all aliens are defeated lose if they hit the muzzle of your ship
        if (score == 990) {
            String s1 = new String("You Win");
            Font serif2 = new Font("Serif", Font.PLAIN, 30);
            AttributedString as1 = new AttributedString(s1);
            as1.addAttribute(TextAttribute.FONT, serif2);
            g2.drawString(as1.getIterator(), 330, 340);

        } 
        if (getBottomMostAlienYValue()) {
            String s2 = new String("You Lose");
            Font serif3 = new Font("Serif", Font.PLAIN, 30);
            AttributedString as2 = new AttributedString(s2);
            as2.addAttribute(TextAttribute.FONT, serif3);
            g2.drawString(as2.getIterator(), 330, 340);
        }

        g2.setColor(Color.MAGENTA.brighter());
        g2.fillPolygon(bullet);

        g2.setColor(player.getColor());
        g2.fillPolygon(player);
    }

    //Makes the bonus alien move from left to right but
    //sadly I couldn't get it to work
    public void updateBonus() {
        int rand = (int) (Math.random() * 2 + 1);
        BonusAlien b = new BonusAlien(200, 50, 5);

        switch (rand) {
            case 1:
                b.translate(deltaX, 0);
                break;
            case 2:
                b.translate(-deltaX, 0);
                break;
        }
    }
    //Moves the top, middle and lower alien as changes the direction
    //of their movement when they hit a boundary
    public void updateAliens() {
        for (LowAlien[] la : lEnemy) {
            for (LowAlien a : la) {
                a.translate(deltaX, 0);
            }
        }

        for (MidAlien[] la : mEnemy) {
            for (MidAlien a : la) {
                a.translate(deltaX, 0);
            }
        }

        for (TopAlien la : tEnemy) {
            la.translate(deltaX, 0);
        }



        if (getRightMostAlienXValue() >= getWidth()
                || getLeftMostAlienXValue() <= 0) {
            //change direction and drop down
            deltaX = -deltaX;
            for (LowAlien[] la : lEnemy) {
                for (LowAlien a : la) {
                    a.translate(0, deltaY);
                }
            }

            for (MidAlien[] la : mEnemy) {
                for (MidAlien a : la) {
                    a.translate(0, deltaY);
                }
            }

            for (TopAlien la : tEnemy) {
                la.translate(0, deltaY);
            }
        }
    }
    //Bullet is fired or not fired based on this method
    public void fireBullet() {
        bullet.setFired(true);
    }
    //Gets the right most aliens x value
    private int getRightMostAlienXValue() {
        int index = COL;
        boolean found = false;
        do {
            index--;
            found = lEnemy[0][index].isAlive()
                    || lEnemy[1][index].isAlive()
                    || mEnemy[0][index].isAlive()
                    || mEnemy[1][index].isAlive()
                    || tEnemy[index].isAlive();

        } while (!found && index > 0);

        return lEnemy[0][index].getX() + lEnemy[0][index].getWidth();

    }
    //Gets the left most alien x value
    private int getLeftMostAlienXValue() {
        int index = -1;
        boolean found = false;
        do {
            index++;
            found = lEnemy[0][index].isAlive()
                    || lEnemy[1][index].isAlive()
                    || mEnemy[0][index].isAlive()
                    || mEnemy[1][index].isAlive()
                    || tEnemy[index].isAlive();
        } while (!found && index < COL - 1);

        return lEnemy[0][index].getX() + deltaX;
    }

    //Detects bottom most alien then you lose the game
    boolean getBottomMostAlienYValue() {
        int i = 0, j = 0;
        boolean found = false;

        do {
            if (j > COL- 1) {
                i++;
            } else {
                found = mEnemy[i][j].isAlive()
                        || lEnemy[i][j].isAlive()
                        || tEnemy[j].isAlive();
            }



            if (lEnemy[i][j].isAlive() && lEnemy[i][j].getY() >= 600) {
                defeat = true;
            } else if (mEnemy[i][j].isAlive() && mEnemy[i][j].getY() >= 600) {
                defeat = true;
            } else if (tEnemy[j].isAlive() && tEnemy[j].getY() >= 600) {
                defeat = true;
            }
            j++;
        } while (!found && j < 11 && i < 2);

        return defeat;
    }
    //When key is pressed tell what to do based on directional keypad
    public void moveShip(Ship.Direction dir) {
        if (dir == Ship.Direction.LEFT && player.getX() > 0) {
            player.translate(-SHIP_DELTAX, 0);
            if (bullet.getFired() == false) {
                bullet.translate(-SHIP_DELTAX, 0);
            }
        }
        if (dir == Ship.Direction.RIGHT && player.getX() < getWidth() - player.getWidth()) {
            player.translate(SHIP_DELTAX, 0);
            if (bullet.getFired() == false) {
                bullet.translate(SHIP_DELTAX, 0);
            }
        }
    }
    //Puts the bullet back to its position at the muzzle of the ship after
    //intersecting with an alien
    public void updateBullet() {

        if (bullet.getFired() == true && bullet.ypoints[0] > 0) {
            bullet.translate(0, -deltaY);
        }
        if (bullet.ypoints[0] < 1) {
            bullet.setFired(false);
            bullet.translate(-bullet.getX() + player.getX()
                    + (player.getWidth() - bullet.getWidth()) / 2, player.getY());
        }
        for (LowAlien[] a : lEnemy) {
            for (LowAlien am : a) {
                if (bullet.intersects(am.getBounds2D()) && am.isAlive()) {
                    am.setAlive(false);
                    am.setColor(Color.BLACK);
                    bullet.setFired(false);
                    bullet.translate(-bullet.getX() + player.getX()
                            + (player.getWidth() - bullet.getWidth()) / 2, player.getY()
                            - bullet.getY());
                }
            }
        }
        for (MidAlien[] a : mEnemy) {
            for (MidAlien am : a) {
                if (bullet.intersects(am.getBounds2D()) && am.isAlive()) {
                    am.setAlive(false);
                    am.setColor(Color.BLACK);
                    bullet.setFired(false);
                    bullet.translate(-bullet.getX() + player.getX()
                            + (player.getWidth() - bullet.getWidth()) / 2, player.getY()
                            - bullet.getY());
                }
            }
        }
        for (TopAlien a : tEnemy) {
            if (bullet.intersects(a.getBounds2D()) && a.isAlive()) {
                a.setAlive(false);
                a.setColor(Color.BLACK);
                bullet.setFired(false);
                bullet.translate(-bullet.getX() + player.getX()
                        + (player.getWidth() - bullet.getWidth()) / 2, player.getY()
                        - bullet.getY());
            }
        }

    }

}
