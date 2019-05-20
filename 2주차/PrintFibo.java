import java.util.Scanner;

public class PrintFibo 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//사용자로부터 값을 입력받기위해 Scanner클래스의 객체를 생성한다. 객체의 이름은 scan으로 한다.
		System.out.println("출력할 항의 개수: ");//"출력할 항의 개수: "를 출력한다.
		int how_many = scan.nextInt();//몇번째 항까지를 더할건지를 저장할 정수형 변수 how_many를 선언하고 scan객체의 메서드 nextInt()를 이용해 입력받은 정수를 저장한다.
		int num1 = 1;//정수형 변수num1을 선언하고 0으로 초기화한다. 
		int num2 = 0;//정수형 변수 num2를 선언하고 1로 초기화한다.
		int num3 = 1;//정수형 변수 num3을 선언하고 0으로 초기화한다.
		
		for(int i = 0; i < how_many; i++)//int = 0부터 사용자로부터 입력받은 몇번째 항까지 피보나치 수열을 출력할건지를 나타내는 how_many미만까지 i을 1씩 더해가며 반복한다.
		{
			System.out.print(num3 + " ");//num3을 출력한다.
			num3 = num1 + num2;
			num2 = num1;
			num1 = num3;
		}//피보나치 수열은 n번째 항과 n + 1번째 항을 더한 값이 n + 2번째 항이 되는 수열이므로 n + 2번째 항은 num3, n번째 항은 num1, n + 1번째 항은 num2로 나타내어 제작하였습니다.

	}

}
