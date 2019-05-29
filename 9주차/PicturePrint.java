import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class day8 extends JFrame{
	public day8() {
		JLabel label = new JLabel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();//라벨을 3개 만든다.
		
		ImageIcon icon = new ImageIcon("E:\\Oreal.jpg");//사진을 저장할 ImageIcon을 만들고 사진을 저장한다.
		ImageIcon icon1 = new ImageIcon("E:\\Xreal.png");//사진을 저장할 ImageIcon을 만들고 사진을 저장한다.
		ImageIcon icon2 = new ImageIcon("E:\\ScreenShot.png");//사진을 저장할 ImageIcon을 만들고 사진을 저장한다.
		
		label.setIcon(icon);//라벨에 ImageIcon을 삽입한다.
		label1.setIcon(icon1);//라벨에 ImageIcon을 삽입한다.
		label2.setIcon(icon2);//라벨에 ImageIcon을 삽입한다.
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(1,3));//그리드 레이아웃을 이용해 1행3열로 내부가 배치되도록 한다.
		
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		add(panel);
		
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		day8 a = new day8();
	}
}
