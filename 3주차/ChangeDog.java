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

class Witch//���ο� Ŭ���� Witch�� �����Ѵ�.
{
	static int younger(int age)//���� �޼ҵ� younger�� �����Ѵ�. �Ű������δ� ������ age�� �޴´�.
	{
		age = age - 5;// �Է¹��� age�� age = age - 5�� �����Ѵ�.
		return age;//age�� ��ȯ���ش�.
	}
}


public class ChangeDog 
{

	public static void main(String[] args) 
	{
		Dog dog1 = new Dog("Molly", 10, "brown");
		Dog dog2 = new Dog("Daisy", 6, "black");
		Dog dog3 = new Dog("Bella", 7, "white");
		
		
		
		System.out.println("������ #1 = " + dog1.name + ", " + Witch.younger(dog1.age) + ", " + dog1.color);//���� �޼ҵ�� ���� ��ü�� ������ �ʾƵ� ������ �� �ִ�. Witch.younger�� �̿��� ���� ���̸� 5 ���ҽ�Ų��.
		System.out.println("������ #2 = " + dog2.name + ", " + Witch.younger(dog2.age) + ", " + dog2.color);//���� �޼ҵ�� ���� ��ü�� ������ �ʾƵ� ������ �� �ִ�. Witch.younger�� �̿��� ���� ���̸� 5 ���ҽ�Ų��.
		System.out.println("������ #3 = " + dog3.name + ", " + Witch.younger(dog3.age) + ", " + dog3.color);//���� �޼ҵ�� ���� ��ü�� ������ �ʾƵ� ������ �� �ִ�. Witch.younger�� �̿��� ���� ���̸� 5 ���ҽ�Ų��.
		System.out.println("������� ������ �������� �� = " + Dog.count);
	}

}
