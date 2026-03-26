package Lab10;

import javax.swing.*;
import java.awt.*;

public class Regform {
    public static void main(String[] args){
        JFrame j = new JFrame("Registration Form");
        j.setSize(350,400);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(new FlowLayout());

        ImageIcon I = new ImageIcon("user.png");
        JLabel imgLabel = new JLabel(I);
        j.add(imgLabel);

        j.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(20);
        j.add(nameField);

        j.add(new JLabel("Address:"));
        JTextArea addressArea = new JTextArea(3, 20);
        j.add(addressArea);

        j.add(new JLabel("Gender:"));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        j.add(male);
        j.add(female);

        j.add(new JLabel("Hobbies:"));
        JCheckBox r = new JCheckBox("Reading");
        JCheckBox s = new JCheckBox("Sports");
        j.add(r);
        j.add(s);

        JButton submit = new JButton("Submit");
        j.add(submit);

        j.setVisible(true);
    }
}