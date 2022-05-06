package Chap12;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx2 extends JFrame {
    private MyPanel panel = new MyPanel();

    public GraphicsDrawImageEx2() {
        setTitle("패널의 크기에 맞추아 이미지 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);

        setSize(200, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("./images/dog2.png");
        private Image img = icon.getImage();

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawImageEx2();
    }
}
