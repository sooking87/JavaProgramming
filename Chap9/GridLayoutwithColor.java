package Chap9;

import java.awt.*;

public class GridLayoutwithColor {
    Frame f;
    Button zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen;

    public GridLayoutwithColor() {
        f = new Frame("4x4 Color Frame");
        f.setLayout(new GridLayout(4, 4));

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
        ten = new Button("10");
        eleven = new Button("11");
        twelve = new Button("12");
        thirteen = new Button("13");
        fourteen = new Button("14");
        fifteen = new Button("15");

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
        ten.setBackground(Color.white);
        eleven.setBackground(Color.darkGray);
        twelve.setBackground(Color.black);
        thirteen.setBackground(Color.orange);
        fourteen.setBackground(Color.blue);
        fifteen.setBackground(Color.magenta);

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
        f.add(ten);
        f.add(eleven);
        f.add(twelve);
        f.add(thirteen);
        f.add(fourteen);
        f.add(fifteen);

        f.setSize(600, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutwithColor();
    }
}
