import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class day8 extends JFrame{
	public day8() {
		JLabel label = new JLabel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();//���� 3�� �����.
		
		ImageIcon icon = new ImageIcon("E:\\Oreal.jpg");//������ ������ ImageIcon�� ����� ������ �����Ѵ�.
		ImageIcon icon1 = new ImageIcon("E:\\Xreal.png");//������ ������ ImageIcon�� ����� ������ �����Ѵ�.
		ImageIcon icon2 = new ImageIcon("E:\\ScreenShot.png");//������ ������ ImageIcon�� ����� ������ �����Ѵ�.
		
		label.setIcon(icon);//�󺧿� ImageIcon�� �����Ѵ�.
		label1.setIcon(icon1);//�󺧿� ImageIcon�� �����Ѵ�.
		label2.setIcon(icon2);//�󺧿� ImageIcon�� �����Ѵ�.
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(1,3));//�׸��� ���̾ƿ��� �̿��� 1��3���� ���ΰ� ��ġ�ǵ��� �Ѵ�.
		
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
