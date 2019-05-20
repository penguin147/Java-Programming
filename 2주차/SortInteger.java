import java.util.Scanner;

public class SortInteger 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//사용자로부터 입력을 받기 위해 Scanner클래스의 객체 scan을 생성한다. 객체의 이름은 scan으로 한다.
		int[] num = new int[3];//정수 3개를 저장할 길이가 3인 정수형 배열 num을 선언한다.
		
		int tmp;//정렬할 때 두 값을 바꾸기 위해 필요한 int형 변수 tmp를 선언한다.
		System.out.println("정수를 입력하시오");//"정수를 입력하시오"를 출력한다.
		for(int i = 0; i < 3; i++)//i = 0부터 i<3일때 루프가 한번 실행될 때마다 i를 1씩 더해가며 반복한다.
		{
			num[i] = scan.nextInt();//위에서 선언한 Scanner클래스의 객체 scan에 있는 nextInt()메서드를 이용해 num[i]에 변수를 입력받는다. 이때 루프를 이용해 num배열에 정수 3개를 입력받는다.
		}
		
		for(int i = 0; i < 2; i++)//i = 0부터 i < 2 일때 루프가 한번 실행될 때마다 i를 1씩 더해가며 반복한다.
		{
			for(int j = 0; j < 2; j++)//j = 0부터 j < 2일때 루프가 한번 실행될 때마다 j를 1씩 더해가며 반복한다.
			{
				if(num[j] < num[j + 1])//num[j] < num[j + 1]일 경우 실행한다.
				{
					tmp = num[j];//tmp 에 num[j]의 값을 저장한다.
					num[j] = num[j + 1];//num[j]에 num[j + 1]의 값을 저장한다.
					num[j + 1] = tmp;//num[j + 1]에 tmp에 저장했던 num[j]의 값을 저장한다.
				}
			}
		}// num배열에 들어있는 수를 크기순으로 정렬하기 위해서 버블 정렬을 사용했습니다.
		System.out.println("정렬된 숫자: " + num[0] + ' ' + num[1] + ' ' + num[2]);//"정렬된 숫자:" + num[0] + num[1] + num[2]을 출력한다.
	}

}
 