package Chap10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame {
    public InnerClassListener() {
        setTitle("InnerClass ActionListener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Aciton");
        btn.addActionListener(new MyActionListener());
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    // 내부 클래스로 Action 리스너 작성
    public class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("Action")) {
                b.setText("액션");
            } else {
                b.setText("Action");
            }

            InnerClassListener.this.setTitle(b.getText()); // 프레임의 타이틀에 버튼 문자열을 출력한다.
        }
    }

    public static void main(String[] args) {
        new InnerClassListener();
    }
}
