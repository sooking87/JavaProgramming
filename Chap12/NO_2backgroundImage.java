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

            // MyPanel에 마우스 리스너 등록
            // MouseAdapter : 필요한 메소드만 오버라이딩 가능
            this.addMouseMotionListener(new MouseAdapter() {
                public void mouseDragged(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                    repaint(); // 컴포넌트의 모양, 텍스트, 크기, 색 등을 변경하는 경우, 변경 사항을 윈도우에 그리기 위해 호출 필요
                }
            });
            g.setColor(Color.GREEN);
            g.fillOval(x, y, 20, 20);
            // 원은 마우스가 가리키는 x, y에 그려져야된다.

        }
    }

    public static void main(String[] args) {
        new NO_2backgroundImage();
    }
}
