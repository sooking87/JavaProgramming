package Chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class UseKeyListener {
    JFrame jf;
    Container c;
    JLabel message;
    Font f;

    public UseKeyListener() {
        jf = new JFrame("Use KeyListener");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        // key 리스너 등록
        c.addKeyListener(new SizeUP());

        message = new JLabel("Love Java", JLabel.CENTER);
        message.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(message, BorderLayout.NORTH);

        jf.setSize(500, 300);
        jf.setVisible(true);

        // key 이벤트의 경우 응용프로그램 내에 포커스를 가진 컴포넌트가 키 입력을 독점하여 포커스를 가진 컴포넌트에만 key 이벤트가 전달이
        // 됩니다.
        c.setFocusable(true); // 컴포넌트가 포커스를 받을 수 있도록 설정
        c.requestFocus(); // 컴포넌트에게 포커스르 주어 키 입력을 받을 수 있도록 함.
    }

    class SizeUP extends KeyAdapter {
        // 키를 누른 순간 크기 변화가 있어야 되므로 keyPressed 메소드를 사용해줍니다.
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyChar());

            f = message.getFont();
            int size = f.getSize();
            if (e.getKeyChar() == '+') {
                message.setFont(new Font("Arial", Font.PLAIN, size + 5));
            } else if (e.getKeyChar() == '-') {
                if (size > 5) {
                    message.setFont(new Font("Arial", Font.PLAIN, size - 5));
                }
            }
        }
    }

    public static void main(String[] args) {
        new UseKeyListener();
    }
}
