package Chap9;

import javax.swing.*;
import java.awt.*;

public class exam1 extends JFrame {
    public exam1() {
        setTitle("BorderLayout Practice");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);

        JButton bt1 = new JButton("Test1");
        JButton bt2 = new JButton("Test2");
        bt1.setSize(80, 50);
        bt1.setLocation(20, 20);

        bt2.setBounds(100, 100, 90, 70);

        cp.add(bt1);
        cp.add(bt2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new exam1();
    }

}
