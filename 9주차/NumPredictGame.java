import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;


public class day8 extends JFrame{
	int num = (int)(Math.random()*100) + 1;//������ ��Ÿ�� ���ڸ� 1���� 100���� �������� num�� �����Ѵ�.
	int predict;
	
	public day8() {
		

		setLayout(new BorderLayout());//������������ ��ġ�����ڸ� BorderLayout���� �����Ѵ�.
		JLabel label1 = new JLabel("���ڸ� �����Ͻÿ�: ");//���� ����� "���ڸ� �����Ͻÿ�: "�� �����Ѵ�.
		
		JTextField label2 = new JTextField(10);//ũ�Ⱑ 10�� �ؽ�Ʈ�ʵ带 �����.(����ڰ� ������ ������ �Է���)
		label2.setEnabled(false);//�ؽ�Ʈ�ʵ带 ���� �����ϰ� �����.
		
		JTextField field1 = new JTextField(15);//ũ�Ⱑ 15�� �ؽ�Ʈ�ʵ带 �����.(��Ʈ�� ��µ� �κ�)
		JButton button1 = new JButton("�� ����");//"�� ����"�� �������ִ� ��ư�� �����.
		
		button1.addActionListener(e->{//�� ������ ������ ��� ���信 �ش��ϴ� ���� ���� �����Ѵ�.
			num = (int)(Math.random()*100) + 1;
		});
		
		JButton button2 = new JButton("����");//"����"�� �������ִ� ��ư�� �����.
		
		button2.addActionListener(e->{//���ᰡ ������ ��� ���α׷��� �����Ѵ�.
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
		
		Color c = label2.getBackground();//�����ϰ�� ���� ������� �������� ���� ������ ���� ������ ���´�.
		
		field1.addKeyListener(new KeyListener() {//����ڰ� ���� �Է��ϰ� ����Ű�� ������ �� �Է��� ���� ���� �̺�Ʈ�� ó���ϱ� ���� Ű�����ʸ� �����.
			public void keyPressed(KeyEvent e)
			{
				int keycode = e.getKeyCode();
				if(keycode == KeyEvent.VK_ENTER)//����Ű�� ������ ��� ����� ���� ��Ʈ�� �ؽ�Ʈ�ʵ忡 ����Ѵ�.
				{
					
					predict = Integer.parseInt(field1.getText());
					if(predict == num)
					{
						label2.setText("      �����Դϴ�.");
						label2.setBackground(c);
					}
					else if(predict > num)
					{
						label2.setText("    �ʹ� Ů�ϴ�.");
						label2.setBackground(Color.red);
					}
					else
					{
						label2.setText("    �ʹ� �۽��ϴ�.");
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
