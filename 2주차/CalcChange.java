import java.util.Scanner;

public class CalcChange
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//사용자로부터 값을 입력받기위해 Scanner클래스의 객체를 생성한다. 객체의 이름을 scan으로 한다.
		System.out.println("투입한 돈: ");//"투입한 돈: "을 출력한다.
		int in_money = scan.nextInt();//투입한 돈의 액수를 저장할 정수형 변수 in_money를 선언하고 scan객체의 nextInt()메서드를 이용해 in_money에 사용자로부터 받은 정수를 대입한다.
		System.out.println("물건값: ");//"물건값: "을 출력한다.
		int price = scan.nextInt();//물건의 가격을 저장할 정수형 변수 price를 선언하고 scan객체의 nextInt()메서드를 이용해 price에 사용자로부터 받은 정수를 대입한다.
		int change = in_money - price;//거스름돈을 저장할 정수형 변수 charge를 선언하고 in_money - price의 값을 대입한다.
		System.out.println("거스름돈: " + change);//"거스름돈" + charge를 출력한다.
		
		System.out.println("500원 동전의 개수: " + change/500);//거스름돈을 줄때 500원 동전의 개수를 최대로 하려면 거스름돈/500의 몫이므로 이를 출력한다.
		System.out.println("100원 동전의 개수: " + (change%500)/100);//500원동전으로 주고 남은 돈을 100원동전으로 주려면 거스름돈을 500으로 나눈 나머지를 100으로 나눈 몫이므로 이를 출력한다.
		

	}

}
