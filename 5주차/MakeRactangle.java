import java.util.Scanner;

class Rectangle //�簢���� ���� �������� ��ǥ x, y ,�簢���� ���α��̿� ���α��̸� �ʵ�� ���� ������ ����� ��ȯ���ִ� getArea()�޼���, �簢���� ������ ������ִ� print()�޼��带 ���� Ŭ������ �����Ѵ�.
{
	int x, y, w, h;
	
	int getArea()
	{
		return w * h;
	}
	
	void print()
	{
		System.out.println("�� �簢���� ���� ������ �������� ��ǥ�� (" + x +", " + y + ")�̰� �簢���� ������ " + getArea() + "�Դϴ�.");
	}
}



public class MakeRactangle 
{

	public static void main(String[] args) 
	{
		Rectangle rac1 = new Rectangle();//Rectangle()�� �̿��ϱ� ���� ��ü�� �����ϰ� �� �������� rac1�̶�� ���������� �����Ѵ�.
		Scanner scan = new Scanner(System.in);//����ڷκ��� ���� �Է¹ޱ����� Scanner�� ��ü�� �����ϰ� scan�̶�� ���������� �����Ѵ�.
		System.out.println("���� ���� �������� x��ǥ��?");
		rac1.x = scan.nextInt();//����ڷκ��� �Է¹��� ������ rac1��ü�� �ʵ�x�� �����Ѵ�.
		System.out.println("���� ���� �������� y��ǥ��?");
		rac1.y = scan.nextInt();//����ڷκ��� �Է¹��� ������ rac1��ü�� �ʵ�y�� �����Ѵ�.
		System.out.println("�簢���� ���α��̴�?");
		rac1.w = scan.nextInt();//����ڷκ��� �Է¹��� ������ rac1��ü�� �ʵ�w�� �����Ѵ�.
		System.out.println("�簢���� ���α��̴�?");
		rac1.h = scan.nextInt();//����ڷκ��� �Է¹��� ������ rac1��ü�� �ʵ�h�� �����Ѵ�.
		
		rac1.print();//rac1��ü�� �޼��� rac1�� �̿��� �簢���� ������ ����Ѵ�.
		
	}

}
