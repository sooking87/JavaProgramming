package Chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventTest extends MouseAdapter {

    JFrame jf;
    Container c;
    JLabel jl;

    public MouseEventTest() {
        // set Container
        jf = new JFrame();
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        // set JLabel
        jl = new JLabel("Love Java", JLabel.CENTER);
        c.add(jl, BorderLayout.NORTH);

        // add MouseLisenter on MouseEventTest Class
        jf.addMouseListener(this);

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
