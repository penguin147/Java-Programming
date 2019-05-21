class Dog
{
	int age;
	String name;
	String color;
	static int count = 0;
	
	Dog(String name,int age, String color)
	{
		this.age = age;
		this.name = name;
		this.color = color;
		count++;
	}
}

class Witch//새로운 클래스 Witch를 생성한다.
{
	static int younger(int age)//정적 메소드 younger를 생성한다. 매개변수로는 정수형 age를 받는다.
	{
		age = age - 5;// 입력받은 age에 age = age - 5를 실행한다.
		return age;//age를 반환해준다.
	}
}


public class ChangeDog 
{

	public static void main(String[] args) 
	{
		Dog dog1 = new Dog("Molly", 10, "brown");
		Dog dog2 = new Dog("Daisy", 6, "black");
		Dog dog3 = new Dog("Bella", 7, "white");
		
		
		
		System.out.println("강아지 #1 = " + dog1.name + ", " + Witch.younger(dog1.age) + ", " + dog1.color);//정적 메소드는 따로 객체를 만들지 않아도 선언할 수 있다. Witch.younger를 이용해 개의 나이를 5 감소시킨다.
		System.out.println("강아지 #2 = " + dog2.name + ", " + Witch.younger(dog2.age) + ", " + dog2.color);//정적 메소드는 따로 객체를 만들지 않아도 선언할 수 있다. Witch.younger를 이용해 개의 나이를 5 감소시킨다.
		System.out.println("강아지 #3 = " + dog3.name + ", " + Witch.younger(dog3.age) + ", " + dog3.color);//정적 메소드는 따로 객체를 만들지 않아도 선언할 수 있다. Witch.younger를 이용해 개의 나이를 5 감소시킨다.
		System.out.println("현재까지 생성된 강아지의 수 = " + Dog.count);
	}

}
