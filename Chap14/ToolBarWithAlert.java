package Chap14;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class ToolBarWithAlert {
    JFrame jf;
    TextField input;

    JLabel grade;
    JToolBar toolBar;

    public ToolBarWithAlert() {
        jf = new JFrame("숫자가 아닌 키가 입력되는 경우 경고창 만들기");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        // 컴포넌트 생성
        toolBar = new JToolBar();
        input = new TextField();
        grade = new JLabel("학번");

        // 이벤트 리스너 등록
        input.addKeyListener(new MyKeyListener());

        // 툴바에 들어가야되는 학번, 입력창을 붙혀준다.
        toolBar.add(grade);
        toolBar.add(input);

        toolBar.setBackground(Color.LIGHT_GRAY);
        c.add(toolBar, BorderLayout.SOUTH);
        jf.setSize(300, 300);
        jf.setVisible(true);

        // 키 이벤트가 있으므로 포커스를 준다.
        c.setFocusable(true);
        c.requestFocus();

    }

    class MyKeyListener implements KeyListener {
        JOptionPane alert;

        public void keyTyped(KeyEvent e) {
            char keyChar = e.getKeyChar();
            if (!Character.isDigit(keyChar)) {
                e.consume(); // 키 입력을 무력화 시킨다.
                alert = new JOptionPane();
                String msg = keyChar + "은 숫자 키가 아닙니다. \n 숫자를 입력하세요";
                JOptionPane.showMessageDialog(jf, msg, "경고", JOptionPane.ERROR_MESSAGE);
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub

        }
    }

    public static void main(String[] args) {
        new ToolBarWithAlert();
    }
}
