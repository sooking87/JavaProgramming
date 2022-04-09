package Chap9;

import java.awt.*;

public class SetBackgroundColor {
    Frame f;
    Button zero, one, two, three, four, five, six, seven, eight, nine;

    public SetBackgroundColor() {
        f = new Frame("Ten Color Buttons Frame");
        f.setLayout(new GridLayout(1, 10, 0, 0));

        zero = new Button("0");
        one = new Button("1");
        two = new Button("2");
        three = new Button("3");
        four = new Button("4");
        five = new Button("5");
        six = new Button("6");
        seven = new Button("7");
        eight = new Button("8");
        nine = new Button("9");

        zero.setBackground(Color.red); // java.awt.Color
        one.setBackground(Color.orange);
        two.setBackground(Color.yellow);
        three.setBackground(Color.green);
        four.setBackground(Color.cyan);
        five.setBackground(Color.BLUE);
        six.setBackground(Color.magenta);
        seven.setBackground(Color.gray);
        eight.setBackground(Color.pink);
        nine.setBackground(Color.lightGray);

        f.add(zero);
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);

        f.setSize(600, 300);
        f.setVisible(true);
    }
}
