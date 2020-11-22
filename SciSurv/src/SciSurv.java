import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.event.*;
import javax.swing.*;


public class SciSurv extends JFrame implements ItemListener {
    private JCheckBox jchTech, jchSci;
    
   
    public static void main(String[] args) {
        JFrame frame = new SciSurv();
        frame.setSize(300,300);
        frame.setTitle("Science Survey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public SciSurv(){
        JPanel p1 = new JPanel();
        
        p1.setLayout(new GridLayout(1,2));
        p1.add(jchTech = new JCheckBox("Technology"));
        p1.add(jchSci = new JCheckBox("Science"));
        
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(p1, BorderLayout.CENTER);
        
        jchTech.addItemListener(this);
        jchSci.addItemListener(this);
        
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        //if(e.getSource() == )
    }

  

   
    
}
