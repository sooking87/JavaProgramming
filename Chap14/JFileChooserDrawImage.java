package Chap14;

import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.*;

import java.awt.event.*;

public class JFileChooserDrawImage {
    JFrame jf;
    Container c;
    // 프레임에 넣을 메뉴바
    JMenuBar bar;
    JMenu fileMenu;
    JMenuItem Item;
    // 이미지를 붙힐 라벨
    JLabel imageLabel = new JLabel();

    public JFileChooserDrawImage() {
        // 프레임 생성
        jf = new JFrame("메뉴로 배경 이미지 로딩하기");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.add(imageLabel);

        // 메뉴만들기
        bar = new JMenuBar();
        fileMenu = new JMenu("파일");
        Item = new JMenuItem("열기");
        Item.addActionListener(new OpenActionListener()); // 아이템을 클릭하면 fileChooser가 떠야 되므로 아이템에 이벤트 리스너 등록

        // 계층 구조 : bar -> fileMenu -> Item을 넣어야되므로 메뉴바에 넣을 때에는 작은 것부터 Item -> fileMenu
        // -> bar 순으로 넣어준다.
        fileMenu.add(Item);
        bar.add(fileMenu);

        jf.setJMenuBar(bar);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    class OpenActionListener implements ActionListener {
        private JFileChooser chooser = new JFileChooser();

        @Override
        public void actionPerformed(ActionEvent e) {
            // FileNameExtendsionFilter 클래스를 이용해서 jpg 파일만 보여주도록 한다.
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
            chooser.setFileFilter(filter); // 만들어 준 파일 필터를 다이얼로그에 파일 필터를 설정한다.

            // 사용자가 cancel 버튼을 누른 경우
            int ret = chooser.showOpenDialog(null);
            if (ret != JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
            }

            // 사용자가 파일을 선택하고 "열기" 버튼을 누른 경우
            String filePath = chooser.getSelectedFile().getPath(); // 파일 경로명 리턴
            // System.out.println(filePath);
            imageLabel.setIcon(new ImageIcon(filePath));
            jf.pack(); // 이미지의 크기에 맞추어 프레임 크기 조절
        }

    }

}
