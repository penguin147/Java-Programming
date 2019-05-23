class Date //어떤 날짜를 나타내는 year, month, day를 필드로 갖고 날짜를 2019.5.8과 같은 방식으로 출력해주는 메서드인 print1(), May 8 2019와 같은 방식으로 출력햊는 메서드인 print2()를 가지는 클래스를 생성한다.

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
		Date date = new Date();//Date()클래스를 이용하기 위해 객체를 선언하고 date라는 참조변수에 참조값을 대입한다.
		date.year = 2019;//date가 가리키는 객체의 필드 year에 2019를 대입한다.
		date.month = 3;//date가 가리키는 객체의 필드 month에 2019를 대입한다.
		date.day = 21;//date가 가리키는 객체의 필드 day에 2019를 대입한다.
		date.print1();//date가 가리키는 객체의 메서드 print1()을 실행한다.
		date.print2();//date가 가리키는 객체의 메서드 print2()을 실행한다.
	}

}
