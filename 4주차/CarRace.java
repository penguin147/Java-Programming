import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
class Vehicle extends JFrame//JFrame클래스를 상속받는 Vehicle클래스를 만든다.
{
	public Vehicle()
	{
		setSize(180, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void paint(Graphics g)//JFrame의 paint메서드를 오버라이드해 검정색 사각형을 그리는 작업을 추가한다.
	{
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawRect(40, 40, 100, 50);
	}
}
class Bus extends Vehicle//Vehicle을 상속받는 클래스 Bus를 만든다.
{
	public void paint(Graphics g)//부모클래스의 paint메서드를 오버라이드해 바퀴역할을 할 두개의 원을 그려주는 작업을 추가한다.
	{
		super.paint(g);
		g.drawArc(50, 80, 20, 20, 0, 360);
		g.drawArc(110, 80, 20, 20, 0, 360);
	}
}
class Car extends Vehicle//Vehicle을 상속받는 클래스 Car을 만든다.
{	
	public void paint(Graphics g)//부모클래스의 paint메서드를 오버라이드해 자동차의 모양이 나오도록 도형을 그리는 작업을 추가한다.
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
		int[] location = new int[11];//자동차가 갈때 x좌표를 나타낼 정수형 배열 location을 생성한다.
		int[] ylocation = new int[11];//자동차가 한줄로 나열되는 y좌표를 저장할 정수형 배열 ylocation을 생성한다.
		Vehicle[] vehicle = new Vehicle[10];//Vehicle을 저장할 수 있는 객체배열 vehicle을 생성한다.
		
		for(int i = 0; i < vehicle.length; i++)
		{
			if(i < 5)//vehicle[0]부터 vehicle[4]까지의 참조변수에는 Car클래스의 객체의 참조값을 대입한다.
				vehicle[i] = new Car();
			else
				vehicle[i] = new Bus();//vehicle[5]부터 vehicle[9]까지의 참조변수에는 Bus클래스의 객체의 참조값을 대입한다.
			
			ylocation[i+1] = ylocation[i] + 110;
		}
		
		while(num != 1)
		{
			for(int i = 0; i< vehicle.length; i++)
			{
				vehicle[i].setLocation(location[i] += (int)(Math.random() * 30), ylocation[i]);//i번째 vehicle의 x위치를 0~30만큼 랜덤하게 이동시킨다.
				if(location[i] >= 1500)//만약 i번째의 x좌표가 1500이상이 된다면 실행한다.
				{
					num = 1;
					count = i+1;
				}
			}
			Thread.sleep(100);
		}
		
		System.out.println(count + "번째 차가 승리하였습니다.");
	}
}
