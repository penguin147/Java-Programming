public class CalcEquation
{
	public static void main(String[] args) 
	{
		for(int x = 0; x <= 10; x++)//3x + 10y = 100을 만족하는 0 <= x <= 10인 모든 해를 구하기 위해 x = 0부터 10까지 루프마다 x++을 실행하며 반복한다.
		{
			for(int y = 0; y <= 10; y++)//3x + 10y = 100을 만족하는 0 <= y <= 10인 모든 해를 구하기 위해 y = 0부터 10까지 루프마다 y++을 실행하며 반복한다.
			{
				if(3 * x + 10 * y == 100)//만약 3x + 10y = 100을 만족한다면 실행한다.
				{
					System.out.println("(" + x + "," + y + ")");//(x,y)를 출력한다.(이때 x와 y는 변수의 값임)
				}
			}
		}
	}
}
