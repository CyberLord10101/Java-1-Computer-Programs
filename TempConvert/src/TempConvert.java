import javax.swing.*;

public class TempConvert {
    public static void main(String[] args) {
        int fahr;
        float cel;

        String c = JOptionPane.showInputDialog(null,"Fahrenheit(Type 'c' for Celsius)", "TempConvert", JOptionPane.PLAIN_MESSAGE).trim();
        String f = "";
        if(c.charAt(0) =='c'){
            f += JOptionPane.showInputDialog(null, "Celsius(Type 'f' for Fahrenheit)", "TempConvert", JOptionPane.PLAIN_MESSAGE).trim();
        }
    }
}
