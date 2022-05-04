package Chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MoveMouse {
    private JLabel la = new JLabel("Mouse Event");
    JFrame jf;
    Container c; // 얘를 이용하여 윈도우에 컴포넌트를 붙힐 수 있다. awt에서 패널같은 개념?

    public MoveMouse() {
        jf = new JFrame("MouseMotionListener");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = jf.getContentPane(); // ?
        c.setLayout(new FlowLayout());

        DragMouse listener = new DragMouse();

        // 마우스 드래깅 이벤트를 처리하기위해서는 mouse 리스터와 모션 리스너를 둘다 등록해주어야 한다.
        // MouseListener 리스너 등록
        c.addMouseListener(listener);
        // MouseMotionListener 리스너 등록
        c.addMouseMotionListener(listener);

        c.add(la);
        c.setBackground(Color.GREEN);
        jf.setSize(300, 200);
        jf.setVisible(true);
    }

    class DragMouse implements MouseListener, MouseMotionListener {
        // 마우스가 드래깅되는 동안 계속 호출
        public void mouseDragged(MouseEvent e) {
            la.setText("MouseDragged (" + e.getX() + ", " + e.getY() + ")");
            c.setBackground(Color.YELLOW);
        }

        public void mouseMoved(MouseEvent e) {
            la.setText("MouseNODragged (" + e.getX() + ", " + e.getY() + ")");
            c.setBackground(Color.GREEN);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub

        }

    }

    public static void main(String[] args) {
        new MoveMouse();
    }
}
