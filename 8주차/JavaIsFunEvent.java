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
		JLabel label1 = new JLabel("자바는 재미있나요?");//JLabel클래스의 객체를 만들고 생성자에 "자바는 재미있나요?"를 입력한다. 그리고 그 객체의 참조값을 참조변수 label1에 저장한다.
		setLayout(new FlowLayout());//메인프레임의 레이아웃을 FlowLayout으로 설정한다.
		JButton b1 = new JButton("Yes");//JButton클래스의 객체를 만들고 생성자에 "Yes"를 입력한다. 그리고 그 객체의 참조값을 참조변수 b1에 저장한다.
		JButton b2 = new JButton("No");//JButton클래스의 객체를 만들고 생성자에 "No"를 입력한다. 그리고 그 객체의 참조값을 참조변수 b2에 저장한다.
		
		Color c = b1.getBackground();//b1과b2가 눌렸을때 각각 눌리지 않은 버튼의 색을 원래대로 돌리기 위해 버튼의 기본색을 Color형의 참조변수 c에 저장한다.
		
		b1.addActionListener(e ->{
			b1.setBackground(Color.GREEN);
			System.out.println("yes가 눌림");
			b2.setBackground(c);
		});//람다식을 이용해 b1의 이벤트가 발생했을 때 b1의 색을 초록색으로 변경하고 "yes가 눌림"을 출력한 후 다른 버튼의 색이 원래대로 돌아오도록 한다.
		
		b2.addActionListener(e->{
			b2.setBackground(Color.BLUE);
			System.out.println("no가 눌림");
			b1.setBackground(c);
		});//람다식을 이용해 b2의 이벤트가 발생했을 때 b2의 색을 파랑색으로 변경하고 "no가 눌림"을 출력한 후 다른 버튼의 색이 원래대로 돌아오도록 한다.
		
		add(label1);//라벨을 메인프레임에 추가한다.
		add(b1);//b1을 메인프레임에 추가한다.
		add(b2);//b2를 메인프레임에 추가한다.
		
		
		setVisible(true);//메인프레임이 보이도록 설정한다.
	}
	
	public static void main(String args[])
	{
		JavaIsFunEvent hi = new JavaIsFunEvent();//JavaIsFun클래스의 객체를 만들고 그 참조값을 hi에 저장한다.
	}
}
