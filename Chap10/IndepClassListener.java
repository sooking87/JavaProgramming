package Chap10;
//독립 클래스로 Action 이벤트 리스너 작성

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
    public IndepClassListener() {
        // 컨테이너 설정
        setTitle("Action Event Listener Exam");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 버튼 생성, 컨테이너에 붙히기
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); // 버튼에 actionListener를 달기
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}

// 독립된 클래스로 이벤트 리스너 작성
class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource(); // 이벤트 소스를 알아내기
        if (b.getText().equals("Action")) { // 버튼의 문자열이 Action 인지를 비교
            b.setText("액션"); // 버튼의 문자열을 "액션"으로 변경
        } else {
            b.setText("Action");
        }
    }
}
