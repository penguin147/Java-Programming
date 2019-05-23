import java.awt.FlowLayout;

import javax.swing.*;

public class JavaIsFun extends JFrame 
{
	public JavaIsFun()
	{
		setSize(300,200);//컨테이너의 크기를 300,200으로 설정한다.
		setTitle("MyFrame");//컨테이너의 위에 "MyFrame"이 나타나도록 한다.
		setLayout(new FlowLayout());//프레임의 배치관리자를 FlowLayout으로 지정한다.
		JButton button1 = new JButton("Yes");//JButton의 객체를 만들고 그 참조값을 참조변수 button1에 저장한다. JButton의 생성자에는 "Yes"를 입력한다.
		JButton button2 = new JButton("No");//JButton의 객체를 만들고 그 참조값을 참조변수 button2에 저장한다. JButton의 생성자에는 "No"를 입력한다.
		JLabel j1 = new JLabel("자바는 재미있나요?");//JLabel의 객체를 만들고 그 참조값을 참조변수 j1에 저장한다. JLabel의 생성자에는 "자바는 재미있나요?"를 입력한다.
		add(j1);//j1을 배치한다.
		add(button1);//button1을 배치한다.
		add(button2);//button2를 배치한다.
		setVisible(true);//컨테이너가 보이도록 한다.
	}
	
	public static void main(String args[])
	{
		JavaIsFun a = new JavaIsFun();//FrameTest의 객체를 만들어 그 참조값을 참조변수 a에 넣는다.
		
	}
}
