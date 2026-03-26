package Lab12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class LifeManager {
    CardLayout cl = new CardLayout();
    JPanel main = new JPanel(cl);
    DefaultListModel<String> tasks = new DefaultListModel<>();
    String[] quotes = {"Stay positive!", "Work hard!", "Believe in yourself!", "Never give up!"};
    public LifeManager() {
        JFrame f = new JFrame("Life Manager");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel dash = new JPanel(new GridLayout(4,1));
        JButton taskBtn = new JButton("Tasks");
        JButton habitBtn = new JButton("Habits");
        JButton quoteBtn = new JButton("Quotes");

        dash.add(new JLabel("Dashboard",SwingConstants.CENTER));
        dash.add(taskBtn);
        dash.add(habitBtn);
        dash.add(quoteBtn);

        JPanel task = new JPanel(new BorderLayout());
        JTextField field = new JTextField();
        JList<String> list = new JList<>(tasks);
        JButton add = new JButton("Add");
        JButton back1 = new JButton("Back");

        add.addActionListener(e->{ if(!field.getText().isEmpty()) tasks.addElement(field.getText()); field.setText("");});
        back1.addActionListener(e->cl.show(main,"dash"));

        task.add(field,BorderLayout.NORTH);
        task.add(new JScrollPane(list),BorderLayout.CENTER);

        JPanel tb = new JPanel();
        tb.add(add); tb.add(back1);
        task.add(tb,BorderLayout.SOUTH);

        JPanel habit = new JPanel(new GridLayout(5,1));
        habit.add(new JCheckBox("Exercise"));
        habit.add(new JCheckBox("Reading"));
        habit.add(new JCheckBox("Meditation"));
        habit.add(new JCheckBox("Study"));
        JButton back2 = new JButton("Back");
        habit.add(back2);

        back2.addActionListener(e->cl.show(main,"dash"));

        JPanel quote = new JPanel(new BorderLayout());
        JLabel q = new JLabel("Click for quote",SwingConstants.CENTER);
        JButton gen = new JButton("Generate");
        JButton back3 = new JButton("Back");

        gen.addActionListener(e->{
            Random r=new Random();
            q.setText(quotes[r.nextInt(quotes.length)]);
        });

        JPanel qb = new JPanel();
        qb.add(gen); qb.add(back3);

        quote.add(q,BorderLayout.CENTER);
        quote.add(qb,BorderLayout.SOUTH);

        back3.addActionListener(e->cl.show(main,"dash"));

        main.add(dash,"dash");
        main.add(task,"task");
        main.add(habit,"habit");
        main.add(quote,"quote");

        taskBtn.addActionListener(e->cl.show(main,"task"));
        habitBtn.addActionListener(e->cl.show(main,"habit"));
        quoteBtn.addActionListener(e->cl.show(main,"quote"));

        f.add(main);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new LifeManager();
    }
}