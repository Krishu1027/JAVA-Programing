package Lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JTextField t1, t2, t3;
    JButton add, sub, mul, reset;
    Calculator() {
        JFrame f = new JFrame("My Calc");
        f.setSize(450,200);
        f.setLayout(new GridLayout(3,4,10,10));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.add(new JLabel("Enter the 1st No.:"));
        t1 = new JTextField();
        f.add(t1);

        add = new JButton("+");
        f.add(add);

        sub = new JButton("-");
        f.add(sub);

        f.add(new JLabel("Enter the 2nd No.:"));
        t2 = new JTextField();
        f.add(t2);

        mul = new JButton("x");
        f.add(mul);

        reset = new JButton("reset");
        f.add(reset);

        f.add(new JLabel("result:"));
        t3 = new JTextField();
        f.add(t3);

        f.add(new JLabel(""));
        f.add(new JLabel(""));

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        reset.addActionListener(this);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==reset){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            return;
        }
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int r = 0;
        if(e.getSource()==add) r = a + b;
        if(e.getSource()==sub) r = a - b;
        if(e.getSource()==mul) r = a * b;

        t3.setText(String.valueOf(r));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}