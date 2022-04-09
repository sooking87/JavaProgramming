package Chap9;

import java.awt.*;

public class GridLayoutDemo {
    Frame f;
    Button zero, one, two, three, four, five, six, seven, eight, nine;

    public GridLayoutDemo() {
        f = new Frame("Tem Color Buttons Frame");
        f.setLayout(new GridLayout(1, 10));

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
