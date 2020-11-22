import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class SalesCommision extends JFrame implements ActionListener {
    private JTextField jtfSalAm = new JTextField(15);
    private JTextField jtfComm = new JTextField(15);
  
    public static void main(String[] args) {
        
        SalesCommision frame = new SalesCommision();
        frame.pack();
        frame.setTitle("Compute Sales and Commisions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public SalesCommision(){
        JPanel p1 = new JPanel();
        
        p1.setLayout(new GridLayout(2,1));
        p1.add(new JLabel("Sales Amount"));
        p1.add(jtfSalAm);
        p1.add(new JLabel("Commisions"));
        p1.add(jtfComm);
        p1.setBorder(new TitledBorder("Sales Amount and Commisions"));
        getContentPane().add(p1,BorderLayout.CENTER);
        p1.setVisible(true);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,2));
        p2.setBorder(new TitledBorder("Commision Rates"));
        p2.add(new JLabel("Sales Amount"));
        p2.add(new JLabel("Commisions Rate"));
        p2.add(new JLabel("$1 to $5,000"));
        p2.add(new JLabel("8 Percent"));
        p2.add(new JLabel("$5,001 to 10,000"));
        p2.add(new JLabel("10 Percent"));
        p2.add(new JLabel("Above $10,000"));
        p2.add(new JLabel("12 Percent"));
        p2.setToolTipText("Computers are for nerds");
        getContentPane().add(p2, BorderLayout.SOUTH);
        p2.setVisible(true);
        
        jtfSalAm.addActionListener(this);
        jtfComm.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double sal, com;
        if(e.getSource() == jtfSalAm){
            sal = Double.parseDouble(jtfSalAm.getText().trim());
            if(sal <= 5000){
                com = sal * .08;
            }
            else if(sal <= 10000){
                com = 400 + (sal - 5000) * .10;
            }
            else
                com = 900 + (sal - 10000) * .12;
            
            jtfComm.setText(new Double(com).toString());
        }
        if(e.getSource() == jtfComm){
            com = Double.parseDouble(jtfComm.getText().trim());
            if(com <= 400){
                sal = com/.08;
            }
            else if(com <= 900){
                sal = 5000 + (com - 400)/.10;
            }
            else
                sal = 10000 + (com - 900)/.12;
            jtfSalAm.setText(new Double(sal).toString());
            
            jtfSalAm.setText(new Double(sal).toString());
        }
    }
    
}
