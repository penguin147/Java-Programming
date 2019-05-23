class Person//Ŭ���� Person�� �����. Person�� �̸��� ��Ÿ�� StirngŸ���� name, id�� ��Ÿ�� intŸ���� id�� �ʵ庯���� ������ ������ ������ ������ִ� printInfo�޼��带 ������ �ִ�.
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

class Student extends Person//PersonŬ������ ��ӹ޴� StudentŬ������ �����.
{
	double gpa;
	int credits;
	
	Student(String name, int id, double gpa, int credits)//name, id, gpa, credits�� �Է¹޾� �ʵ尪�� �ʱ�ȭ�ϵ��� �����ڸ� �����.
	{
		super(name, id);//�θ� Ŭ������ �����ڿ��� name�� id�� �ʱ�ȭ�Ͽ����Ƿ� �װ��� �������̵��� ����Ѵ�.
		this.gpa = gpa;
		this.credits = credits;
	}

	void printInfo()//�θ� Ŭ�������� name�� id�� ����ϴ� ���� �����Ͽ����Ƿ� �װ��� �������̵����� ������ �����͸� ����ϵ��� printInfo�� �����.
	{
		super.printInfo();
		System.out.println(", gpa = " + gpa + ", credits = " + credits + " }");
		
	}
}

class Employee extends Person//PersonŬ������ ��ӹ޴� EmployeeŬ������ �����.
{
	int salary;
	int years;
	Employee(String name, int id, int salary, int years)//name, id, salary, years�� �Է¹޾� �ʵ尪�� �ʱ�ȭ�ϵ��� �����ڸ� �����.
	{
		super(name, id);//�θ� Ŭ������ �����ڿ��� name�� id�� �ʱ�ȭ�Ͽ����Ƿ� �װ��� �������̵��� ����Ѵ�.
		this.salary = salary;
		this.years = years;
	}
	
	void printInfo()//�θ� Ŭ�������� name�� id�� ����ϴ� ���� �����Ͽ����Ƿ� �װ��� �������̵����� ������ �����͸� ����ϵ��� printInfo�� �����.
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
		Employee e3 = new Employee("steve jobs", 4, 30000, 20);//������ �Է��Ѵ�.
		

		
		if("steve jobs".equals(s1.name))
			s1.printInfo();
		if("steve jobs".equals(e1.name))
			e1.printInfo();
		if("steve jobs".equals(e2.name))
			e2.printInfo();
		if("steve jobs".equals(e3.name))
			e3.printInfo();
			//StringŬ������ equals�� �̿��Ͽ� �̸��� steve jobs�� ��ü�� ã�´�.
	}
}
