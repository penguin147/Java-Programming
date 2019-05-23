class Circle//CircleŬ������ �����. �������� ��Ÿ���� double�� radius, ���� ��Ÿ���� StringŸ���� color �ʵ庯���� ������ �� ���� private�̴�. ����
//getter�� setter�� ����� ���� �����ϵ��� �Ѵ�. �׸��� radius �� color�� �⺻���� ���� 1.0, red�̸� toStirng�޼��带 �������� ȣ��� ��ü�� ������ ��ȯ�ϵ��� �Ѵ�.
//���� ���̸� ��ȯ�ϴ� �޼��� get_area()�� �����.
{
	private double radius;
	private String color;
	
	public Circle()
	{
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double radius)
	{
		super();
		this.radius = radius;
	}
	
	
	Circle(double radius, String color)
	{
		super();
		this.radius = radius;
		this.color = color;
	}
	
	double getRadius()
	{
		return radius;
	}
	
	String getColor()
	{
		return color;
	}
	
	void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	void setColor(String color)
	{
		this.color = color;
	}
	
	public String toString()
	{
		return "Circle[radius=" + radius + ", color = " + color;
	}
	
	double get_area()
	{
		return radius * radius * 3.14;
	}
	
}

class Pizza extends Circle//CircleŬ������ ��ӹ޴� PizzaŬ������ �����.������ ������ �ǹ��ϴ� StringŸ���� type, ������ ������ �ǹ��ϴ� intŸ���� price�� �ʵ庯���� ������
//������ ������ ������ �⺻���� ���� pparoni, 20���� �ϰ� ���� �Է��Ҽ� �ֵ��� �����ڸ� �����.
{
	String type;
	int price;
	
	Pizza()
	{
		type = "paparoni";
		price = 20;
	}
	Pizza(String type, int price)
	{
		this.type = type;
		this.price = price;
	}
}

public class MakePizza 
{
	public static void main(String[] args) 
	{
		Pizza p1 = new Pizza();//��ü�� ���鶧 �����ڿ� �ƹ��͵� ���� �����Ƿ� type�� price�� �⺻���� paparoni�� 20�� �ȴ�.���� ���������� �ʾ����Ƿ� ������ �⺻���� �ȴ�.
		Pizza p2 = new Pizza("pineapple",10);//��ü�� ���鶧 "pineapple"�� 10�� �����Ƿ� �� ���� type�� price�� �ȴ�.
		p2.setRadius(2.0);//p2�� radius�� 2.0���� �Ѵ�.
		
		if(p1.get_area() == p2.get_area())//���� p1�� ���̿� p2�� ���̰� ������ �����Ѵ�.
			System.out.println("�Ȱ��ƿ�");
		else if(p1.get_area() > p2.get_area())//���� p1�� ���̰� p2�� ���̺��� ũ�� �����Ѵ�.
			System.out.println("p1�� �� Ŀ��");
		else//���� p1�� ���̰� p2�� ���̺��� ������ �����Ѵ�.
			System.out.println("p2�� �� Ŀ��");
	}
}

