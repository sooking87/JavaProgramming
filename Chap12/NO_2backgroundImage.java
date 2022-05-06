package Chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NO_2backgroundImage {
    private MyPanel panel = new MyPanel();
    private JFrame jf = new JFrame();

    // 생성자
    public NO_2backgroundImage() {
        jf.setTitle("NO.2");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setContentPane(panel);

        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    // 내부 클래스 : MyPanel
    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("./images/dog4.png");
        private Image img = icon.getImage();
        int x, y;

        public void paintComponent(Graphics g) {
            super.paintComponent(g); // super = JPanel, paintComponent -> 이거 없으면 안그려짐

            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

            this.addMouseMotionListener(new MouseAdapter() {
                public void mouseDragged(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                    repaint();
                }
            });
            g.setColor(Color.GREEN);
            g.fillOval(x, y, 20, 20);

        }
    }

    public static void main(String[] args) {
        new NO_2backgroundImage();
    }
}
