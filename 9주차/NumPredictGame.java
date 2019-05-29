import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;


public class day8 extends JFrame{
	int num = (int)(Math.random()*100) + 1;//정답을 나타낼 숫자를 1부터 100까지 랜덤으로 num에 저장한다.
	int predict;
	
	public day8() {
		

		setLayout(new BorderLayout());//메인프레임의 배치관리자를 BorderLayout으로 지정한다.
		JLabel label1 = new JLabel("숫자를 추측하시오: ");//라벨을 만들고 "숫자를 추측하시오: "를 저장한다.
		
		JTextField label2 = new JTextField(10);//크기가 10인 텍스트필드를 만든다.(사용자가 예측한 정답을 입력함)
		label2.setEnabled(false);//텍스트필드를 수정 가능하게 만든다.
		
		JTextField field1 = new JTextField(15);//크기가 15인 텍스트필드를 만든다.(힌트가 출력될 부분)
		JButton button1 = new JButton("새 게임");//"새 게임"을 가지고있는 버튼을 만든다.
		
		button1.addActionListener(e->{//새 게임이 눌렸을 경우 정답에 해당하는 수를 새로 지정한다.
			num = (int)(Math.random()*100) + 1;
		});
		
		JButton button2 = new JButton("종료");//"종료"를 가지고있는 버튼을 만든다.
		
		button2.addActionListener(e->{//종료가 눌렸을 경우 프로그램을 종료한다.
			System.exit(0);
		});
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel.add(label1);
		panel.add(field1);

	

		panel2.add(label2);
	
		
		panel1.add(button1);
		panel1.add(button2);
		
		

		
		add(panel,BorderLayout.NORTH);
		add(panel2,BorderLayout.CENTER);
		add(panel1,BorderLayout.SOUTH);

		
		field1.requestFocus();
		field1.setFocusable(true);
		
		Color c = label2.getBackground();//정답일경우 색을 원래대로 돌려놓기 위해 최초의 색을 저장해 놓는다.
		
		field1.addKeyListener(new KeyListener() {//사용자가 수를 입력하고 엔터키를 눌렀을 때 입력한 값에 대해 이벤트를 처리하기 위해 키리스너를 만든다.
			public void keyPressed(KeyEvent e)
			{
				int keycode = e.getKeyCode();
				if(keycode == KeyEvent.VK_ENTER)//엔터키가 눌렸을 경우 정답과 비교해 힌트를 텍스트필드에 출력한다.
				{
					
					predict = Integer.parseInt(field1.getText());
					if(predict == num)
					{
						label2.setText("      정답입니다.");
						label2.setBackground(c);
					}
					else if(predict > num)
					{
						label2.setText("    너무 큽니다.");
						label2.setBackground(Color.red);
					}
					else
					{
						label2.setText("    너무 작습니다.");
						label2.setBackground(Color.red);
						
					}
				}
			}
			public void keyReleased(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {}
		});
		

		
		setSize(300,140);
		setVisible(true);
		

		
	}
	public static void main(String[] args)
	{
		day8 a = new day8();
	}
}
