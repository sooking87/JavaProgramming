package Chap11;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    public LabelEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane(); // 이거 왜 하는거임??????
        c.setLayout(new FlowLayout());

        JLabel textLabel = new JLabel("사랑합니다.");

        ImageIcon dog = new ImageIcon("./images.dog.png");
        JLabel label = new JLabel(dog);

        ImageIcon normalIcon = new ImageIcon("./images/dog2.png");
        JLabel joji = new JLabel("귀여운 강아지 조지", normalIcon, SwingConstants.RIGHT);

        c.add(textLabel);
        c.add(label);
        c.add(joji);

        setSize(400, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelEx();
    }
}
