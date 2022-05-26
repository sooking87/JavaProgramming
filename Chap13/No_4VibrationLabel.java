
package Chap13;

import java.awt.*;
import javax.swing.*;

class MoveLabel implements Runnable {
    private JLabel label;

    public MoveLabel(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            try {
                label.setLocation(label.getX() - 5, label.getY() - 5);
                label.setLocation(label.getX(), label.getY());
                label.setLocation(label.getX() + 5, label.getY() + 5);
                label.setLocation(label.getX(), label.getY());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class No_4VibrationLabel extends JFrame {
    JLabel label = new JLabel("A B C D E F U");
    MoveLabel f;

    public No_4VibrationLabel() {
        setTitle("4.2번");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        setSize(400, 400);
        setVisible(true);

        label.setLocation(this.getWidth() / 2 - 60, this.getWidth() / 2 - 50); // 배치 관리자가 null이니까 위치 설정
        label.setSize(130, 100);
        label.setFont(new Font("Gothic", Font.ITALIC, 15));
        this.add(label);

        f = new MoveLabel(label);
        Thread th = new Thread(f);

        th.start();
    }

    public static void main(String[] args) {
        new No_4VibrationLabel();
    }
}