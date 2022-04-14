package Chap9;

import java.awt.*;

public class makeDotwithAwt {
    Frame frame;
    Panel top, mid, bottom;
    Button open, close, exit, input;
    TextField inputBox;
    Label label;

    public makeDotwithAwt() {
        frame = new Frame("여러 개의 패널을 가진 프레임");
        frame.setLayout(new BorderLayout());
        top = new Panel();
        mid = new Panel();
        bottom = new Panel();

        // 상단 패널 만들기
        open = new Button("열기");
        close = new Button("닫기");
        exit = new Button("나가기");

        top.add(open); // Panel 디폴트 flowLayout
        top.add(close);
        top.add(exit);
        top.setBackground(Color.lightGray);

        mid.setLayout(null);
        // 중간 패널 만들기
        for (int i = 0; i < 10; i++) {
            label = new Label("*");
            int x = (int) (Math.random() * 300) + 50;
            int y = (int) (Math.random() * 300) + 50;
            System.out.println(x + ", " + y);
            // 6번은 되는데 왜 얘는 랜덤으로 안찍히지,,,,?
            label.setSize(10, 10);
            label.setLocation(x, y);
            label.setForeground(Color.red);
            mid.add(label);
        }

        // 하단 패널 만들기
        input = new Button("Word Input");
        inputBox = new TextField(20);
        bottom.add(input);
        bottom.add(inputBox);
        bottom.setBackground(Color.yellow);

        // 윈도우에 패널 붙히기
        frame.add(top, BorderLayout.NORTH);
        frame.add(mid, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new makeDotwithAwt();
    }

}
