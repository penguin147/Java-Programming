import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class NumberOfNight extends JFrame
{
	
	public NumberOfNight()
	{
		
		JPanel panel1 = new JPanel();//JPanel클래스의 객체를 생성하고 그 참조값을 panel1에 저장한다.
		JPanel panel2 = new JPanel();//JPanel클래스의 객체를 생성하고 그 참조값을 panel2에 저장한다.
		JPanel panel3 = new JPanel();//JPanel클래스의 객체를 생성하고 그 참조값을 panel3에 저장한다.
			
		
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1 = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");//JLabel클래스의 객체를 생성하고 생성자에 문자열을 입력한다. 그리고 그 객체의 참조값을 label1에 저장한다.
	
		
		
		
		JButton[] b= new JButton[5];//JButton클래스의 객체를 저장할 참조변수 배열을 5개 생성한다. 
		
		for(int i = 0; i < 5; i++)
		{
		b[i] = new JButton((i+1)+"일");
		}//배열 b에 각각 JButton클래스의 객체를 만들어 참조값을 저장한다. 이때 각 버튼은 생성자로 1일,2일,3일,4일,5일을 입력받는다.
		
		Color c = b[0].getBackground();
		

		
		b[0].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[0].setBackground(Color.BLUE);
		});//람다식을 이용해 b[0]의 이벤트가 발생했을 때 모든 버튼의 색을 기본색으로  바꾸고 b[0]의 색을 파랑색으로 변경한다.
		b[1].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[1].setBackground(Color.BLUE);
		});//람다식을 이용해 b[1]의 이벤트가 발생했을 때 모든 버튼의 색을 기본색으로  바꾸고 b[1]의 색을 파랑색으로 변경한다.
		b[2].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[2].setBackground(Color.BLUE);
		});//람다식을 이용해 b[2]의 이벤트가 발생했을 때 모든 버튼의 색을 기본색으로  바꾸고 b[2]의 색을 파랑색으로 변경한다.
		b[3].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[3].setBackground(Color.BLUE);
		});//람다식을 이용해 b[3]의 이벤트가 발생했을 때 모든 버튼의 색을 기본색으로  바꾸고 b[3]의 색을 파랑색으로 변경한다.
		b[4].addActionListener(e->{
			for(int i = 0; i < 5; i++)
				b[i].setBackground(c);
			b[4].setBackground(Color.BLUE);
		});//람다식을 이용해 b[4]의 이벤트가 발생했을 때 모든 버튼의 색을 기본색으로  바꾸고 b[4]의 색을 파랑색으로 변경한다.


		panel1.add(label1);//label1을 panel1에 추가한다.
		for(int i =0; i < 5; i++)//배열 b의 모든 요소를 panel2에 추가한다.
		{
		panel2.add(b[i]);
		}
		panel3.add(panel1);//panel1을 panel3에 추가한다.
		panel3.add(panel2);//panel2를 panel3에 추가한다.
		
		add(panel3);//panel3을 메인프레임에 추가한다.
		setSize(300,150);//메인프레임의 크기를 300,150으로 설정한다.
		setVisible(true);//메인프레임을 보이도록 설정한다.
	}
	
	public static void main(String args[])
	{

		NumberOfNight hi = new NumberOfNight();
	}
}
