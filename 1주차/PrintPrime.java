public class PrintPrime 
{
	public static void main(String[] args)
	{ 
		int num = 29; //정수형 변수 num을 선언하고 29를 대입한다.
		boolean flag = false;  //논리형 변수 flag를 선언하고 false를 대입한다.
		
		for (int i=2; i < num; ++i) //i < num일 경우 반복하는 반복문을 작성한다. 반복때마다 i를 1씩 더해주고 i의 초기값은 2로 한다.
		{
			if(num % i == 0) 	//num을 i로 나눈 값이 0이라면 실행한다.     
			{
				flag = true;  //flag에 true를 대입한다.
				break; // 루프를 벗어난다.
			}
		}// 보수란 1과 자기자신만으로 나누어지는 수이다. 따라서 보수를 선별하려면 1과 자기자신을 제외한 수로 나누어 (자기자신보다 작은 수들)만약 몫이 딱 떨어지는 수가 없다면 그 수는 보수라고 할 수 있다.
		if(!flag) //만약 flag가 false라면 실행한다. 즉 num이 보수라면 실행된다
			System.out.println(num + " is a prime number.");
		else //만약 flag가 true라면 실행한다. 즉 num이 보수가 아니라면 실행된다.
			System.out.println(num + " is not a prime number."); 

	}

}
