import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

class MyFrame extends JFrame//JFrameŬ������ ��ӹ޴� MyFrameŬ������ �����.
{
	public MyFrame(String s)
	{
		super(s);//�θ�Ŭ������ JFrame�� �����ڸ� ȣ���Ѵ�.
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g)//JFrame�� �޼����� paint�� �������̵��� �ڵ带 �߰��Ѵ�.
	{
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawRect(40, 40, 100, 50);
		g.drawArc(50, 80, 20, 20, 0, 360);
		g.drawArc(110, 80, 20, 20, 0, 360);
	}
}


public class MakeBus
{

	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame("Frame Test");
	}

}
