class Counter//Ŭ���� Counter�� �����Ѵ�.
{
	int counter;//counter���� ������ ���� �ʵ带 �����Ѵ�.
	void up()//����ɶ����� counter�� ���� 1�� �÷��� �޼��� up()�� �����Ѵ�.
	{
		counter++;
	}
	
	int getCount()//counter���� �����ϴ� �������̴�.
	{
		return counter;
	}
	
}


public class ClassMake
{

	public static void main(String[] args) 
	{
		Counter cnt = new Counter();//Counter()Ŭ������ ��ü�� �����ϰ� �� �̸��� cnt��� �Ѵ�.
		cnt.counter = 100;//cnt�� �ʵ� counter�� 100�� �����Ѵ�.
		cnt.up();//Counter()�� �޼��� up()�� �̿��� cnt.countr�� ���� 1�� ���Ѵ�.
		cnt.up();
		cnt.up();

		
		System.out.println(cnt.getCount());//getCount()�޼��带 �̿��� ��ücnt�� counter���� �����ϰ� �װ��� ����Ѵ�.
	}

}
