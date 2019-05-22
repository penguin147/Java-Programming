import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

class MyFrame extends JFrame//JFrame클래스를 상속받는 MyFrame클래스를 만든다.
{
	public MyFrame(String s)
	{
		super(s);//부모클래스인 JFrame의 생성자를 호출한다.
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g)//JFrame의 메서드인 paint를 오버라이드해 코드를 추가한다.
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
