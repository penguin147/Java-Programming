import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class TelephoneSave extends JFrame
{
	public TelephoneSave()
	{
		
		String[] labels = {
			"1","2","3","4","5","6","7","8","9","*","0","#","send"," ","end"	
		};//실수형 배열 labels를 선언하고 전화번호 입력기에 버튼들에 들어갈 문자열로 초기화한다.
		
		JPanel panel1 = new JPanel();//JPanel클래스의 객체를 생성하고 panel1에 그 참조값을 넣는다.
		JPanel panel2 = new JPanel();//JPanel클래스의 객체를 생성하고 panel2에 그 참조값을 넣는다.
		JPanel panel3 = new JPanel();//JPanel클래스의 객체를 생성하고 panel3에 그 참조값을 넣는다.
		JPanel panel4 = new JPanel();//JPanel클래스의 객체를 생성하고 panel4에 그 참조값을 넣는다.
		


		panel1.setLayout(new GridLayout(0,3,0,0));//panel1의 레이아웃을 0행3열의 gridlayout으로 설정한다.
		panel2.setLayout(new GridLayout(1,1));//panel1의 레이아웃을 1행1열의 gridlayout으로 설정한다.
		panel3.setLayout(new GridLayout(1,1));//panel1의 레이아웃을 1행1열의 gridlayout으로 설정한다.

	
		
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField text = new JTextField(20);//JTextField클래스의 객체를 만들고 text에 그 참조값을 넣는다. JTextField는 텍스트박스에 관한 정보가 담겨있는 클래스이다.
		panel2.add(text);//panel2에 text를 추가한다.
		
		JButton[] b= new JButton[15];//JButton클래스의 참조변수 배열 b를 15개 만든다.
		JButton b1 = new JButton("clear");//JButton클래스의 객체를 만들고 b1에 그 참조값을 저장한다.
		b1.addActionListener(e->{
			text.setText("");
		});//람다식을 이용해 b1의 이벤트 발생시 setText("")를 실행하도록 한다. 이는 b1이 눌렸을 때 텍스트박스를 초기화하겠다는 의미이다.
		panel3.add(b1);//panel3에 b1을 추가한다.
		
		int index = 0;
		
		for(int rows = 0; rows < 3; rows++)
		{
			for(int cols = 0; cols < 5; cols++)
			{
				b[index] = new JButton(labels[index]);
				panel1.add(b[index]);
				
				index++;
			}
		}//panel1에 한 열당 5개, 총 3개의 행으로 JButton을 삽입해 panel1이 구성되게 한다. JButton에는 labels배열의 내용이 차래대로 들어간다. 
		
		b[0].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[0]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[1].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[1]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[2].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[2]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[3].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[3]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[4].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[4]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[5].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[5]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[6].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[6]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[7].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[7]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[8].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[8]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[9].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[9]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[10].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[10]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.
		b[11].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[11]);
			
		});//람다식을 이용해 각 JButton의 이벤트가 발생했을 때 그 JButton이 가지고 있는 값이 텍스트박스에 추가되도록 한다.


		b[12].addActionListener(e->{
			System.out.println(text.getText());
		});//람다식을 이용해 b[12]버튼의 이벤트가 발생했을 때, 텍스트박스에 있는 값을 출력하도록 한다.
		
		b[14].addActionListener(e->{
			System.exit(0);
		});//람다식을 이용해 b[14]버튼의 이벤트가 발생했을 때, 프로그램이 종료되도록 한다.
		
		
		panel3.setSize(50,150);//panel3의 크기를 가로 50, 세로 150으로 한다.
		add("North",panel2);//panel2를 북쪽에 배치하도록 하여 추가한다.
		add("East",panel3);//panel3을 동쪽에 배치하도록 하여 추가한다.
		add("Center",panel1);//panel1을 중앙에 배치하도록 하여 추가한다.
	
		setSize(300,200);//메인프레임의 크기를 300,200으로 한다.
		setVisible(true);//메인프레임이 보이도록 한다.
	}
	
	public static void main(String args[])
	{
		TelephoneSave hi = new TelephoneSave();//Day1클래스의 객체를 만들고 hi 라는 참조변수에 그 참조값을 저장한다.
	}
}
