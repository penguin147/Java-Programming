import java.util.Scanner;

public class PrintArticle 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);//����ڷκ��� �Է��� �ޱ� ���ؼ� ScannerŬ������ �޼��带 �����Ѵ�. �� �޼����� �̸��� scan���� �Ѵ�. 
		System.out.print("������� ����Դϱ�? ");//"������� ����Դϱ�?"�� ����Ѵ�.
		String stadium = scan.nextLine();//� ������̾������� ����ڷκ��� �Է¹ޱ����� String�� ���� stadium�� �����ϰ� scan��ü�� �޼��� nextLine()�� �̿��� �Է¹��� ���ڿ��� �����Ѵ�.
		System.out.print("�̱����� ����Դϱ�? ");//"�̱����� ����Դϱ�?"�� ����Ѵ�.
		String winner = scan.nextLine();//�̱� ���� �̸��� ����ڷκ��� �Է¹ޱ����� String�� ���� winner�� �����ϰ� scan��ü�� �޼��� nextLine()�� �̿��� �Է¹��� ���ڿ��� �����Ѵ�.
		System.out.print("������ ����Դϱ�? ");//"������ ����Դϱ�?"�� ����Ѵ�.
		String looser = scan.nextLine();//�� ���� �̸��� ����ڷκ��� �Է¹ޱ����� String�� ���� looser�� �����ϰ� scan��ü�� �޼��� nextLine()�� �̿��� �Է¹��� ���ڿ��� �����Ѵ�.
		System.out.print("��������� �����Դϱ�? ");//"��������� ����Դϱ�?"�� ����Ѵ�.
		String Vip = scan.nextLine();//��������� �̸��� ����ڷκ��� �Է¹ޱ����� String�� ���� Vip�� �����ϰ� scan��ü�� �޼��� nextLine()�� �̿��� �Է¹��� ���ڿ��� �����Ѵ�.
		System.out.print("���ھ�� �����Դϱ�? ");//"���ھ�� ����Դϱ�?"�� ����Ѵ�.
		String score = scan.nextLine();//��� ���̾������� ����ڷκ��� �Է¹ޱ����� String�� ���� score�� �����ϰ� scan��ü�� �޼��� nextLine()�� �̿��� �Է¹��� ���ڿ��� �����Ѵ�.
		
		System.out.println("===========================");
		System.out.println("���� " + stadium + "���� �߱� ��Ⱑ ���Ƚ��ϴ�.");
		System.out.println(winner + "��" + looser + "�� ġ���� �������� ���ƽ��ϴ�.");
		System.out.println(Vip + "�� ��Ȱ���� �Ͽ����ϴ�.");
		System.out.println("�ᱹ " + winner + "��" + looser + "�� " + score + "�� �̰���ϴ�.");
		System.out.println("===========================");//���� ������ ���� ��縦 �ۼ��Ѵ�.
		

	}

}
