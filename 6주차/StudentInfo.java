class Person//클래스 Person을 만든다. Person은 이름을 나타낼 Stirng타입의 name, id를 나타낼 int타입의 id를 필드변수로 가지고 있으며 정보를 출력해주는 printInfo메서드를 가지고 있다.
{
	String name;
	int id;
	
	Person(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	void printInfo()
	{
		System.out.print("{name =  \"" + name + "\", id = " + id);
	}
}

class Student extends Person//Person클래스를 상속받는 Student클래스를 만든다.
{
	double gpa;
	int credits;
	
	Student(String name, int id, double gpa, int credits)//name, id, gpa, credits를 입력받아 필드값에 초기화하도록 생성자를 만든다.
	{
		super(name, id);//부모 클래스의 생성자에서 name과 id는 초기화하였으므로 그것을 오버라이딩해 사용한다.
		this.gpa = gpa;
		this.credits = credits;
	}

	void printInfo()//부모 클래스에서 name과 id를 출력하는 것을 제작하였으므로 그것을 오버라이딩한후 나머지 데이터를 출력하도록 printInfo를 만든다.
	{
		super.printInfo();
		System.out.println(", gpa = " + gpa + ", credits = " + credits + " }");
		
	}
}

class Employee extends Person//Person클래스를 상속받는 Employee클래스를 만든다.
{
	int salary;
	int years;
	Employee(String name, int id, int salary, int years)//name, id, salary, years를 입력받아 필드값에 초기화하도록 생성자를 만든다.
	{
		super(name, id);//부모 클래스의 생성자에서 name과 id는 초기화하였으므로 그것을 오버라이딩해 사용한다.
		this.salary = salary;
		this.years = years;
	}
	
	void printInfo()//부모 클래스에서 name과 id를 출력하는 것을 제작하였으므로 그것을 오버라이딩한후 나머지 데이터를 출력하도록 printInfo를 만든다.
	{
		super.printInfo();
		System.out.println(", salary = " + salary + ", years = " + years + " }");
	}
}


public class StudentInfo
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("steve jobs", 1, 3.9, 30);
		Employee e1 = new Employee("Jeff Bezos", 2, 10000, 10);
		Employee e2 = new Employee("Bill Gates", 3, 20000, 15);
		Employee e3 = new Employee("steve jobs", 4, 30000, 20);//정보를 입력한다.
		

		
		if("steve jobs".equals(s1.name))
			s1.printInfo();
		if("steve jobs".equals(e1.name))
			e1.printInfo();
		if("steve jobs".equals(e2.name))
			e2.printInfo();
		if("steve jobs".equals(e3.name))
			e3.printInfo();
			//String클래스의 equals를 이용하여 이름이 steve jobs인 객체를 찾는다.
	}
}
