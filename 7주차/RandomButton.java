import java.awt.FlowLayout;
import javax.swing.*;
public class RandomButton extends JFrame 
{
	public RandomButton()
	{
		setSize(1000,1000);//컨테이너의 크기를 300,200으로 설정한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");//컨테이너의 위에 "MyFrame"이 나타나도록 한다.

		setLayout(null);//패널의 배치 관리자를 지정하지 않는다. 즉 절대 위치를 사용하겠다는 의미이다.
	
		for(int i = 0; i < 30; i++)
		{
		JButton button1 = new JButton(i + "");//JButton의 객체를 만들고 그 참조값을 button1에 저장한다. 생성자에는 i를 입력한다.
		button1.setLocation((int)(Math.random()*1000),(int)(Math.random()*1000));//Math.random()을 이용해 button1의 위치를 0~1000,0~1000의 무작위의 수로 지정한다.
		button1.setSize(90,20);//button의 크기를 90,20으로 설정한다.
		add(button1);//button1을 배치한다.
		}
		
		setVisible(true);//컨테이너가 보이도록 한다.
	}
	
	public static void main(String args[])
	{
		RandomButton a = new RandomButton();//FrameTest의 객체를 만들어 그 참조값을 참조변수 a에 넣는다.
	}
}
