import java.util.Scanner;

public class SortInteger 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//����ڷκ��� �Է��� �ޱ� ���� ScannerŬ������ ��ü scan�� �����Ѵ�. ��ü�� �̸��� scan���� �Ѵ�.
		int[] num = new int[3];//���� 3���� ������ ���̰� 3�� ������ �迭 num�� �����Ѵ�.
		
		int tmp;//������ �� �� ���� �ٲٱ� ���� �ʿ��� int�� ���� tmp�� �����Ѵ�.
		System.out.println("������ �Է��Ͻÿ�");//"������ �Է��Ͻÿ�"�� ����Ѵ�.
		for(int i = 0; i < 3; i++)//i = 0���� i<3�϶� ������ �ѹ� ����� ������ i�� 1�� ���ذ��� �ݺ��Ѵ�.
		{
			num[i] = scan.nextInt();//������ ������ ScannerŬ������ ��ü scan�� �ִ� nextInt()�޼��带 �̿��� num[i]�� ������ �Է¹޴´�. �̶� ������ �̿��� num�迭�� ���� 3���� �Է¹޴´�.
		}
		
		for(int i = 0; i < 2; i++)//i = 0���� i < 2 �϶� ������ �ѹ� ����� ������ i�� 1�� ���ذ��� �ݺ��Ѵ�.
		{
			for(int j = 0; j < 2; j++)//j = 0���� j < 2�϶� ������ �ѹ� ����� ������ j�� 1�� ���ذ��� �ݺ��Ѵ�.
			{
				if(num[j] < num[j + 1])//num[j] < num[j + 1]�� ��� �����Ѵ�.
				{
					tmp = num[j];//tmp �� num[j]�� ���� �����Ѵ�.
					num[j] = num[j + 1];//num[j]�� num[j + 1]�� ���� �����Ѵ�.
					num[j + 1] = tmp;//num[j + 1]�� tmp�� �����ߴ� num[j]�� ���� �����Ѵ�.
				}
			}
		}// num�迭�� ����ִ� ���� ũ������� �����ϱ� ���ؼ� ���� ������ ����߽��ϴ�.
		System.out.println("���ĵ� ����: " + num[0] + ' ' + num[1] + ' ' + num[2]);//"���ĵ� ����:" + num[0] + num[1] + num[2]�� ����Ѵ�.
	}

}
 