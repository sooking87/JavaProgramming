package Chap14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculate {
    JFrame jf;
    MyDialog dialog;
    JLabel text;
    JButton cal;
    int num1, num2, result;

    public Calculate() {
        // 컨테이너 만들기
        jf = new JFrame("다이얼로그 만들기");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BorderLayout());

        JPanel jp = new JPanel(); // 메인 화면에서 버튼과 라벨을 붙힐 패널
        // MyDialog, 버튼, 라벨 객체 생성
        cal = new JButton("Calculate");
        dialog = new MyDialog(jf, "Calculation Dialog");
        text = new JLabel("계산 결과 출력");
        text.setBackground(Color.GREEN);

        // 패널에 버튼과 라벨을 붙힌다(JFrame 화면에 나와있는 것처럼)
        jp.add(cal);
        jp.add(text);

        // 버튼이 클릭 되었을 때 다이얼로그가 떠야되므로 버튼에 이벤트 리스너 등록
        cal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true); // 버튼을 클릭하면 다이얼로그를 보이게(true) 한다.
            }
        });

        jf.getContentPane().add(jp, BorderLayout.NORTH);
        jf.setSize(400, 300);
        jf.setVisible(true);

    }

    class MyDialog extends JDialog {
        // 다이얼로그 컴포넌트들
        JLabel msg = new JLabel("두 수를 더합니다.");
        JTextField input1 = new JTextField(20);
        JTextField input2 = new JTextField(20);
        JButton add = new JButton("Add");

        JPanel center = new JPanel();

        public MyDialog(JFrame frame, String title) {
            super(frame, title);
            setLayout(new BorderLayout());

            // 다이얼로그에 생성했던 컴포넌트들을 붙힌다.
            center.add(msg);
            center.add(input1);
            center.add(input2);
            center.add(add);
            add(center, BorderLayout.CENTER);

            // 다이얼로그 화면의 크기
            setSize(300, 300);

            // add 버튼이 눌리면 이벤트가 처리되어야 하므로 add 버튼에 이벤트 리스너 등록
            add.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    num1 = Integer.parseInt(input1.getText()); // 문자열 -> 정수형
                    num2 = Integer.parseInt(input2.getText()); // 문자열 -> 정수형

                    result = num1 + num2;
                    text.setText(Integer.toString(result)); // 정수형 -> 문자열
                    setVisible(false);
                }
            });
        }
    }

    public static void main(String[] args) {
        new Calculate();
    }
}
