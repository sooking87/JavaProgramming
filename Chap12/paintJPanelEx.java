package Chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class paintJPanelEx extends JFrame {
    private MyPanel panel = new MyPanel();

    public paintJPanelEx() {
        setTitle("JPanel의 paintComponent() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel); // 생성한 panel 패널을 컨텐트팬으로 사용.
        setSize(250, 220);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g); // JPanel의 paintComponent() 호출 -> 패널 내에 이전에 그려진 잔상을 지우기 위해 호출 ?
            g.setColor(Color.RED);
            g.drawRect(10, 10, 50, 50);
            g.drawRect(50, 50, 50, 50);
            g.setColor(Color.MAGENTA);
            g.drawRect(90, 90, 50, 50);
        }
    }

    public static void main(String[] args) {
        new paintJPanelEx();
    }
}