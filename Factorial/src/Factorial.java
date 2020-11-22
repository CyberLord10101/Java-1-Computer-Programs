import javax.swing.*;

public class Factorial {
    public Factorial(){
        JFrame frame = new JFrame("Factorial");

        JPanel panel = new JPanel();

        JButton one = new JButton();
        JButton two = new JButton();
        JButton three = new JButton();
        JButton four = new JButton();
        JButton five = new JButton();
        JButton six= new JButton();
        JButton seven = new JButton();
        JButton eight = new JButton();
        JButton nine = new JButton();

        JTextField tField = new JTextField(20);

        JLabel label = new JLabel();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setFocusable(true);

        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(tField);

        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight.setText("8");
        nine.setText("9");




        frame.add(panel);

    }




    public static void main(String[] args) {
        new Factorial();
	    int faInt = 5;
        System.out.println(factorial(9));
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
