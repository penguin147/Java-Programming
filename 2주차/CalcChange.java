import java.util.Scanner;

public class CalcChange
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//����ڷκ��� ���� �Է¹ޱ����� ScannerŬ������ ��ü�� �����Ѵ�. ��ü�� �̸��� scan���� �Ѵ�.
		System.out.println("������ ��: ");//"������ ��: "�� ����Ѵ�.
		int in_money = scan.nextInt();//������ ���� �׼��� ������ ������ ���� in_money�� �����ϰ� scan��ü�� nextInt()�޼��带 �̿��� in_money�� ����ڷκ��� ���� ������ �����Ѵ�.
		System.out.println("���ǰ�: ");//"���ǰ�: "�� ����Ѵ�.
		int price = scan.nextInt();//������ ������ ������ ������ ���� price�� �����ϰ� scan��ü�� nextInt()�޼��带 �̿��� price�� ����ڷκ��� ���� ������ �����Ѵ�.
		int change = in_money - price;//�Ž������� ������ ������ ���� charge�� �����ϰ� in_money - price�� ���� �����Ѵ�.
		System.out.println("�Ž�����: " + change);//"�Ž�����" + charge�� ����Ѵ�.
		
		System.out.println("500�� ������ ����: " + change/500);//�Ž������� �ٶ� 500�� ������ ������ �ִ�� �Ϸ��� �Ž�����/500�� ���̹Ƿ� �̸� ����Ѵ�.
		System.out.println("100�� ������ ����: " + (change%500)/100);//500���������� �ְ� ���� ���� 100���������� �ַ��� �Ž������� 500���� ���� �������� 100���� ���� ���̹Ƿ� �̸� ����Ѵ�.
		

	}

}
