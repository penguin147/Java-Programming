import javax.swing.JFrame;



public class FrameRace 
{

	public static void main(String[] args) throws InterruptedException 
	{
		int f1Location = 0, f2Location = 0;//두 윈도우의 x좌표를 가리킬 정수형 변수 f1Location과 f2Location을 선언하고 0으로 초기화한다.
		JFrame f1 = new JFrame("Frame1");//JFrame클래스의 객체를 생성하고 f1이라는 참조변수에 참조값을 대입한다. 
		JFrame f2 = new JFrame("Frame2");//JFrame클래스의 객체를 생성하고 f2이라는 참조변수에 참조값을 대입한다. 
		f1.setSize(300, 200);//f1이 가리키는 객체의 setSize()라는 메서드를 이용해 윈도우의 크기를 지정해준다.
		f2.setSize(300, 200);//f1이 가리키는 객체의 setSize()라는 메서드를 이용해 윈도우의 크기를 지정해준다.
		
		f1.setVisible(true);//f1이 가리키는 객체의 setVisible(True)를 이용해 윈도우가 보이게 한다.
		f2.setVisible(true);//f2이 가리키는 객체의 setVisible(True)를 이용해 윈도우가 보이게 한다.
		
		while(f1Location <= 1500 && f2Location <= 1500)//f1Locationr과 f2Location이 모두 1500이하일때 반복한다.
		{
			f1.setLocation(f1Location += (int)(Math.random() * 30), 20);//f1이 가리키는 객체의 setLocation()이라는 메서드를 이용하고 Math.random()을 이용해 f1의객체가 생성할 윈도우의 x좌표와 y좌표를 지정해준다.
			f2.setLocation(f2Location += (int)(Math.random() * 30), 50);//f2이 가리키는 객체의 setLocation()이라는 메서드를 이용하고 Math.random()을 이용해 f2의객체가 생성할 윈도우의 x좌표와 y좌표를 지정해준다.

			Thread.sleep(100);//0.1초간 멈춘다.

		}//반복문을 f1Location과 f2Location이 1500이하일때 반복함으로서 결승점의 x좌표를 1500으로 지정하였습니다.

		if(f1Location > 1500)//f1Location이 1500이상이라면 실행한다.
			System.out.println("f1이 승리했습니다!");//"f1이 승리했습니다!"를 출력한다.
		else if(f2Location > 1500)//f2Location이 1500이상이라면 실행한다.
			System.out.println("f2가 승리했습니다!");//"f2이 승리했습니다!"를 출력한다.
		else//f1Location == f1Locaion일경우 실행한다.
			System.out.println("무승부입니다!");//"무승부입니다!"를 출력한다.

	}

}
