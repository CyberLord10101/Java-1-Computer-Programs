import javax.swing.*;

public class TempConvert {
    public static void main(String[] args) {
        String input = "";
        char ch = 'f';

        do {
            switch(ch) {
                case 'f':
                    input = JOptionPane.showInputDialog(null, "Enter Celsius(Type 'c' to convert Celsius)", "TempConvert", JOptionPane.PLAIN_MESSAGE).trim();
                    if(input.charAt(0) == 'c') {
                        ch = input.charAt(0);
                    }else
                        ch = 'n';
                    break;
                case 'c':
                    input = JOptionPane.showInputDialog(null, "Enter Fahrenheit(Type 'f' to convert to Fahrenheit)", "TempConvert", JOptionPane.PLAIN_MESSAGE).trim();
                    if(input.charAt(0) == 'f') {
                        ch = input.charAt(0);
                    }else
                        ch = 'm';
                    break;
            }
        }while( ch == 'c' || ch == 'f');

        int toInt = Integer.parseInt(input);

        if(ch == 'n') {
            JOptionPane.showMessageDialog(null, String.format("This is it in Fahrenheit : %.2f\u2109 ", convert(toInt, ch)),"Fahrenheit",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, String.format("This is it in Celsius : %.2f\u2103", convert(toInt, ch)), "Celsius",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static double convert(int temp, char type ){
        if(type == 'm'){
            return (5.0/9) * (temp - 32);
        }else{
            return (((9.0/5) * temp) + 32);
        }
    }
}
