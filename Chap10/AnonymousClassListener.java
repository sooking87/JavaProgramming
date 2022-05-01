package Chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener {
    JFrame jf;
    Container c;
    JButton btn;

    public AnonymousClassListener() {
        jf = new JFrame("Write Action Event Listener");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(new FlowLayout());
        btn = new JButton("Action");
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                if (b.getText().equals("Action"))
                    b.setText("Ready");
                else
                    b.setText("Action");

                jf.setTitle(b.getText());
            }
        });

        jf.setSize(350, 150);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousClassListener();
    }
}
