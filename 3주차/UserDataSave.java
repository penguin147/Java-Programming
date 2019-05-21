import java.util.ArrayList;
import java.util.Scanner;



class User//������� �����͸� ������ Ŭ���� User�� �����Ѵ�.
{
	String userid, password;//���ڿ� ������ userid, password�� �����Ѵ�.
	static int count;//�������� ���� ���� count�� �����Ѵ�.
	
	public User(String userId, String password)//�����ڸ� �����Ѵ�.�Ű������� ���ڿ� ������ userId, password�� �޴´�.
	{
		this.userid = userId;//Ŭ������ �ʵ� userid�� ������ ȣ��� �Է¹��� userId�� �����Ѵ�.
		this.password = password;//Ŭ������ �ʵ� password�� ������ ȣ��� �Է¹��� password�� �����Ѵ�.
	}
}

public class UserDataSave 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String id, password;
		int chosen_num = 0;
		ArrayList<User> user_info = new ArrayList<User>();//User�� ���������� �迭�� �������� �����Ѵ�.
		
		while (chosen_num != 4)//chosen_num�� 4�� �ƴҶ� �ݺ��Ѵ�. chosen_num�� 4��� Exit�̴�.
		{
			System.out.println("===========================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("===========================");
			System.out.print("��ȣ�� �Է��Ͻÿ�: ");
			chosen_num = scan.nextInt();
			
			if(chosen_num == 1)//Sign Up�� �����Ͽ��ٸ�
			{
				
				System.out.print("id : ");
				id = scan.next();
				System.out.print("Password: ");
				password = scan.next();
				user_info.add(new User(id, password));//id�� password�� ����ڷκ��� �޾Ƽ� ���� �迭�� �����Ѵ�.
			}
			else if(chosen_num == 2)//Login�� �����Ͽ��ٸ�
			{
				System.out.print("���̵� �Է��Ͻÿ�: ");
				id = scan.next();
				for(User obj : user_info)//for each���� �̿��� �Է��� ���̵� �����ϰ� �Է��� ��й�ȣ�� �� ���̵��� ��й�ȣ�ΰ� �����Ѵ�.
				{
					if(obj.userid.equals(id))
					{
						System.out.print("��й�ȣ�� �Է��Ͻÿ�: ");
						password = scan.next();
						
						if(obj.password.equals(password))
							System.out.println("�α��� �Ǿ����ϴ�.");
						else
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
					else
						System.out.println("���̵� �������� �ʽ��ϴ�.");
				}
			}
			else if(chosen_num == 3)//Print All Users�� �����Ͽ��ٸ�
			{
				for(User obj : user_info)//for each���� �̿��� ��� �迭�� ���� ������ ����Ѵ�.
				{
					System.out.println("{ " + obj.userid + ", " + obj.password + " }");
				}
			}
			
		}
	}

}
