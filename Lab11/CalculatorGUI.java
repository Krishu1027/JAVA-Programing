package Lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI implements ActionListener {
    JTextField t;
    String num1="", num2="", op="";
    JFrame f;
    CalculatorGUI() {
        f = new JFrame("CALCULATOR");
        f.setSize(250,300);
        f.setLayout(new GridLayout(5,4));

        t = new JTextField();
        f.add(t);
        String btn[] = {
                "1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "/","0","%","=",
                "OFF"
        };
        for(String b : btn){
            JButton bt = new JButton(b);
            bt.addActionListener(this);
            f.add(bt);
        }
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.matches("[0-9]")){
            t.setText(t.getText()+s);
        }
        else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%")){
            num1 = t.getText();
            op = s;
            t.setText("");
        }
        else if(s.equals("=")){
            num2 = t.getText();
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int r = 0;

            if(op.equals("+")) r = a+b;
            if(op.equals("-")) r = a-b;
            if(op.equals("*")) r = a*b;
            if(op.equals("/")) r = a/b;
            if(op.equals("%")) r = a%b;

            t.setText(String.valueOf(r));
        }
        else if(s.equals("OFF")){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}