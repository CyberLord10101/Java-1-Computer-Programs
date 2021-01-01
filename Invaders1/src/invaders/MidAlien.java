package invaders;

import java.awt.Color;

public class MidAlien extends Alien{
    private int pWidth;
    public MidAlien() {
        super();
    }
    //Creates the MidAlien
    public MidAlien(int x,int y, int u){
        super(x, y, u);
        setColor(Color.WHITE.brighter());
        pWidth = u;
        npoints = 56;
        xpoints = new int[npoints];
        ypoints = new int[npoints];
        xpoints[0] = x;
        xpoints[1] = x + u;
        xpoints[2] = x + u;
        xpoints[3] = x + 2*u;
        xpoints[4] = x + 2*u;
        xpoints[5] = x + 3*u;
        xpoints[6] = x + 3*u;
        xpoints[7] = x + u;
        xpoints[8] = x + u;
        xpoints[9] = x + 3*u;
        xpoints[10] = x + 3*u;
        xpoints[11] = x + 4*u;
        xpoints[12] = x + 4*u;
        xpoints[13] = x + 9*u;
        xpoints[14] = x + 9*u;
        xpoints[15] = x + 10*u;
        xpoints[16] = x + 10*u;
        xpoints[17] = x + 12*u;
        xpoints[18] = x + 12*u;
        xpoints[19] = x + 10*u;
        xpoints[20] = x + 10*u;
        xpoints[21] = x + 11*u;
        xpoints[22] = x + 11*u;
        xpoints[23] = x + 12*u;
        xpoints[24] = x + 12*u;
        xpoints[25] = x + 13*u;
        xpoints[26] = x + 13*u;
        xpoints[27] = x + 12*u;
        xpoints[28] = x + 12*u;
        xpoints[29] = x + 11*u;
        xpoints[30] = x + 11*u;
        xpoints[31] = x + 10*u;
        xpoints[32] = x + 10*u;
        xpoints[33] = x + 7*u;
        xpoints[34] = x + 7*u;
        xpoints[35] = x + 10*u;
        xpoints[36] = x + 10*u;
        xpoints[37] = x + 9*u;
        xpoints[38] = x + 9*u;
        xpoints[39] = x + 7*u;
        xpoints[40] = x + 7*u;
        xpoints[41] = x + 6*u;
        xpoints[42] = x + 6*u;
        xpoints[43] = x + 4*u;
        xpoints[44] = x + 4*u;
        xpoints[45] = x + 3*u;
        xpoints[46] = x + 3*u;
        xpoints[47] = x + 6*u;
        xpoints[48] = x + 6*u;
        xpoints[49] = x + 3*u;
        xpoints[50] = x + 3*u;
        xpoints[51] = x + 2*u;
        xpoints[52] = x + 2*u;
        xpoints[53] = x + u;
        xpoints[54] = x + u;
        xpoints[55] = x;
        
        ypoints[0] = y + 5*u;
        ypoints[1] = y + 5*u;
        ypoints[2] = y + 4*u;
        ypoints[3] = y + 4*u;
        ypoints[4] = y + 3*u;
        ypoints[5] = y + 3*u;
        ypoints[6] = y + 2*u;
        ypoints[7] = y + 2*u;
        ypoints[8] = y;
        ypoints[9] = y;
        ypoints[10] = y + 2*u;
        ypoints[11] = y + 2*u;
        ypoints[12] = y + 3*u;
        ypoints[13] = y + 3*u;
        ypoints[14] = y + 2*u;
        ypoints[15] = y + 2*u;
        ypoints[16] = y;
        ypoints[17] = y;
        ypoints[18] = y + 2*u;
        ypoints[19] = y + 2*u;
        ypoints[20] = y + 3*u;
        ypoints[21] = y + 3*u;
        ypoints[22] = y + 4*u;
        ypoints[23] = y + 4*u;
        ypoints[24] = y + 5*u;
        ypoints[25] = y + 5*u;
        ypoints[26] = y + 9*u;
        ypoints[27] = y + 9*u;
        ypoints[28] = y + 7*u;
        ypoints[29] = y + 7*u;
        ypoints[30] = y + 9*u;
        ypoints[31] = y + 9*u;
        ypoints[32] = y + 10*u;
        ypoints[33] = y + 10*u;
        ypoints[34] = y + 9*u;
        ypoints[35] = y + 9*u;
        ypoints[36] = y + 7*u;
        ypoints[37] = y + 7*u;
        ypoints[38] = y + 8*u;
        ypoints[39] = y + 8*u;
        ypoints[40] = y + 7*u;
        ypoints[41] = y + 7*u;
        ypoints[42] = y + 8*u;
        ypoints[43] = y + 8*u;
        ypoints[44] = y + 7*u;
        ypoints[45] = y + 7*u;
        ypoints[46] = y + 9*u;
        ypoints[47] = y + 9*u;
        ypoints[48] = y + 10*u;
        ypoints[49] = y + 10*u;
        ypoints[50] = y + 9*u;
        ypoints[51] = y + 9*u;
        ypoints[52] = y + 7*u;
        ypoints[53] = y + 7*u;
        ypoints[54] = y + 9*u;
        ypoints[55] = y + 9*u;
        
        
    }
    //Gets the width of the MidAlien
    public int getWidth(){
            return 12*pWidth;
        }
}
