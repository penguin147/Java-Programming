import java.util.Scanner;

public class PrintArticle 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//사용자로부터 입력을 받기 위해서 Scanner클래스의 메서드를 생성한다. 그 메서드의 이름은 scan으로 한다. 
		System.out.print("경기장은 어디입니까? ");//"경기장은 어디입니까?"를 출력한다.
		String stadium = scan.nextLine();//어떤 경기장이었는지를 사용자로부터 입력받기위해 String형 변수 stadium을 선언하고 scan객체의 메서드 nextLine()을 이용해 입력받은 문자열을 저장한다.
		System.out.print("이긴팀은 어디입니까? ");//"이긴팀은 어디입니까?"를 출력한다.
		String winner = scan.nextLine();//이긴 팀의 이름을 사용자로부터 입력받기위해 String형 변수 winner를 선언하고 scan객체의 메서드 nextLine()을 이용해 입력받은 문자열을 저장한다.
		System.out.print("진팀은 어디입니까? ");//"진팀은 어디입니까?"를 출력한다.
		String looser = scan.nextLine();//진 팀의 이름을 사용자로부터 입력받기위해 String형 변수 looser를 선언하고 scan객체의 메서드 nextLine()을 이용해 입력받은 문자열을 저장한다.
		System.out.print("우수선수는 누구입니까? ");//"우수선수는 어디입니까?"를 출력한다.
		String Vip = scan.nextLine();//우수선수의 이름을 사용자로부터 입력받기위해 String형 변수 Vip를 선언하고 scan객체의 메서드 nextLine()을 이용해 입력받은 문자열을 저장한다.
		System.out.print("스코어는 몇대몇입니까? ");//"스코어는 어디입니까?"를 출력한다.
		String score = scan.nextLine();//몇대 몇이었는지를 사용자로부터 입력받기위해 String형 변수 score를 선언하고 scan객체의 메서드 nextLine()을 이용해 입력받은 문자열을 저장한다.
		
		System.out.println("===========================");
		System.out.println("오늘 " + stadium + "에서 야구 경기가 열렸습니다.");
		System.out.println(winner + "과" + looser + "은 치열한 공방전을 펼쳤습니다.");
		System.out.println(Vip + "이 맹활약을 하였습니다.");
		System.out.println("결국 " + winner + "가" + looser + "를 " + score + "로 이겼습니다.");
		System.out.println("===========================");//위에 정보를 토대로 기사를 작성한다.
		

	}

}
