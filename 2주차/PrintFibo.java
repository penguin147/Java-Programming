import java.util.Scanner;

public class PrintFibo 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//����ڷκ��� ���� �Է¹ޱ����� ScannerŬ������ ��ü�� �����Ѵ�. ��ü�� �̸��� scan���� �Ѵ�.
		System.out.println("����� ���� ����: ");//"����� ���� ����: "�� ����Ѵ�.
		int how_many = scan.nextInt();//���° �ױ����� ���Ұ����� ������ ������ ���� how_many�� �����ϰ� scan��ü�� �޼��� nextInt()�� �̿��� �Է¹��� ������ �����Ѵ�.
		int num1 = 1;//������ ����num1�� �����ϰ� 0���� �ʱ�ȭ�Ѵ�. 
		int num2 = 0;//������ ���� num2�� �����ϰ� 1�� �ʱ�ȭ�Ѵ�.
		int num3 = 1;//������ ���� num3�� �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		
		for(int i = 0; i < how_many; i++)//int = 0���� ����ڷκ��� �Է¹��� ���° �ױ��� �Ǻ���ġ ������ ����Ұ����� ��Ÿ���� how_many�̸����� i�� 1�� ���ذ��� �ݺ��Ѵ�.
		{
			System.out.print(num3 + " ");//num3�� ����Ѵ�.
			num3 = num1 + num2;
			num2 = num1;
			num1 = num3;
		}//�Ǻ���ġ ������ n��° �װ� n + 1��° ���� ���� ���� n + 2��° ���� �Ǵ� �����̹Ƿ� n + 2��° ���� num3, n��° ���� num1, n + 1��° ���� num2�� ��Ÿ���� �����Ͽ����ϴ�.

	}

}
