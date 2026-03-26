package Lab13;

import javax.swing.*;
import java.awt.*;
public class MultiImage extends JFrame implements Runnable{
    JLabel il,ml;
    JButton b1,b2;

    ImageIcon i1 = new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\JAVA-Programing\\Lab13\\TREE.png");
    ImageIcon i2 = new ImageIcon("i2.png");
    ImageIcon i3 = new ImageIcon("i3.png");

    ImageIcon currentimage = i1;

    String[] messages = {"Welcome", "Enjoy", "Thanks", "Visit Again"};
    int msgIndex = 0;

    public MultiImage(){
        setTitle("Animation");
        setSize(400,250);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);

        il = new JLabel(currentimage);
        il.setBounds(160,10,80,80);
        add(il);

        ml = new JLabel("Welcome", JLabel.CENTER);
        ml.setBounds(120, 90, 150, 30);
        add(ml);

        b1 = new JButton("Previous Image");
        b1.setBounds(80,140,120,25);
        add(b1);

        b2 = new JButton("Next Image");
        b2.setBounds(210, 140, 120, 25);
        add(b2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        new Thread(this).start();
    }
    public void run(){
        while (true) {
            if (currentimage == i1)
                currentimage = i2;
            if (currentimage == i2)
                currentimage = i3;
            else
                currentimage = i1;
            msgIndex = (msgIndex + 1) % messages.length;
            SwingUtilities.invokeLater(() -> {
                il.setIcon(currentimage);
                ml.setText(messages[msgIndex]);
            });
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new MultiImage();
    }
}