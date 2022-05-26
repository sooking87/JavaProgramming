package Chap13;

import java.awt.*;
import javax.swing.*;

class MoveFrame implements Runnable {
    private Container c;

    public MoveFrame(Container c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                c.setLocation(c.getX() - 5, c.getY() - 5);
                c.setLocation(c.getX(), c.getY());
                c.setLocation(c.getX() + 5, c.getY() + 5);
                c.setLocation(c.getX(), c.getY());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class No_4VibrationCom extends JFrame {
    public No_4VibrationCom() {
        setTitle("4.1번");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLocation(100, 100);
        setSize(400, 400);
        setVisible(true);

        MoveFrame f = new MoveFrame(this);
        Thread th = new Thread(f);
        th.start();
    }

    public static void main(String[] args) {
        new No_4VibrationCom();
    }
}