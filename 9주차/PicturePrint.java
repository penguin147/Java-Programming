import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PicturePrint extends JFrame{
	public day8() {
		JLabel label = new JLabel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		
		ImageIcon icon = new ImageIcon("E:\\cat.jpg");
		ImageIcon icon1 = new ImageIcon("E:\\1.png");
		ImageIcon icon2 = new ImageIcon("E:\\2.png");
		
		label.setIcon(icon);
		label1.setIcon(icon1);
		label2.setIcon(icon2);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(1,3));
		
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		add(panel);
		
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		PicturePrint a = new PicturePrint();
	}
}
