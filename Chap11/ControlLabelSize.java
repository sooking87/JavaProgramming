package Chap11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ControlLabelSize {
    JFrame jf;
    Container c;
    JLabel jl;
    Font font;
    JSlider js;

    public ControlLabelSize() {
        // 컨테이너 생성
        jf = new JFrame("JSlider Practice Frame");
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        // 슬라이더 생성
        js = new JSlider(JSlider.HORIZONTAL, 1, 100, 50);
        js.setPaintLabels(true);
        js.setPaintTicks(true);
        js.setPaintTrack(true);
        js.setMajorTickSpacing(20);
        js.setMinorTickSpacing(5);
        c.add(js, BorderLayout.NORTH);

        // 슬라이더에 Change 리스터 등록
        js.addChangeListener(new ControlSize());

        // 레이블 생성
        jl = new JLabel("I Love Java", JLabel.CENTER);
        c.add(jl, BorderLayout.CENTER);

        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    // Change 리스너 구현
    class ControlSize implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            int size = js.getValue();
            System.out.println(size);

            font = jl.getFont();
            int fontSize = font.getSize();

            if (fontSize >= 1 && fontSize <= 100) {
                Font afterFont = new Font(font.getName(), font.getStyle(), size);
                jl.setFont(afterFont);
            }

        }
    }

    public static void main(String[] args) {
        new ControlLabelSize();
    }

}
