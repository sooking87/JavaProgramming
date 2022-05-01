package Chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

public class MouseAdapterEx extends JFrame {
    JLabel la = new JLabel("Hello");

    public MouseAdapterEx() {
        setTitle("Mouse Event Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseAdapter()); // 컨테이너팬에 Mouse 이벤트 리스너 달기

        c.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        c.add(la);

        setSize(250, 250);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new MouseAdapterEx();
    }
}
