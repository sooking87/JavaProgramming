package Chap12;

import java.awt.*;
import javax.swing.*;

public class NO_9ControlString {
    private JFrame jf = new JFrame("Blue Label 만들기");
    private JPanel panel = new JPanel();

    public NO_9ControlString() {
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyLabel l1 = new MyLabel("Hello");
        MyLabel l2 = new MyLabel("Big Hello", 50);

        panel.add(l1);
        panel.add(l2);
        jf.add(panel);

        jf.setSize(400, 300);
        jf.setVisible(true);
    }

    // JPanel은 생성자에 문자열을 설정하는 생성자가 없다. -> JLabel 이용
    class MyLabel extends JLabel {

        // 생성자1
        public MyLabel(String str) {
            super(str);
            this.setOpaque(true); // 객체에 배경색을 주기 위해 true로 미리 설정을 해놓아야 된다.
            this.setFont(new Font("Arial", Font.PLAIN, 10));
            this.setForeground(Color.WHITE); // 글자색
            this.setBackground(Color.RED); // 배경색
        }

        // 생성자2
        public MyLabel(String str, int size) {
            super(str);
            this.setOpaque(true);
            this.setFont(new Font("Arial", Font.ITALIC, size));
            this.setForeground(Color.PINK);
            // this.setBackground(Color.BLUE);

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.setBackground(Color.BLUE); // 그리는 라벨의 배경색은 모두 파란색
            repaint(); // 컴포넌트의 모양, 텍스트, 크기, 색 등을 변경하는 경우, 변경 사항을 윈도우에 그리기 위해 호출 필요
        }
    }

    public static void main(String[] args) {
        new NO_9ControlString();
    }

}
