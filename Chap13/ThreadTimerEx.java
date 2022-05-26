package Chap13;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
    private JLabel timerLabel; // 타이머 값이 출력되는 레이블

    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel; // 타이머 카운트를 출력할 레이블
    }

    // 스레드 코드. run() 이 종료하면 스레드 종료
    @Override
    public void run() { // run() 은 스레드 코드로서 start() 메소드가 호출된 후 스레드가 실행을 시작하는 메소드이다.
        int n = 0; // 타이머 카운트 값
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000); // 1초 동안 밤을 잔다.
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadTimerEx extends JFrame {
    public ThreadTimerEx() {
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());

        // 타이머 값을 출력할 레이블 생성
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        // 타이머 스레드 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
        TimerThread th = new TimerThread(timerLabel); // 스레드 객체를 만든다.

        setSize(300, 170);
        setVisible(true);

        th.start(); // 타이머 스레드의 실행을 시작하게 한다. 스레드를 동작시킨다. 이 호출의 결과 TimerThread의 run() 메소드가 시작
    }

    public static void main(String[] args) {
        new ThreadTimerEx();
    }
}
