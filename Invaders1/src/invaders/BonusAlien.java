package invaders;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;

/**
 *
 * @author student
 */
public class BonusAlien extends Alien {
    
    private int pWidth;

    public BonusAlien(){
        super();
    }
    //Creates the bonus alien in all its unused glory
    public BonusAlien(int x, int y, int u){
        super(x, y, u);
        setColor(Color.RED);
        pWidth = u;
        npoints = 40;
        xpoints = new int[npoints];
        ypoints = new int[npoints];
        
        xpoints[0] = x;
        xpoints[1] = x + u;
        xpoints[2] = x + u;
        xpoints[3] = x + 2*u;
        xpoints[4] = x + 2*u;
        xpoints[5] = x + 3*u;
        xpoints[6] = x + 3*u;
        xpoints[7] = x + 5*u;
        xpoints[8] = x + 5*u;
        xpoints[9] = x + 11*u;
        xpoints[10] = x + 11*u;
        xpoints[11] = x + 13*u;
        xpoints[12] = x + 13*u;
        xpoints[13] = x + 14*u;
        xpoints[14] = x + 14*u;
        xpoints[15] = x + 15*u;
        xpoints[16] = x + 15*u;
        xpoints[17] = x + 16*u;
        xpoints[18] = x + 16*u;
        xpoints[19] = x + 14*u;
        xpoints[20] = x + 14*u;
        xpoints[21] = x + 13*u;
        xpoints[22] = x + 13*u;
        xpoints[23] = x + 12*u;
        xpoints[24] = x + 12*u;
        xpoints[25] = x + 11*u;
        xpoints[26] = x + 11*u;
        xpoints[27] = x + 9*u;
        xpoints[28] = x + 9*u;
        xpoints[29] = x + 7*u;
        xpoints[30] = x + 7*u;
        xpoints[31] = x + 5*u;
        xpoints[32] = x + 5*u;
        xpoints[33] = x + 4*u;
        xpoints[34] = x + 4*u;
        xpoints[35] = x + 3*u;
        xpoints[36] = x + 3*u;
        xpoints[37] = x + 2*u;
        xpoints[38] = x + 2*u;
        xpoints[39] = x;
   
        ypoints[0] = y + 4*u;
        ypoints[1] = y + 4*u;
        ypoints[2] = y + 3*u;
        ypoints[3] = y + 3*u;
        ypoints[4] = y + 2*u;
        ypoints[5] = y + 2*u;
        ypoints[6] = y + u;
        ypoints[7] = y + u;
        ypoints[8] = y;
        ypoints[9] = y;
        ypoints[10] = y + u;
        ypoints[11] = y + u;
        ypoints[12] = y + 2*u;
        ypoints[13] = y + 2*u;
        ypoints[14] = y + 3*u;
        ypoints[15] = y + 3*u;
        ypoints[16] = y + 4*u;
        ypoints[17] = y + 4*u;
        ypoints[18] = y + 5*u;
        ypoints[19] = y + 5*u;
        ypoints[20] = y + 6*u;
        ypoints[21] = y + 6*u;
        ypoints[22] = y + 7*u;
        ypoints[23] = y + 7*u;
        ypoints[24] = y + 6*u;
        ypoints[25] = y + 6*u;
        ypoints[26] = y + 5*u;
        ypoints[27] = y + 5*u;
        ypoints[28] = y + 6*u;
        ypoints[29] = y + 6*u;
        ypoints[30] = y + 5*u;
        ypoints[31] = y + 5*u;
        ypoints[32] = y + 6*u;
        ypoints[33] = y + 6*u;
        ypoints[34] = y + 7*u;
        ypoints[35] = y + 7*u;
        ypoints[36] = y + 6*u;
        ypoints[37] = y + 6*u;
        ypoints[38] = y + 5*u;
        ypoints[39] = y + 5*u;
        
    }
    //Gets the width of the BonusAlien
    public int pWidth(){
        return 12*pWidth;
    }

}
