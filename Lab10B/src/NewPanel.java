import java.awt.*;
import javax.swing.*;

public class NewPanel extends JPanel {
    public NewPanel(int n){
        
        setLayout(new GridLayout(2,2));
        add(new JButton("Button" + n));
        add(new JButton("Button" + (n+1)));
        add(new JButton("Button" + (n+2)));
    }
}
