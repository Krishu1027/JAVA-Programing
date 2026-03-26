package Lab12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PersonalLifeManager {

    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {
    CardLayout card = new CardLayout();
    JPanel JP = new JPanel(card);
    public MyFrame() {
        setTitle("Life Manager");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton taskBtn = new JButton("Tasks");
        JButton habitBtn = new JButton("Habits");
        JButton quoteBtn = new JButton("Quotes");

        JPanel menu = new JPanel();
        menu.add(taskBtn);
        menu.add(habitBtn);
        menu.add(quoteBtn);

        JP.add(taskPanel(), "task");
        JP.add(habitPanel(), "habit");
        JP.add(quotePanel(), "quote");

        taskBtn.addActionListener(e -> card.show(JP, "task"));
        habitBtn.addActionListener(e -> card.show(JP, "habit"));
        quoteBtn.addActionListener(e -> card.show(JP, "quote"));

        add(menu, BorderLayout.NORTH);
        add(JP, BorderLayout.CENTER);

        setVisible(true);
    }

    JPanel taskPanel() {
        JPanel p = new JPanel();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);

        JTextField text = new JTextField(10);
        JButton add = new JButton("Add");

        add.addActionListener(e -> {
            listModel.addElement(text.getText());
            text.setText("");
        });

        p.add(text);
        p.add(add);
        p.add(new JScrollPane(list));

        return p;
    }

    JPanel habitPanel() {
        JPanel p = new JPanel();
        p.add(new JCheckBox("Exercise"));
        p.add(new JCheckBox("Reading"));
        p.add(new JCheckBox("Study"));
        return p;
    }

    JPanel quotePanel() {
        JPanel p = new JPanel(new BorderLayout());

        String[] quotes = {
                "Believe in yourself",
                "Stay positive",
                "Work hard, dream big",
                "Never give up",
                "Success takes time"
        };

        JLabel quoteLabel = new JLabel("Click button for a quote", SwingConstants.CENTER);
        JButton generate = new JButton("Get Quote");

        Random r = new Random();

        generate.addActionListener(e -> {
            int i = r.nextInt(quotes.length);
            quoteLabel.setText(quotes[i]);
        });

        p.add(quoteLabel, BorderLayout.CENTER);
        p.add(generate, BorderLayout.SOUTH);

        return p;
    }
}