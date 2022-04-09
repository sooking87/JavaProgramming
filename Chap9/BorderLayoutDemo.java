//2번
package Chap9;

import java.awt.*;

public class BorderLayoutDemo {
    Frame f;

    public BorderLayoutDemo() {
        f = new Frame("BorderLayout Practice");
        Button north = new Button("North");
        Button west = new Button("West");
        Button center = new Button("Center");
        Button east = new Button("East");
        Button south = new Button("South");

        f.setLayout(new BorderLayout(5, 7));
        f.add(north, BorderLayout.NORTH);
        f.add(west, BorderLayout.WEST);
        f.add(center, BorderLayout.CENTER);
        f.add(east, BorderLayout.EAST);
        f.add(south, BorderLayout.SOUTH);

        f.setSize(500, 300);
        f.setVisible(true);
    }
}
