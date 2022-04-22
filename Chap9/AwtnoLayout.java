package Chap9;

import java.awt.*;

public class AwtnoLayout {
    Frame f;
    Button bt1;
    Button bt2;
    Label comment;

    public AwtnoLayout() {
        f = new Frame();
        f.setTitle("BorderLayout Practice");
        f.setLayout(null);
        bt1 = new Button("Test1");
        bt2 = new Button("Test2");
        comment = new Label("comment");
        bt1.setSize(80, 50);
        bt1.setLocation(20, 20);
        bt2.setBounds(100, 100, 90, 70);
        comment.setBounds(50, 50, 200, 300);

        f.add(bt1);
        f.add(bt2);
        f.add(comment);

        f.setSize(300, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtnoLayout();
    }
}
