import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Survey extends JFrame implements ActionListener{

    private JButton next, previous, submit;
    private JRadioButton rbD,rbJ,rbB;
    private JPanel first, bottom, second, third, fourth,fifth;
    private JTextArea jta1;
    private static JPanel cardPanel;
    private JCheckBox demCB, rebCB;
    private JComboBox comboBox;
    private ButtonGroup bg;
    private CardLayout c;
    private JLabel jl;


    public Survey(){
        //Sets the title and the layout for the frame
        super("Survey");
        setLayout(new BorderLayout());

        //Creates the Cardlayout obj and panel obj then adds the CardLayout to the panel
        c = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(c);

        
        //Adds five different panels with there own layouts
        first = new JPanel();
        first.setName("Wow");
        first.setLayout(new GridLayout(2,1));

        second = new JPanel();
        second.setLayout(new GridLayout(3,1));

        third = new JPanel();
        third.setLayout(new FlowLayout());

        fourth = new JPanel();
        fourth.setLayout(new FlowLayout());

        fifth = new JPanel();
        fifth.setLayout(new FlowLayout());
        //Adds each new panel above to the master Cardpanel with a layout of border
        cardPanel.add(first);
        cardPanel.add(second);
        cardPanel.add(third);
        cardPanel.add(fourth);
        cardPanel.add(fifth);

        //Creates the bottom button panel, then creates and adds two buttons to the button panel
        bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,2));
        previous = new JButton("Previous");
        next = new JButton("Next");
        bottom.add(previous);
        bottom.add(next);

        //Creates a submit button to add all the details of the survey to the console
        submit = new JButton("Submit");
        //Creates a button group to add the following radio buttons to
        bg = new ButtonGroup();

        //Creates three Radio buttons
        rbD = new JRadioButton("Donald Trump");
        rbJ = new JRadioButton("Joe Biden");
        rbB = new JRadioButton("Bernie");

        //Adds the three Radio buttons to the button group
        bg.add(rbD);
        bg.add(rbJ);
        bg.add(rbB);

        //Creates the checkboxes that will be added to the first panel
        demCB = new JCheckBox("Democrat");
        demCB.setName("Democrat");
        demCB.addActionListener(this);
        rebCB = new JCheckBox("Republican");
        rebCB.addActionListener(this);


        //Sets a text area that can wrap and has a label at the top that says Comments
        jta1 = new JTextArea(10,28);
        jta1.setLineWrap(true);
        jta1.setWrapStyleWord(true);

        jl = new JLabel("Comments:");

        String[] names = {"Hey","You"};
        //Creates a combo box
        comboBox = new JComboBox(names);


        next.addActionListener(this);
        previous.addActionListener(this);
        submit.addActionListener(this);

        //Adds all the components to the panels with each panel having its own individual layout
        first.add(demCB);
        first.add(rebCB);

        second.add(rbD);
        second.add(rbJ);
        second.add(rbB);

        third.add(jl);
        third.add(jta1);

        fourth.add(comboBox);

        fifth.add(submit);

        //Adds the panels to the frame to be seen on the GUI
        add(cardPanel,BorderLayout.NORTH);
        add(bottom, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next  ){
            c.next(cardPanel);
        }else if(e.getSource() == previous) {
            c.previous(cardPanel);
        }else if(e.getActionCommand() == "Submit"){
            getParty();
            System.out.println(this);
        }


    }
    @Override
    public String toString(){


        return String.format("Party: %s , President %s , Comment: %s ",getParty(),"Hel","what" );
    }

    public static void main(String[] args) {
        Survey s = new Survey();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setLocationRelativeTo(null);
        s.setSize(300,300);
        s.setVisible(true);

    }
    public String getParty(){
        if(rebCB.isSelected() && demCB.isSelected()){
            return "Republican and Democrat = Independent";
        }else if(rebCB.isSelected()){
            return "Republican";
        }else if(demCB.isSelected()){
            return "Democrat";
        }else{
            return "Please give an input for your party";
        }
    }

}
