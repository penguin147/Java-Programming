import java.awt.FlowLayout;

import javax.swing.*;

public class JavaIsFun extends JFrame 
{
	public JavaIsFun()
	{
		setSize(300,200);//�����̳��� ũ�⸦ 300,200���� �����Ѵ�.
		setTitle("MyFrame");//�����̳��� ���� "MyFrame"�� ��Ÿ������ �Ѵ�.
		setLayout(new FlowLayout());//�������� ��ġ�����ڸ� FlowLayout���� �����Ѵ�.
		JButton button1 = new JButton("Yes");//JButton�� ��ü�� ����� �� �������� �������� button1�� �����Ѵ�. JButton�� �����ڿ��� "Yes"�� �Է��Ѵ�.
		JButton button2 = new JButton("No");//JButton�� ��ü�� ����� �� �������� �������� button2�� �����Ѵ�. JButton�� �����ڿ��� "No"�� �Է��Ѵ�.
		JLabel j1 = new JLabel("�ڹٴ� ����ֳ���?");//JLabel�� ��ü�� ����� �� �������� �������� j1�� �����Ѵ�. JLabel�� �����ڿ��� "�ڹٴ� ����ֳ���?"�� �Է��Ѵ�.
		add(j1);//j1�� ��ġ�Ѵ�.
		add(button1);//button1�� ��ġ�Ѵ�.
		add(button2);//button2�� ��ġ�Ѵ�.
		setVisible(true);//�����̳ʰ� ���̵��� �Ѵ�.
	}
	
	public static void main(String args[])
	{
		JavaIsFun a = new JavaIsFun();//FrameTest�� ��ü�� ����� �� �������� �������� a�� �ִ´�.
		
	}
}
