import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class RandomColorGrid extends JFrame
{
	
	public RandomColorGrid()
	{
		
		JPanel panel1 = new JPanel();//JPanel�� ��ü�� �����ϰ� �� �������� �������� panel1�� �����Ѵ�.
		panel1.setLayout(new GridLayout(0,5,0,0));//panel1�� ���̾ƿ��� 0��5���� GridLayout���� �����Ѵ�.
			
		int R;
		int G;
		int B;
		Color color;
		
		
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton[] b= new JButton[20];//JButton�� ��ü�� ������ �迭 b�� �����. b�� ũ��� 20�̴�.
		int index = 0;
		
		for(int rows = 0; rows < 5; rows++)
		{
			for(int cols = 0; cols < 4; cols++)
			{
				R = (int)(Math.random()*256);
				G = (int)(Math.random()*256);
				B = (int)(Math.random()*256);
				color = new Color(R,G,B);
				b[index] = new JButton((index + 1) + "");
				b[index].setBackground(color);
				panel1.add(b[index]);
				index++;
			}
		}//Math.random�� �̿��� �������� ���� ������ b�� ������ �����Ѵ�.
		
		add(panel1);//panel1�� ���������ӿ� �߰��Ѵ�.
		setSize(300,150);//������������ ũ�⸦ 300,150���� �����Ѵ�.
		setVisible(true);//������������ ���̵��� �����Ѵ�.
	}
	
	public static void main(String args[])
	{
		RandomColorGrid hi = new RandomColorGrid();
	}
}
