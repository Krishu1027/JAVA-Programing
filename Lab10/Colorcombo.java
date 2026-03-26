package Lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Colorcombo implements ActionListener {
    JComboBox<Integer> red, green, blue;
    JButton btn;
    JPanel panel;
    Colorcombo() {

        JFrame f = new JFrame("My Frame");
        f.setSize(500,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        JLabel r = new JLabel("Red");
        r.setForeground(Color.RED);
        JLabel g = new JLabel("Green");
        g.setForeground(Color.GREEN);
        JLabel b = new JLabel("Blue");
        b.setForeground(Color.BLUE);

        Integer values[] = new Integer[256];
        for(int i=0;i<256;i++)
            values[i] = i;

        red = new JComboBox<>(values);
        green = new JComboBox<>(values);
        blue = new JComboBox<>(values);

        btn = new JButton("Show Output");
        btn.addActionListener(this);

        panel.add(r);
        panel.add(red);
        panel.add(b);
        panel.add(blue);
        panel.add(g);
        panel.add(green);
        panel.add(btn);

        f.add(panel);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int rv = (Integer) red.getSelectedItem();
        int gv = (Integer) green.getSelectedItem();
        int bv = (Integer) blue.getSelectedItem();
        Color c = new Color(rv, gv, bv);
        panel.setBackground(c);
    }

    public static void main(String[] args) {
        new Colorcombo();
    }
}