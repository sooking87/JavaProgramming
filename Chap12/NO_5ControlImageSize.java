package Chap12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NO_5ControlImageSize {
    private JFrame jf = new JFrame();
    private MyPanel panel = new MyPanel();

    public NO_5ControlImageSize() {
        jf.setTitle("그래믹 이미지 혹대 축소 연습");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setContentPane(panel);

        jf.setSize(500, 500);
        jf.setVisible(true);

        panel.setFocusable(true);
        panel.requestFocus();
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("./images/dog5.png");
        private Image img = icon.getImage();
        int width = 50;
        int height = 50;

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            this.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    int keyChar = e.getKeyChar();
                    if (keyChar == '+') {
                        width = (int) (width * 1.1);
                        height = (int) (height * 1.1);

                    } else if (keyChar == '-') {
                        width = (int) (width * 0.9);
                        height = (int) (height * 0.9);
                    }
                    repaint();
                }
            });
            g.drawImage(img, 10, 10, width, height, this); // 원본 크기로 그리라고 했는데, 원본 크기가 넘 커서 50, 50으로 그렸어요!

        }
    }

    public static void main(String[] args) {
        new NO_5ControlImageSize();
    }
}
