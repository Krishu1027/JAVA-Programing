package Lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorListGUI implements ActionListener {
    JList<String> list;
    JButton btn;
    JPanel panel;
    ColorListGUI() {
        JFrame f = new JFrame("My frame");
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.BLUE);

        String colors[] = {"white","orange","red","blue"};
        list = new JList<>(colors);
        list.setVisibleRowCount(4);

        btn = new JButton("Click");
        btn.addActionListener(this);

        panel.add(list);
        panel.add(btn);

        f.add(panel);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String c = list.getSelectedValue();
        if(c.equals("white"))
            panel.setBackground(Color.WHITE);
        else if(c.equals("orange"))
            panel.setBackground(Color.ORANGE);
        else if(c.equals("red"))
            panel.setBackground(Color.RED);
        else if(c.equals("blue"))
            panel.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new ColorListGUI();
    }
}