import java.util.ArrayList;
import java.util.Scanner;



class User//사용자의 데이터를 저장할 클래스 User를 생성한다.
{
	String userid, password;//문자열 형태의 userid, password를 선언한다.
	static int count;//정수형의 정젹 변수 count를 선언한다.
	
	public User(String userId, String password)//생성자를 생성한다.매개변수로 문자열 형태의 userId, password를 받는다.
	{
		this.userid = userId;//클래스의 필드 userid에 생성자 호출시 입력받은 userId를 대입한다.
		this.password = password;//클래스의 필드 password에 생성자 호출시 입력받은 password를 대입한다.
	}
}

public class UserDataSave 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String id, password;
		int chosen_num = 0;
		ArrayList<User> user_info = new ArrayList<User>();//User의 참조변수의 배열을 동적으로 선언한다.
		
		while (chosen_num != 4)//chosen_num이 4가 아닐때 반복한다. chosen_num이 4라면 Exit이다.
		{
			System.out.println("===========================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("===========================");
			System.out.print("번호를 입력하시오: ");
			chosen_num = scan.nextInt();
			
			if(chosen_num == 1)//Sign Up을 선택하였다면
			{
				
				System.out.print("id : ");
				id = scan.next();
				System.out.print("Password: ");
				password = scan.next();
				user_info.add(new User(id, password));//id와 password를 사용자로부터 받아서 동적 배열에 대입한다.
			}
			else if(chosen_num == 2)//Login을 선택하였다면
			{
				System.out.print("아이디를 입력하시오: ");
				id = scan.next();
				for(User obj : user_info)//for each문을 이용해 입력한 아이디가 존재하고 입력한 비밀번호가 그 아이디의 비밀번호인가 구분한다.
				{
					if(obj.userid.equals(id))
					{
						System.out.print("비밀번호를 입력하시오: ");
						password = scan.next();
						
						if(obj.password.equals(password))
							System.out.println("로그인 되었습니다.");
						else
							System.out.println("비밀번호가 틀렸습니다.");
					}
					else
						System.out.println("아이디가 존재하지 않습니다.");
				}
			}
			else if(chosen_num == 3)//Print All Users를 선택하였다면
			{
				for(User obj : user_info)//for each문을 이용해 모든 배열의 값에 접근해 출력한다.
				{
					System.out.println("{ " + obj.userid + ", " + obj.password + " }");
				}
			}
			
		}
	}

}
