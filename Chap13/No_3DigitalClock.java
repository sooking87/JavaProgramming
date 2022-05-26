package Chap13;

import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

class Clock extends Thread {
    private JLabel clockLabel;

    public Clock(JLabel clockLabel) {

        this.clockLabel = clockLabel;
    }

    // 스레드 코드. run() 이 종료하면 스레드 종료
    @Override
    public void run() {
        while (true) {
            Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int min = c.get(Calendar.MINUTE);
            int sec = c.get(Calendar.SECOND);

            String clockText = Integer.toString(hour);
            clockText = clockText.concat(":");
            clockText = clockText.concat(Integer.toString(min));
            clockText = clockText.concat(":");
            clockText = clockText.concat(Integer.toString(sec));
            clockLabel.setText(clockText);
        }

    }

}

public class No_3DigitalClock extends JFrame {

    public No_3DigitalClock() {
        setTitle("3번. 디지털 시계 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.CENTER));

        // 타이머 값을 출력할 레이블 생성
        JLabel clock = new JLabel();
        clock.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(clock);

        // 타이머 스레드로 사용할 Runnable 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달

        Clock th = new Clock(clock); // 스레드 객체 생성

        setSize(350, 300);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new No_3DigitalClock();
    }

}
