package Chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDraggedTest extends MouseAdapter {
    JFrame jf;
    Container c;

    public MouseDraggedTest() {
        // set Container
        jf = new JFrame("While Dragging set Color with YELLOW");
        c = jf.getContentPane();
        c.setBackground(Color.GREEN);

        // add MouseListener and MouseMotionListener
        c.addMouseListener(this);
        c.addMouseMotionListener(this);

        jf.setSize(300, 200);
        jf.setVisible(true);
    }

    // Calls this Function while dragging
    public void mouseDragged(MouseEvent e) {
        c.setBackground(Color.YELLOW);
    }

    // Calls this Function after Dragging
    public void mouseReleased(MouseEvent e) {
        c.setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        new MouseDraggedTest();
    }
}
