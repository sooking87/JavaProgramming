package Chap9;

import java.awt.*;

public class DrawRandomRecByAwt {
    Frame frame;
    Label label;

    public DrawRandomRecByAwt() {
        frame = new Frame("Random Labels");
        frame.setLayout(null); // 지정 좌표에 점을 찍을 것이기 때문에 배치관리자를 없애줌

        for (int i = 0; i < 20; i++) {
            label = new Label();
            int x = (int) (Math.random() * 200) + 50;
            int y = (int) (Math.random() * 200) + 50;
            System.out.println(x + ", " + y);
            label.setLocation(x, y);
            label.setSize(10, 10);
            label.setBackground(Color.blue); // jlabel.setOpaque(true); jlagel.setBackground(Color.blue);
            frame.add(label);
        }
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new DrawRandomRecByAwt();
    }
}
