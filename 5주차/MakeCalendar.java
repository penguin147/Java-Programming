class Date //� ��¥�� ��Ÿ���� year, month, day�� �ʵ�� ���� ��¥�� 2019.5.8�� ���� ������� ������ִ� �޼����� print1(), May 8 2019�� ���� ������� ����Y�� �޼����� print2()�� ������ Ŭ������ �����Ѵ�.

{
	int year, month, day;
	void print1()
	{
		System.out.println(year + "." + month + "." + day);
	}
	
	void print2()
	{
		switch(month)
		{
		case 1: System.out.println("January " + day + " " + year); break;
		case 2: System.out.println("February " + day + " " + year); break;
		case 3: System.out.println("March " + day + " " + year); break;
		case 4: System.out.println("April " + day + " " + year); break;
		case 5: System.out.println("May " + day + " " + year); break;
		case 6: System.out.println("June " + day + " " + year); break;
		case 7: System.out.println("July " + day + " " + year); break;
		case 8: System.out.println("August " + day + " " + year); break;
		case 9: System.out.println("September " + day + " " + year); break;
		case 10: System.out.println("November " + day + " " + year); break;
		case 11: System.out.println("October " + day + " " + year); break;
		default: System.out.println("December " + day + " " + year); break;
		}
	}
}


public class MakeCalendar 
{

	public static void main(String[] args) 
	{
		Date date = new Date();//Date()Ŭ������ �̿��ϱ� ���� ��ü�� �����ϰ� date��� ���������� �������� �����Ѵ�.
		date.year = 2019;//date�� ����Ű�� ��ü�� �ʵ� year�� 2019�� �����Ѵ�.
		date.month = 3;//date�� ����Ű�� ��ü�� �ʵ� month�� 2019�� �����Ѵ�.
		date.day = 21;//date�� ����Ű�� ��ü�� �ʵ� day�� 2019�� �����Ѵ�.
		date.print1();//date�� ����Ű�� ��ü�� �޼��� print1()�� �����Ѵ�.
		date.print2();//date�� ����Ű�� ��ü�� �޼��� print2()�� �����Ѵ�.
	}

}
