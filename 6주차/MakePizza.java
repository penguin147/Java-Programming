class Circle//Circle클래스를 만든다. 반지름을 나타내는 double형 radius, 색을 나타내는 String타입의 color 필드변수를 가지며 이 둘은 private이다. 따라서
//getter와 setter를 만들어 값에 접근하도록 한다. 그리고 radius 와 color의 기본값은 각각 1.0, red이며 toStirng메서드를 재정의해 호출시 객체의 정보를 반환하도록 한다.
//원의 넓이를 반환하는 메서드 get_area()도 만든다.
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

class Pizza extends Circle//Circle클래스를 상속받는 Pizza클래스를 만든다.피자의 종류를 의미하는 String타입의 type, 피자의 가격을 의미하는 int타입의 price를 필드변수로 가지며
//피자의 종류와 가격의 기본값은 각각 pparoni, 20으로 하고 따로 입력할수 있도록 생성자를 만든다.
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
		Pizza p1 = new Pizza();//객체를 만들때 생성자에 아무것도 넣지 않으므로 type과 price는 기본값인 paparoni와 20이 된다.따로 설정해주지 않았으므로 면적은 기본값이 된다.
		Pizza p2 = new Pizza("pineapple",10);//객체를 만들때 "pineapple"과 10을 넣으므로 이 둘이 type과 price가 된다.
		p2.setRadius(2.0);//p2의 radius를 2.0으로 한다.
		
		if(p1.get_area() == p2.get_area())//만약 p1의 넓이와 p2의 넓이가 같으면 실행한다.
			System.out.println("똑같아요");
		else if(p1.get_area() > p2.get_area())//만약 p1의 넓이가 p2의 넓이보다 크면 실행한다.
			System.out.println("p1이 더 커요");
		else//만약 p1의 넓이가 p2의 넓이보다 작으면 실행한다.
			System.out.println("p2가 더 커요");
	}
}

