import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Survey extends JFrame{
    private JButton next, previous;
    private JRadioButton rbD,rbJ,rbB;
    private JPanel cardPanel,first, bottom, second, third, fourth,fifth;
    private JTextArea jta1;
    private JCheckBox demCB, rebCB;
    private ButtonGroup bg;
    private CardLayout c;


    public Survey(){

        super("Survey");

        setLayout(new BorderLayout());
        c = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(c);

        

        first = new JPanel();
        first.setLayout(new GridLayout(2,1));

        second = new JPanel();
        second.setLayout(new GridLayout(3,1));

        third = new JPanel();
        third.setLayout(new FlowLayout());

        fourth = new JPanel();
        fourth.setLayout(new FlowLayout());

        fifth = new JPanel();
        fifth.setLayout(new FlowLayout());

        cardPanel.add(first);
        cardPanel.add(second);
        cardPanel.add(third);
        cardPanel.add(fourth);
        cardPanel.add(fifth);

        bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,2));
        bg = new ButtonGroup();

        rbD = new JRadioButton("Donald Trump");
        rbJ = new JRadioButton("Joe Biden");
        rbB = new JRadioButton("Bernie");

        bg.add(rbD);
        bg.add(rbJ);
        bg.add(rbB);

        demCB = new JCheckBox("Democrat");
        rebCB = new JCheckBox("Republican");

        previous = new JButton("Previous");
        next = new JButton("Next");

        jta1 = new JTextArea();
        //jta1.setBounds(0, 0, 100, 100);


        Handlerclass h = new Handlerclass();
        next.addActionListener(h);
        previous.addActionListener(h);

        first.add(demCB);
        first.add(rebCB);

        second.add(rbD);
        second.add(rbJ);
        second.add(rbB);

        third.add(jta1);


        bottom.add(previous);
        bottom.add(next);



        add(cardPanel,BorderLayout.NORTH);
        add(bottom, BorderLayout.SOUTH);


    }
    private class Handlerclass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == next  ){
                c.next(cardPanel);
            }else if(e.getSource() == previous) {
                c.previous(cardPanel);
            }
        }
    }
    public static void main(String[] args) {
        Survey s = new Survey();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.pack();
        s.setSize(300,300);

    }

}
