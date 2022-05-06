package Chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EnterLeftKey extends KeyAdapter {
    JFrame jf;
    Container c;
    JLabel jl;
    String text = "Love Java";
    StringBuffer sb = new StringBuffer(text);

    public EnterLeftKey() {
        // set Container
        jf = new JFrame("Left 키로 문자열 교체");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        // set JLabel
        jl = new JLabel(text, JLabel.CENTER);
        c.add(jl, BorderLayout.NORTH);

        // add KeyListener
        c.addKeyListener(this);

        jf.setSize(300, 200);
        jf.setVisible(true);

        // Force focus to allow contentpans to receive keystrokes
        jl.setFocusable(true);
        c.requestFocus();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 37) { // e.getKeyCode()==KeyEvent.VK_LEFT
            String getText = jl.getText();
            System.out.println("OH");
            if (getText.equals("Love Java")) {
                System.out.println(getText);
                sb.reverse();
                String setText = sb.toString();
                jl.setText(setText);
            } else {
                jl.setText(text);
                System.out.println("yes");
            }
        }
    }

    public static void main(String[] args) {
        new EnterLeftKey();
    }
}
