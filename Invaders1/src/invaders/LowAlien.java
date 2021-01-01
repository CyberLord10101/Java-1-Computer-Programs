package invaders;

import java.awt.Color;


public class LowAlien extends Alien {
    private int pWidth;
    public LowAlien(){
        super(); 
    }
    //Creates the LowAlien
    public LowAlien(int x, int y, int u){
        super(x, y, u);
        setColor(Color.RED);
        pWidth = u;
        npoints = 36;
        xpoints = new int[npoints];
        ypoints = new int[npoints];
        xpoints[0] = x;
        xpoints[1] = x + u;
        xpoints[2] = x + u;
        xpoints[3] = x + 4*u;
        xpoints[4] = x + 4*u;
        xpoints[5] = x + 8*u;
        xpoints[6] = x + 8*u;
        xpoints[7] = x + 11*u;
        xpoints[8] = x + 11*u;
        xpoints[9] = x + 12*u;
        xpoints[10] = x + 12*u;
        xpoints[11] = x + 10*u;
        xpoints[12] = x + 10*u;
        xpoints[13] = x + 11*u;
        xpoints[14] = x + 11*u;
        xpoints[15] = x + 10*u;
        xpoints[16] = x + 10*u;
        xpoints[17] = x + 8*u;
        xpoints[18] = x + 8*u;
        xpoints[19] = x + 9*u;
        xpoints[20] = x + 9*u;
        xpoints[21] = x + 7*u;
        xpoints[22] = x + 7*u;
        xpoints[23] = x + 5*u;
        xpoints[24] = x + 5*u;
        xpoints[25] = x + 3*u;
        xpoints[26] = x + 3*u;
        xpoints[27] = x + 4*u;
        xpoints[28] = x + 4*u;
        xpoints[29] = x + 2*u;
        xpoints[30] = x + 2*u;
        xpoints[31] = x + u;
        xpoints[32] = x + u;
        xpoints[33] = x + 2*u;
        xpoints[34] = x + 2*u;
        xpoints[35] = x;
        
        ypoints[0] = y + 2*u;
        ypoints[1] = y + 2*u;
        ypoints[2] = y + u;
        ypoints[3] = y + u;
        ypoints[4] = y;
        ypoints[5] = y;
        ypoints[6] = y + u;
        ypoints[7] = y + u;
        ypoints[8] = y + 2*u;
        ypoints[9] = y + 2*u;
        ypoints[10] = y + 5*u;
        ypoints[11] = y + 5*u;
        ypoints[12] = y + 6*u;
        ypoints[13] = y + 6*u;
        ypoints[14] = y + 7*u;
        ypoints[15] = y + 7*u;
        ypoints[16] = y + 8*u;
        ypoints[17] = y + 8*u;
        ypoints[18] = y + 7*u;
        ypoints[19] = y + 7*u;
        ypoints[20] = y + 6*u;
        ypoints[21] = y + 6*u;
        ypoints[22] = y + 5*u;
        ypoints[23] = y + 5*u;
        ypoints[24] = y + 6*u;
        ypoints[25] = y + 6*u;
        ypoints[26] = y + 7*u;
        ypoints[27] = y + 7*u;
        ypoints[28] = y + 8*u;
        ypoints[29] = y + 8*u;
        ypoints[30] = y + 7*u;
        ypoints[31] = y + 7*u;
        ypoints[32] = y + 6*u;
        ypoints[33] = y + 6*u;
        ypoints[34] = y + 5*u;
        ypoints[35] = y + 5*u;
       
    }
    //Width of the LowAlien
    public int getWidth(){
        return 12*pWidth;
    }
}
