package Chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventTest extends MouseAdapter {

    JFrame jf;
    Container c;
    JLabel jl;

    public MouseEventTest() {
        jf = new JFrame();
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());
        jl = new JLabel("Love Java", JLabel.CENTER);
        jf.addMouseListener(this);

        c.add(jl, BorderLayout.NORTH);
        jf.setSize(300, 300);
        jf.setVisible(true);

    }

    public void mouseEntered(MouseEvent e) {
        jl.setText("Love Java");
    }

    public void mouseExited(MouseEvent e) {
        jl.setText("사랑해");
    }

    public static void main(String[] args) {
        new MouseEventTest();
    }
}
