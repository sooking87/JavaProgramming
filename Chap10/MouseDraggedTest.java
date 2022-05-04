package Chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDraggedTest extends MouseAdapter {
    JFrame jf;
    Container c;

    public MouseDraggedTest() {
        jf = new JFrame("드래깅동안 YELLOW");
        c = jf.getContentPane();
        c.addMouseListener(this);
        c.addMouseMotionListener(this);

        c.setBackground(Color.GREEN);
        jf.setSize(300, 200);
        jf.setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        c.setBackground(Color.YELLOW);
    }

    public void mouseReleased(MouseEvent e) {
        c.setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        new MouseDraggedTest();
    }
}
