class Counter//클래스 Counter를 생성한다.
{
	int counter;//counter값을 가지고 있을 필드를 선언한다.
	void up()//선언될때마다 counter의 값을 1씩 올려줄 메서드 up()을 선언한다.
	{
		counter++;
	}
	
	int getCount()//counter값에 접근하는 접근자이다.
	{
		return counter;
	}
	
}


public class ClassMake
{

	public static void main(String[] args) 
	{
		Counter cnt = new Counter();//Counter()클래스의 객체를 생성하고 그 이름을 cnt라고 한다.
		cnt.counter = 100;//cnt의 필드 counter에 100을 대입한다.
		cnt.up();//Counter()의 메서드 up()을 이용해 cnt.countr의 값에 1을 더한다.
		cnt.up();
		cnt.up();

		
		System.out.println(cnt.getCount());//getCount()메서드를 이용해 객체cnt의 counter값에 접근하고 그것을 출력한다.
	}

}
