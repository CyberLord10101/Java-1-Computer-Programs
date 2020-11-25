import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class GUI extends JFrame {
    private final JTextField tf;
    private final Font pf;
    private final Font bf;
    private final Font itf;
    private final Font bif;
    private final JRadioButton pb;
    private final JRadioButton bb;
    private final JRadioButton ib;
    private final JRadioButton bib;
    private final ButtonGroup group;

    public GUI(){
        super("The Title");
        setLayout(new FlowLayout());

        tf = new JTextField("Bucky is awesome and hot", 25);
        add(tf);

        pb = new JRadioButton("Plain", true);
        bb = new JRadioButton("Bold", false);
        ib = new JRadioButton("Italic", false);
        bib = new JRadioButton("Bold and Italic", false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tf.setFont(pf);

        //wait for event to happen, pass in font object to constructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));

    }
    private class HandlerClass implements ItemListener{
        private final Font font;
        //the font object get variable font
        public HandlerClass(Font f){
            font = f;
        }
        //Sets the font to the font object that was past in
        @Override
        public void itemStateChanged(ItemEvent e) {
            tf.setFont(font);
        }
    }
}
