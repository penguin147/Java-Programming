import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;


public class NumPredictGame extends JFrame{
	int num = (int)(Math.random()*100) + 1;
	int predict;
	
	public NumPredictGame() {
		

		setLayout(new BorderLayout());
		JLabel label1 = new JLabel("숫자를 추측하시오: ");
		
		JTextField label2 = new JTextField(10);
		label2.setEnabled(false);
		
		JTextField field1 = new JTextField(15);
		JButton button1 = new JButton("새 게임");
		
		button1.addActionListener(e->{
			num = (int)(Math.random()*100) + 1;
		});
		
		JButton button2 = new JButton("종료");
		
		button2.addActionListener(e->{
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
		
		Color c = label2.getBackground();
		
		field1.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e)
			{
				int keycode = e.getKeyCode();
				if(keycode == KeyEvent.VK_ENTER)
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
		NumPredictGame a = new NumPredictGame();
	}
}
