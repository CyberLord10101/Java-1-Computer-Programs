import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class FutureValue extends JFrame implements ActionListener {
    private JTextField jftInvAm = new JTextField(15);
    private JTextField jftYears = new JTextField(15);
    private JTextField jftAIR = new JTextField(15);
    private JTextField jftFV = new JTextField(15);

    public double nVest,yearsd, air, futureV;
    public JMenuItem oprCal, oprExit, helpAb;

    public static void main(String[] args) {
        FutureValue frame = new FutureValue();
        frame.setTitle("FutureValue.java by Cole Proffitt");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public FutureValue(){
        JPanel main = new JPanel();
        JPanel btnPanel = new JPanel();

        jftFV.setEditable(false);

        JButton jbtCal = new JButton("Calculate");
        jbtCal.setMnemonic('C');
        jbtCal.setToolTipText("ALT + C");

        JMenuBar jMenuBr = new JMenuBar();
        setJMenuBar(jMenuBr);

        JMenu operationMenu = new JMenu("Operation");
        operationMenu.setMnemonic('O');
        operationMenu.setToolTipText("ALT + O");
        jMenuBr.add(operationMenu);

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('H');
        helpMenu.setToolTipText("ALT + H");
        jMenuBr.add(helpMenu);

        operationMenu.add(oprCal = new JMenuItem("Calc", 'Y'));
        operationMenu.add(oprExit = new JMenuItem("EXIT", 'E'));

        helpMenu.add(helpAb = new JMenuItem("Help", 'A'));

        main.setLayout(new GridLayout(4,2));

        main.add(new JLabel("Investment Amount"));
        main.add(jftInvAm);
        main.add(new JLabel("Years"));
        main.add(jftYears);
        main.add(new JLabel("Annual Interest Rate"));
        main.add(jftAIR);
        main.add(new JLabel("Future Value"));
        main.add(jftFV);

        getContentPane().add(main, BorderLayout.CENTER);
        getContentPane().add(jbtCal, BorderLayout.SOUTH);

        oprCal.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,ActionEvent.CTRL_MASK));
        oprExit.setAccelerator((KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK)));
        helpAb.setAccelerator((KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK)));

        jbtCal.addActionListener(this);
        oprCal.addActionListener(this);
        oprExit.addActionListener(this);
        helpAb.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if(e.getSource() instanceof JButton){
            nVest = Double.parseDouble(jftInvAm.getText().trim());
            yearsd = Double.parseDouble(jftYears.getText().trim());
            air = Double.parseDouble(jftAIR.getText().trim());

            futureV = calc(nVest, yearsd, air, futureV);
            String out = String.format("$%.2f", futureV);
            jftFV.setText(out.toString());
        }
        if(e.getSource() == helpAb){

            JOptionPane.showMessageDialog(null, "FutureValue.java\nCole Proffitt\nDue:" +
                    "4/20/17\nDescription:\nTakes the values of your investment, years,\n annual interest rate" +
                    "\nthen calculates your future value.\nAlong with a menu for ease of use."
                    , "Math-171 Lab 13A", JOptionPane.INFORMATION_MESSAGE);


        }
        if(e.getSource() == oprCal){
            nVest = Double.parseDouble(jftInvAm.getText().trim());
            yearsd = Double.parseDouble(jftYears.getText().trim());
            air = Double.parseDouble(jftAIR.getText().trim());

            futureV = calc(nVest, yearsd, air, futureV);

            String out = String.format("$%.2f",futureV);

            jftFV.setText(out.toString());

        }
        if(e.getSource() == oprExit){
            System.exit(0);
        }
    }
    public double calc(double invest, double years, double rate, double fv){
        rate /= 1200;
        fv = invest * Math.pow(1 + rate, years *12);
        return fv;
    }
}
