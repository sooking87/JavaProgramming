package Chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class UseKeyListener {
    JFrame jf;
    Container c;
    JLabel message;
    Font f;

    public UseKeyListener() {
        jf = new JFrame("Use KeyListener");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());
        c.addKeyListener(new SizeUP());

        message = new JLabel("Love Java", JLabel.CENTER);
        message.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(message, BorderLayout.NORTH);

        jf.setSize(500, 300);
        jf.setVisible(true);

        // 이거 없으면 key가 인식이 안됨
        c.setFocusable(true);
        c.requestFocus();
    }

    class SizeUP extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyChar());
            f = message.getFont();
            int size = f.getSize();
            if (e.getKeyChar() == '+') {
                message.setFont(new Font("Arial", Font.PLAIN, size + 5));
            } else if (e.getKeyChar() == '-') {
                if (size > 5) {
                    message.setFont(new Font("Arial", Font.PLAIN, size - 5));
                }
            }
        }
    }

    public static void main(String[] args) {
        new UseKeyListener();
    }
}
