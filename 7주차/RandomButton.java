import java.awt.FlowLayout;
import javax.swing.*;
public class RandomButton extends JFrame 
{
	public RandomButton()
	{
		setSize(1000,1000);//�����̳��� ũ�⸦ 300,200���� �����Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");//�����̳��� ���� "MyFrame"�� ��Ÿ������ �Ѵ�.

		setLayout(null);//�г��� ��ġ �����ڸ� �������� �ʴ´�. �� ���� ��ġ�� ����ϰڴٴ� �ǹ��̴�.
	
		for(int i = 0; i < 30; i++)
		{
		JButton button1 = new JButton(i + "");//JButton�� ��ü�� ����� �� �������� button1�� �����Ѵ�. �����ڿ��� i�� �Է��Ѵ�.
		button1.setLocation((int)(Math.random()*1000),(int)(Math.random()*1000));//Math.random()�� �̿��� button1�� ��ġ�� 0~1000,0~1000�� �������� ���� �����Ѵ�.
		button1.setSize(90,20);//button�� ũ�⸦ 90,20���� �����Ѵ�.
		add(button1);//button1�� ��ġ�Ѵ�.
		}
		
		setVisible(true);//�����̳ʰ� ���̵��� �Ѵ�.
	}
	
	public static void main(String args[])
	{
		RandomButton a = new RandomButton();//FrameTest�� ��ü�� ����� �� �������� �������� a�� �ִ´�.
	}
}
