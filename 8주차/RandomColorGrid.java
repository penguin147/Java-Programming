import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class RandomColorGrid extends JFrame
{
	
	public RandomColorGrid()
	{
		
		JPanel panel1 = new JPanel();//JPanel의 객체를 생성하고 그 참조값을 참조변수 panel1에 저장한다.
		panel1.setLayout(new GridLayout(0,5,0,0));//panel1의 레이아웃을 0행5열의 GridLayout으로 설정한다.
			
		int R;
		int G;
		int B;
		Color color;
		
		
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton[] b= new JButton[20];//JButton의 객체를 저장할 배열 b를 만든다. b의 크기는 20이다.
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
		}//Math.random을 이용해 무작위의 색을 지정해 b의 배경색을 설정한다.
		
		add(panel1);//panel1을 메인프레임에 추가한다.
		setSize(300,150);//메인프레임의 크기를 300,150으로 설정한다.
		setVisible(true);//메인프레임을 보이도록 설정한다.
	}
	
	public static void main(String args[])
	{
		RandomColorGrid hi = new RandomColorGrid();
	}
}
