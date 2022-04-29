package Chap11;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.io.File;

public class ImageGalPracticeFrame {
    JFrame jf;
    Container c;
    JPanel top, bottom;
    ImageIcon image;
    JLabel imgLabel; // 이미지 붙히기
    ArrayList<ImageIcon> imageList = new ArrayList<>();
    JRadioButton left, right;
    int count = -1;
    int now = 0;

    String dirName = "./images/"; // 윈도우는 \\를 통해서 경로 이동
    File dir = new File(dirName);
    File file[] = dir.listFiles(); // 디렉토리의 파일 목록을 File 배열로 반환

    public ImageGalPracticeFrame() {
        // 컨테이너 생성
        jf = new JFrame("Image Gallery Practice Frame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(new BorderLayout());

        // 윗부분의 라디오 버튼 생성 -> top 패널에 넣어줌
        top = new JPanel();
        ButtonGroup group = new ButtonGroup();
        left = new JRadioButton("left", true);
        right = new JRadioButton("right");
        group.add(left);
        group.add(right);

        // 마우스 리스터 등록
        left.addItemListener(new moveLeftorRight());
        right.addItemListener(new moveLeftorRight());
        top.add(left);
        top.add(right);
        c.add(top, BorderLayout.NORTH);

        // 이미지들 불러오기 -> ArrayList에 넣어주기(Vector 대용)
        for (File f : file) {
            String imageName = f.getName();
            System.out.println(dirName + imageName);
            image = new ImageIcon(dirName + imageName);
            imageList.add(image);
        }
        imgLabel = new JLabel(imageList.get(0));
        imgLabel.setPreferredSize(new Dimension(400, 400));

        bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        bottom.add(imgLabel);
        c.add(bottom, BorderLayout.SOUTH);

        top.addMouseListener(new MouseAdapter());

        jf.setSize(500, 500);
        jf.setVisible(true);

    }

    class moveLeftorRight implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (left.isSelected()) {
                    System.out.println("left Clicked");
                    count = -1;
                } else {
                    System.out.println("right Clicked");
                    count = 1;
                }
            }
        }
    }

    class MouseAdapter implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            now += count;
            System.out.println(now);
            if (now < 0) {
                now = imageList.size() - 1;
                imgLabel.setIcon(imageList.get(now));
            } else {
                imgLabel.setIcon(imageList.get(now % imageList.size()));
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub

        }

    }

    public static void main(String[] args) {
        new ImageGalPracticeFrame();
    }
}
