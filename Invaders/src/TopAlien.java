import java.awt.Color;


public class TopAlien extends Alien{
    private int pWidth;
    public TopAlien(){
        super();
    }
    //Creates the top Alien
    public TopAlien(int x, int y, int u){
        super(x, y, u);
        setColor(Color.BLUE.brighter());
        pWidth = u;
        npoints = 44;
        xpoints = new int[npoints];
        ypoints = new int[npoints];
        
        xpoints[0] = x;
        xpoints[1] = x + u;
        xpoints[2] = x + u;
        xpoints[3] = x + 2*u;
        xpoints[4] = x + 2*u;
        xpoints[5] = x + 3*u;
        xpoints[6] = x + 3*u;
        xpoints[7] = x + 7*u;
        xpoints[8] = x + 7*u;
        xpoints[9] = x + 8*u;
        xpoints[10] = x + 8*u;
        xpoints[11] = x + 9*u;
        xpoints[12] = x + 9*u;
        xpoints[13] = x + 10*u;
        xpoints[14] = x + 10*u;
        xpoints[15] = x + 9*u;
        xpoints[16] = x + 9*u;
        xpoints[17] = x + 10*u;
        xpoints[18] = x + 10*u;
        xpoints[19] = x + 9*u;
        xpoints[20] = x + 9*u;
        xpoints[21] = x + 8*u;
        xpoints[22] = x + 8*u;
        xpoints[23] = x + 9*u;
        xpoints[24] = x + 9*u;
        xpoints[25] = x + 8*u;
        xpoints[26] = x + 8*u;
        xpoints[27] = x + 7*u;
        xpoints[28] = x + 7*u;
        xpoints[29] = x + 3*u;
        xpoints[30] = x + 3*u;
        xpoints[31] = x + 2*u;
        xpoints[32] = x + 2*u;
        xpoints[33] = x + u;
        xpoints[34] = x + u;
        xpoints[35] = x + 2*u;
        xpoints[36] = x + 2*u;
        xpoints[37] = x + u;
        xpoints[38] = x + u;
        xpoints[39] = x;
        xpoints[40] = x;
        xpoints[41] = x + u;
        xpoints[42] = x + u;
        xpoints[43] = x;
        
        ypoints[0] = y + 3*u;
        ypoints[1] = y + 3*u;
        ypoints[2] = y + 2*u;
        ypoints[3] = y + 2*u;
        ypoints[4] = y + u;
        ypoints[5] = y + u;
        ypoints[6] = y;
        ypoints[7] = y;
        ypoints[8] = y + u;
        ypoints[9] = y + u;
        ypoints[10] = y + 2*u;
        ypoints[11] = y + 2*u;
        ypoints[12] = y + 3*u;
        ypoints[13] = y + 3*u;
        ypoints[14] = y + 6*u;
        ypoints[15] = y + 6*u;
        ypoints[16] = y + 7*u;
        ypoints[17] = y + 7*u;
        ypoints[18] = y + 8*u;
        ypoints[19] = y + 8*u;
        ypoints[20] = y + 9*u;
        ypoints[21] = y + 9*u;
        ypoints[22] = y + 8*u;
        ypoints[23] = y + 8*u;
        ypoints[24] = y + 7*u;
        ypoints[25] = y + 7*u;
        ypoints[26] = y + 6*u;
        ypoints[27] = y + 6*u;
        ypoints[28] = y + 7*u;
        ypoints[29] = y + 7*u;
        ypoints[30] = y + 6*u;
        ypoints[31] = y + 6*u;
        ypoints[32] = y + 7*u;
        ypoints[33] = y + 7*u;
        ypoints[34] = y + 8*u;
        ypoints[35] = y + 8*u;
        ypoints[36] = y + 9*u;
        ypoints[37] = y + 9*u;
        ypoints[38] = y + 8*u;
        ypoints[39] = y + 8*u;
        ypoints[40] = y + 7*u;
        ypoints[41] = y + 7*u;
        ypoints[42] = y + 6*u;
        ypoints[43] = y + 6*u;
    }
    public int getWidth(){
        return 12*pWidth;
    }
}
