class Dog//���� ���� ������ ������ �ִ� Ŭ���� Dog�� �����.
{
	int age;//���̸� ��Ÿ�� ������ �μ� age�� �����Ѵ�.
	String name;//�̸��� ��Ÿ�� ���ڿ� ������ �μ� name�� �����Ѵ�.
	String color;//���� ��Ÿ�� ���ڿ� ������ �μ� color�� �����Ѵ�.
	static int count = 0;//���� ��ü�� ��� �����Ǿ����� ��Ÿ�� ���� ���� count�� �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
	
	Dog(String name,int age, String color)//�����ڸ� �����Ѵ�.
	{
		this.age = age;//�Է¹��� age�� ��ü�� age�� �����Ѵ�.
		this.name = name;//�Է¹��� name�� ��ü�� name�� �����Ѵ�.
		this.color = color;//�Է¹��� color�� ��ü�� color�� �����Ѵ�.
		count++;//count = count + 1�� �����Ѵ�.
	}
}


public class DogInfo 
{

	public static void main(String[] args) 
	{
		Dog dog1 = new Dog("Molly", 10, "brown");//DogŬ������ ��ü�� ����� �� ��ü�� �������� ������� dog1�� �ִ´�. �������� �Ű��������� "Molly", 10, "brown"�� �����Ѵ�.
		Dog dog2 = new Dog("Daisy", 6, "black");//DogŬ������ ��ü�� ����� �� ��ü�� �������� ������� dog1�� �ִ´�. �������� �Ű��������� "Daisy", 6, "black"�� �����Ѵ�.
		Dog dog3 = new Dog("Bella", 7, "white");//DogŬ������ ��ü�� ����� �� ��ü�� �������� ������� dog1�� �ִ´�. �������� �Ű��������� "Bella", 7, "white"�� �����Ѵ�.
		
		System.out.println("������ #1 = " + dog1.name + ", " + dog1.age + ", " + dog1.color);
		System.out.println("������ #2 = " + dog2.name + ", " + dog2.age + ", " + dog2.color);
		System.out.println("������ #3 = " + dog3.name + ", " + dog3.age + ", " + dog3.color);
		System.out.println("������� ������ �������� �� = " + Dog.count);//������ �������� ���� ����Ѵ�. ���������� �ѹ��� �����Ǿ� ��ü �����ø��� �ʱ�ȭ���� �����Ƿ� Dog.count���� 3�� ���ԵǾ� �ִ�.
	}

}
