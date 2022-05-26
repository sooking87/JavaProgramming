package Chap14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class DrawImageWithGraphics {
    JFrame jf;
    Container c;
    JMenuBar bar;
    JMenu fileMenu;
    JMenuItem Item;
    MyPanel panel = new MyPanel();

    public DrawImageWithGraphics() {
        jf = new JFrame("메뉴로 배경 이미지 로딩하기");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setContentPane(panel); // 이거 설정 안해주면 사진 안뜸

        // 메뉴만들기
        bar = new JMenuBar();
        fileMenu = new JMenu("파일");
        Item = new JMenuItem("열기");
        Item.addActionListener(new OpenActionListener(panel));

        // 계층 구조 : bar -> fileMenu -> Item을 넣어야되므로 메뉴바에 넣을 때에는 작은 것부터 Item -> fileMenu
        // -> bar 순으로 넣어준다.
        fileMenu.add(Item);
        bar.add(fileMenu);

        jf.setJMenuBar(bar);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawImageWithGraphics();
    }
}

// 이벤트 처리
class OpenActionListener implements ActionListener {
    private JFileChooser chooser;
    private MyPanel panel;

    // 프레임에 컨텐트팬으로 있던 패널을 가져온다.
    public OpenActionListener(MyPanel panel) {
        chooser = new JFileChooser();
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // FileNameExtendsionFilter 클래스를 이용해서 jpg 파일만 보여주도록 한다.
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
        chooser.setFileFilter(filter); // 만들어 준 파일 필터를 다이얼로그에 파일 필터를 설정한다.

        // 사용자가 cancel 버튼을 누른 경우
        int ret = chooser.showOpenDialog(null);
        if (ret != JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 사용자가 파일을 선택하고 "열기" 버튼을 누른 경우
        String filePath = chooser.getSelectedFile().getPath();
        ImageIcon icon = new ImageIcon(filePath);
        Image img = icon.getImage();
        panel.setImage(img); // -> img 객체를 패널 클래스로 넘겨줌
    }
}

class MyPanel extends JPanel {
    Image img;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

    public void setImage(Image img) {
        this.img = img;
        repaint(); /**/
    }

}