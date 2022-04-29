package Chap11;

import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.util.Vector;
import javax.swing.*;

public class Task extends JFrame {
    private JPanel radioPanel = new JPanel();
    private JPanel imagePanel = new JPanel();
    private Vector<ImageIcon> imageIconVector = new Vector<ImageIcon>();
    private JRadioButton left;
    private JRadioButton right;
    private JLabel imageLabel;
    private int count = -1;
    private int now = 0;

    public Task() {
        super("Image Gallery Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(radioPanel, BorderLayout.NORTH);
        c.add(imagePanel, BorderLayout.SOUTH);

        ButtonGroup group = new ButtonGroup();
        left = new JRadioButton("left", true);
        right = new JRadioButton("right");
        group.add(left);
        group.add(right);

        left.addItemListener(new MyItemListener());
        right.addItemListener(new MyItemListener());
        radioPanel.add(left);
        radioPanel.add(right);

        File f = new File("images");
        File files[] = f.listFiles();

        for (int i = 0; i < files.length; i++) {
            ImageIcon image = new ImageIcon(files[i].getPath());
            imageIconVector.add(image);
        }

        imageLabel = new JLabel(imageIconVector.get(0));
        imageLabel.setPreferredSize(new Dimension(400, 300));
        imagePanel.setLayout(new FlowLayout());
        imagePanel.add(imageLabel);
        imageLabel.addMouseListener(new MouseAdapter() {
            private int index;

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                now += count;
                if (now < 0) {
                    now = imageIconVector.size() - 1;
                    imageLabel.setIcon(imageIconVector.get(now));
                } else {
                    imageLabel.setIcon(imageIconVector.get(now % imageIconVector.size()));
                }
            }
        });

        setSize(400, 400);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (left.isSelected()) {
                    count = -1;
                } else {
                    count = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Task();
    }
}