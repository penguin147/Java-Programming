public class PrintPrimeSum
{

	public static void main(String[] args) 
	{
		
		int num = 34;//정수형 변수 num을 선언하고 34를 대입한다.
		boolean flag;	//논리형 변수 flag를 선언한다.
		
		for(int i = 2; i <= num/2; i++)//i의 초기값을 2로, num/2가 i보다 작거나 같을때 반복하고 루프가 반복될때마다 i에 1씩 더한다.
		{
			flag = false;//루프의 시작지점에 flag를 false로 초기화한다.

			for(int j = 2; j < i; ++j)//j의 초기값을 2로 j가 i보다 작을때 반복하고 루프가 반복될때마다 j에 1씩 더한다.
			{
					if(i % j ==0) //만약 i를 j로 나눈 나머지가 0이라면 실행한다.
					{
						flag = true; //flag에 true를 대입한다.
						break;//루프를 빠져나간다.
					}
			}//i가 보수임을 확인하는 작업이다. i를 2< j < i인 j로 나눈 나머지가 0이라면 보수이므로 flag에 true를 대입하고 루프를 빠져나간다.
			
			
			for(int j = 2; j < (num-i); ++j)//j의 초기값을 2로 j가 num - i보다 작을때 반복하고 루프가 반복될때마다 j에 1씩 더한다.
			{
					if((num-i) % j ==0)  //만약 num - i를 j로 나눈 나머지가 0이라면 실행한다.
					{
						flag = true; //flag에 true를 대입한다.
						break;//루프를 빠져나간다.
					}
			}//num - i 가 보수임을 확인하는 작업이다. i를 2< j < num - i인 j로 나눈 나머지가 0이라면 보수이므로 flag에 true를 대입하고 루프를 빠져나간다.
			
			
			if(!flag)// 만약 flag가 false라면 즉 위에 i 와 num-i 가 모두 보수라면 실행한다.
				System.out.println(num + " = " + i + " + " + (num-i));
			
		}
		
	}
}
