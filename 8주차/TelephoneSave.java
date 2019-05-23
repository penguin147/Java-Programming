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
		};//�Ǽ��� �迭 labels�� �����ϰ� ��ȭ��ȣ �Է±⿡ ��ư�鿡 �� ���ڿ��� �ʱ�ȭ�Ѵ�.
		
		JPanel panel1 = new JPanel();//JPanelŬ������ ��ü�� �����ϰ� panel1�� �� �������� �ִ´�.
		JPanel panel2 = new JPanel();//JPanelŬ������ ��ü�� �����ϰ� panel2�� �� �������� �ִ´�.
		JPanel panel3 = new JPanel();//JPanelŬ������ ��ü�� �����ϰ� panel3�� �� �������� �ִ´�.
		JPanel panel4 = new JPanel();//JPanelŬ������ ��ü�� �����ϰ� panel4�� �� �������� �ִ´�.
		


		panel1.setLayout(new GridLayout(0,3,0,0));//panel1�� ���̾ƿ��� 0��3���� gridlayout���� �����Ѵ�.
		panel2.setLayout(new GridLayout(1,1));//panel1�� ���̾ƿ��� 1��1���� gridlayout���� �����Ѵ�.
		panel3.setLayout(new GridLayout(1,1));//panel1�� ���̾ƿ��� 1��1���� gridlayout���� �����Ѵ�.

	
		
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField text = new JTextField(20);//JTextFieldŬ������ ��ü�� ����� text�� �� �������� �ִ´�. JTextField�� �ؽ�Ʈ�ڽ��� ���� ������ ����ִ� Ŭ�����̴�.
		panel2.add(text);//panel2�� text�� �߰��Ѵ�.
		
		JButton[] b= new JButton[15];//JButtonŬ������ �������� �迭 b�� 15�� �����.
		JButton b1 = new JButton("clear");//JButtonŬ������ ��ü�� ����� b1�� �� �������� �����Ѵ�.
		b1.addActionListener(e->{
			text.setText("");
		});//���ٽ��� �̿��� b1�� �̺�Ʈ �߻��� setText("")�� �����ϵ��� �Ѵ�. �̴� b1�� ������ �� �ؽ�Ʈ�ڽ��� �ʱ�ȭ�ϰڴٴ� �ǹ��̴�.
		panel3.add(b1);//panel3�� b1�� �߰��Ѵ�.
		
		int index = 0;
		
		for(int rows = 0; rows < 3; rows++)
		{
			for(int cols = 0; cols < 5; cols++)
			{
				b[index] = new JButton(labels[index]);
				panel1.add(b[index]);
				
				index++;
			}
		}//panel1�� �� ���� 5��, �� 3���� ������ JButton�� ������ panel1�� �����ǰ� �Ѵ�. JButton���� labels�迭�� ������ ������� ����. 
		
		b[0].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[0]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[1].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[1]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[2].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[2]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[3].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[3]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[4].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[4]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[5].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[5]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[6].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[6]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[7].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[7]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[8].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[8]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[9].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[9]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[10].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[10]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.
		b[11].addActionListener(e ->
		{
			
			String curStr = text.getText();
			text.setText(curStr + labels[11]);
			
		});//���ٽ��� �̿��� �� JButton�� �̺�Ʈ�� �߻����� �� �� JButton�� ������ �ִ� ���� �ؽ�Ʈ�ڽ��� �߰��ǵ��� �Ѵ�.


		b[12].addActionListener(e->{
			System.out.println(text.getText());
		});//���ٽ��� �̿��� b[12]��ư�� �̺�Ʈ�� �߻����� ��, �ؽ�Ʈ�ڽ��� �ִ� ���� ����ϵ��� �Ѵ�.
		
		b[14].addActionListener(e->{
			System.exit(0);
		});//���ٽ��� �̿��� b[14]��ư�� �̺�Ʈ�� �߻����� ��, ���α׷��� ����ǵ��� �Ѵ�.
		
		
		panel3.setSize(50,150);//panel3�� ũ�⸦ ���� 50, ���� 150���� �Ѵ�.
		add("North",panel2);//panel2�� ���ʿ� ��ġ�ϵ��� �Ͽ� �߰��Ѵ�.
		add("East",panel3);//panel3�� ���ʿ� ��ġ�ϵ��� �Ͽ� �߰��Ѵ�.
		add("Center",panel1);//panel1�� �߾ӿ� ��ġ�ϵ��� �Ͽ� �߰��Ѵ�.
	
		setSize(300,200);//������������ ũ�⸦ 300,200���� �Ѵ�.
		setVisible(true);//������������ ���̵��� �Ѵ�.
	}
	
	public static void main(String args[])
	{
		TelephoneSave hi = new TelephoneSave();//Day1Ŭ������ ��ü�� ����� hi ��� ���������� �� �������� �����Ѵ�.
	}
}
