import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class JavaIsFunEvent extends JFrame
{
	
	public JavaIsFunEvent()
	{
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		JLabel label1 = new JLabel("�ڹٴ� ����ֳ���?");//JLabelŬ������ ��ü�� ����� �����ڿ� "�ڹٴ� ����ֳ���?"�� �Է��Ѵ�. �׸��� �� ��ü�� �������� �������� label1�� �����Ѵ�.
		setLayout(new FlowLayout());//������������ ���̾ƿ��� FlowLayout���� �����Ѵ�.
		JButton b1 = new JButton("Yes");//JButtonŬ������ ��ü�� ����� �����ڿ� "Yes"�� �Է��Ѵ�. �׸��� �� ��ü�� �������� �������� b1�� �����Ѵ�.
		JButton b2 = new JButton("No");//JButtonŬ������ ��ü�� ����� �����ڿ� "No"�� �Է��Ѵ�. �׸��� �� ��ü�� �������� �������� b2�� �����Ѵ�.
		
		Color c = b1.getBackground();//b1��b2�� �������� ���� ������ ���� ��ư�� ���� ������� ������ ���� ��ư�� �⺻���� Color���� �������� c�� �����Ѵ�.
		
		b1.addActionListener(e ->{
			b1.setBackground(Color.GREEN);
			System.out.println("yes�� ����");
			b2.setBackground(c);
		});//���ٽ��� �̿��� b1�� �̺�Ʈ�� �߻����� �� b1�� ���� �ʷϻ����� �����ϰ� "yes�� ����"�� ����� �� �ٸ� ��ư�� ���� ������� ���ƿ����� �Ѵ�.
		
		b2.addActionListener(e->{
			b2.setBackground(Color.BLUE);
			System.out.println("no�� ����");
			b1.setBackground(c);
		});//���ٽ��� �̿��� b2�� �̺�Ʈ�� �߻����� �� b2�� ���� �Ķ������� �����ϰ� "no�� ����"�� ����� �� �ٸ� ��ư�� ���� ������� ���ƿ����� �Ѵ�.
		
		add(label1);//���� ���������ӿ� �߰��Ѵ�.
		add(b1);//b1�� ���������ӿ� �߰��Ѵ�.
		add(b2);//b2�� ���������ӿ� �߰��Ѵ�.
		
		
		setVisible(true);//������������ ���̵��� �����Ѵ�.
	}
	
	public static void main(String args[])
	{
		JavaIsFunEvent hi = new JavaIsFunEvent();//JavaIsFunŬ������ ��ü�� ����� �� �������� hi�� �����Ѵ�.
	}
}
