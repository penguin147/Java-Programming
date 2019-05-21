class Dog//개에 대한 정보를 가지고 있는 클래스 Dog를 만든다.
{
	int age;//나이를 나타낼 정수형 인수 age를 선언한다.
	String name;//이름을 나타낼 문자열 형태의 인수 name을 선언한다.
	String color;//색을 나타낼 문자열 형태의 인수 color을 선언한다.
	static int count = 0;//개의 객체가 몇번 생성되었는지 나타낼 정적 변수 count를 선언하고 0으로 초기화한다.
	
	Dog(String name,int age, String color)//생성자를 생성한다.
	{
		this.age = age;//입력박은 age를 객체의 age에 대입한다.
		this.name = name;//입력박은 name을 객체의 name에 대입한다.
		this.color = color;//입력박은 color을 객체의 color에 대입한다.
		count++;//count = count + 1을 실행한다.
	}
}


public class DogInfo 
{

	public static void main(String[] args) 
	{
		Dog dog1 = new Dog("Molly", 10, "brown");//Dog클래스의 객체를 만들고 그 객체의 참조값을 참조면수 dog1에 넣는다. 생성자의 매개변수에는 "Molly", 10, "brown"을 대입한다.
		Dog dog2 = new Dog("Daisy", 6, "black");//Dog클래스의 객체를 만들고 그 객체의 참조값을 참조면수 dog1에 넣는다. 생성자의 매개변수에는 "Daisy", 6, "black"을 대입한다.
		Dog dog3 = new Dog("Bella", 7, "white");//Dog클래스의 객체를 만들고 그 객체의 참조값을 참조면수 dog1에 넣는다. 생성자의 매개변수에는 "Bella", 7, "white"을 대입한다.
		
		System.out.println("강아지 #1 = " + dog1.name + ", " + dog1.age + ", " + dog1.color);
		System.out.println("강아지 #2 = " + dog2.name + ", " + dog2.age + ", " + dog2.color);
		System.out.println("강아지 #3 = " + dog3.name + ", " + dog3.age + ", " + dog3.color);
		System.out.println("현재까지 생성된 강아지의 수 = " + Dog.count);//생성된 강아지의 수를 출력한다. 정적변수는 한번만 생성되어 객체 생성시마다 초기화되지 않으므로 Dog.count에는 3이 대입되어 있다.
	}

}
