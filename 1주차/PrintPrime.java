public class PrintPrime 
{
	public static void main(String[] args)
	{ 
		int num = 29; //������ ���� num�� �����ϰ� 29�� �����Ѵ�.
		boolean flag = false;  //���� ���� flag�� �����ϰ� false�� �����Ѵ�.
		
		for (int i=2; i < num; ++i) //i < num�� ��� �ݺ��ϴ� �ݺ����� �ۼ��Ѵ�. �ݺ������� i�� 1�� �����ְ� i�� �ʱⰪ�� 2�� �Ѵ�.
		{
			if(num % i == 0) 	//num�� i�� ���� ���� 0�̶�� �����Ѵ�.     
			{
				flag = true;  //flag�� true�� �����Ѵ�.
				break; // ������ �����.
			}
		}// ������ 1�� �ڱ��ڽŸ����� ���������� ���̴�. ���� ������ �����Ϸ��� 1�� �ڱ��ڽ��� ������ ���� ������ (�ڱ��ڽź��� ���� ����)���� ���� �� �������� ���� ���ٸ� �� ���� ������� �� �� �ִ�.
		if(!flag) //���� flag�� false��� �����Ѵ�. �� num�� ������� ����ȴ�
			System.out.println(num + " is a prime number.");
		else //���� flag�� true��� �����Ѵ�. �� num�� ������ �ƴ϶�� ����ȴ�.
			System.out.println(num + " is not a prime number."); 

	}

}
