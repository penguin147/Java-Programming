import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class NumberOfNight extends JFrame
{
	
	public NumberOfNight()
	{
		
		JPanel panel1 = new JPanel();//JPanelŬ������ ��ü�� �����ϰ� �� �������� panel1�� �����Ѵ�.
		JPanel panel2 = new JPanel();//JPanelŬ������ ��ü�� �����ϰ� �� �������� panel2�� �����Ѵ�.
		JPanel panel3 = new JPanel();//JPanelŬ������ ��ü�� �����ϰ� �� �������� panel3�� �����Ѵ�.
			
		
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1 = new JLabel("�ڹ� ȣ�ڿ� ���� ���� ȯ���մϴ�. �����ϼ��� �Է��ϼ���.");//JLabelŬ������ ��ü�� �����ϰ� �����ڿ� ���ڿ��� �Է��Ѵ�. �׸��� �� ��ü�� �������� label1�� �����Ѵ�.
	
		
		
		
		JButton[] b= new JButton[5];//JButtonŬ������ ��ü�� ������ �������� �迭�� 5�� �����Ѵ�. 
		
		for(int i = 0; i < 5; i++)
		{
		b[i] = new JButton((i+1)+"��");
		}//�迭 b�� ���� JButtonŬ������ ��ü�� ����� �������� �����Ѵ�. �̶� �� ��ư�� �����ڷ� 1��,2��,3��,4��,5���� �Է¹޴´�.
		
		Color c = b[0].getBackground();
		

		
		b[0].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[0].setBackground(Color.BLUE);
		});//���ٽ��� �̿��� b[0]�� �̺�Ʈ�� �߻����� �� ��� ��ư�� ���� �⺻������  �ٲٰ� b[0]�� ���� �Ķ������� �����Ѵ�.
		b[1].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[1].setBackground(Color.BLUE);
		});//���ٽ��� �̿��� b[1]�� �̺�Ʈ�� �߻����� �� ��� ��ư�� ���� �⺻������  �ٲٰ� b[1]�� ���� �Ķ������� �����Ѵ�.
		b[2].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[2].setBackground(Color.BLUE);
		});//���ٽ��� �̿��� b[2]�� �̺�Ʈ�� �߻����� �� ��� ��ư�� ���� �⺻������  �ٲٰ� b[2]�� ���� �Ķ������� �����Ѵ�.
		b[3].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[3].setBackground(Color.BLUE);
		});//���ٽ��� �̿��� b[3]�� �̺�Ʈ�� �߻����� �� ��� ��ư�� ���� �⺻������  �ٲٰ� b[3]�� ���� �Ķ������� �����Ѵ�.
		b[4].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[4].setBackground(Color.BLUE);
		});//���ٽ��� �̿��� b[4]�� �̺�Ʈ�� �߻����� �� ��� ��ư�� ���� �⺻������  �ٲٰ� b[4]�� ���� �Ķ������� �����Ѵ�.


		panel1.add(label1);//label1�� panel1�� �߰��Ѵ�.
		for(int i =0; i < 5; i++)//�迭 b�� ��� ��Ҹ� panel2�� �߰��Ѵ�.
		{
		panel2.add(b[i]);
		}
		panel3.add(panel1);//panel1�� panel3�� �߰��Ѵ�.
		panel3.add(panel2);//panel2�� panel3�� �߰��Ѵ�.
		
		add(panel3);//panel3�� ���������ӿ� �߰��Ѵ�.
		setSize(300,150);//������������ ũ�⸦ 300,150���� �����Ѵ�.
		setVisible(true);//������������ ���̵��� �����Ѵ�.
	}
	
	public static void main(String args[])
	{

		NumberOfNight hi = new NumberOfNight();
	}
}
