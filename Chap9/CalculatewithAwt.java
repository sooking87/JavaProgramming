package Chap9;

import java.awt.*;

public class CalculatewithAwt {
    Frame frame;
    // Window 안에는 패널은 올 수 있지만 새로운 Window는 올 수 없다.
    Panel frameNorth, frameBtn, frameSouth;
    Button zero, one, two, three, four, five, six, seven, eight, nine, ce, cal, plus, minus, mul, div;
    Label input, output;
    TextField inputBox, outputBox;

    public CalculatewithAwt() {
        frame = new Frame("계산기 프레임");
        frameNorth = new Panel();
        frameBtn = new Panel();
        frameSouth = new Panel();
        frame.setLayout(new BorderLayout());
        frameNorth.setLayout(new FlowLayout());
        frameBtn.setLayout(new GridLayout(4, 4, 1, 2));
        frameSouth.setLayout(new FlowLayout());

        // frame의 상단에 오는 컨테이너를 frameNorth에 먼저 붙혀주기
        input = new Label("수식입력");
        inputBox = new TextField(30);
        frameNorth.add(input);
        frameNorth.add(inputBox);
        frameNorth.setBackground(Color.lightGray);

        // frame의 중간에 오는 컨테이너를 frameBtn에 먼저 붙혀주기
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
        ce = new Button("CE");
        cal = new Button("계산");
        plus = new Button("+");
        minus = new Button("-");
        mul = new Button("X");
        div = new Button("/");
        plus.setBackground(Color.cyan);
        minus.setBackground(Color.cyan);
        mul.setBackground(Color.cyan);
        div.setBackground(Color.cyan);

        frameBtn.add(zero);
        frameBtn.add(one);
        frameBtn.add(two);
        frameBtn.add(three);
        frameBtn.add(four);
        frameBtn.add(five);
        frameBtn.add(six);
        frameBtn.add(seven);
        frameBtn.add(eight);
        frameBtn.add(nine);
        frameBtn.add(ce);
        frameBtn.add(cal);
        frameBtn.add(plus);
        frameBtn.add(minus);
        frameBtn.add(mul);
        frameBtn.add(div);

        // frame의 하단에 오는 컨테이너를 frameSouth에 먼저 붙혀주기
        output = new Label("계산 결과");
        outputBox = new TextField(30);

        frameSouth.add(output);
        frameSouth.add(outputBox);
        frameSouth.setBackground(Color.yellow);

        frame.add(frameNorth, BorderLayout.NORTH);
        frame.add(frameBtn, BorderLayout.CENTER);
        frame.add(frameSouth, BorderLayout.SOUTH);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatewithAwt();
    }
}
