import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
class Vehicle extends JFrame//JFrameŬ������ ��ӹ޴� VehicleŬ������ �����.
{
	public Vehicle()
	{
		setSize(180, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void paint(Graphics g)//JFrame�� paint�޼��带 �������̵��� ������ �簢���� �׸��� �۾��� �߰��Ѵ�.
	{
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawRect(40, 40, 100, 50);
	}
}
class Bus extends Vehicle//Vehicle�� ��ӹ޴� Ŭ���� Bus�� �����.
{
	public void paint(Graphics g)//�θ�Ŭ������ paint�޼��带 �������̵��� ���������� �� �ΰ��� ���� �׷��ִ� �۾��� �߰��Ѵ�.
	{
		super.paint(g);
		g.drawArc(50, 80, 20, 20, 0, 360);
		g.drawArc(110, 80, 20, 20, 0, 360);
	}
}
class Car extends Vehicle//Vehicle�� ��ӹ޴� Ŭ���� Car�� �����.
{	
	public void paint(Graphics g)//�θ�Ŭ������ paint�޼��带 �������̵��� �ڵ����� ����� �������� ������ �׸��� �۾��� �߰��Ѵ�.
	{
		super.paint(g);
		g.drawRect(15, 65, 25, 25);
		g.drawRect(140, 65, 25, 25);
		g.drawArc(50, 80, 20, 20, 0, 360);
		g.drawArc(110, 80, 20, 20, 0, 360);		
	}
}
public class CarRace 
{
	public static void main(String[] args) throws InterruptedException 
	{
		int count = 0,num = 0;
		int[] location = new int[11];//�ڵ����� ���� x��ǥ�� ��Ÿ�� ������ �迭 location�� �����Ѵ�.
		int[] ylocation = new int[11];//�ڵ����� ���ٷ� �����Ǵ� y��ǥ�� ������ ������ �迭 ylocation�� �����Ѵ�.
		Vehicle[] vehicle = new Vehicle[10];//Vehicle�� ������ �� �ִ� ��ü�迭 vehicle�� �����Ѵ�.
		
		for(int i = 0; i < vehicle.length; i++)
		{
			if(i < 5)//vehicle[0]���� vehicle[4]������ ������������ CarŬ������ ��ü�� �������� �����Ѵ�.
				vehicle[i] = new Car();
			else
				vehicle[i] = new Bus();//vehicle[5]���� vehicle[9]������ ������������ BusŬ������ ��ü�� �������� �����Ѵ�.
			
			ylocation[i+1] = ylocation[i] + 110;
		}
		
		while(num != 1)
		{
			for(int i = 0; i< vehicle.length; i++)
			{
				vehicle[i].setLocation(location[i] += (int)(Math.random() * 30), ylocation[i]);//i��° vehicle�� x��ġ�� 0~30��ŭ �����ϰ� �̵���Ų��.
				if(location[i] >= 1500)//���� i��°�� x��ǥ�� 1500�̻��� �ȴٸ� �����Ѵ�.
				{
					num = 1;
					count = i+1;
				}
			}
			Thread.sleep(100);
		}
		
		System.out.println(count + "��° ���� �¸��Ͽ����ϴ�.");
	}
}
