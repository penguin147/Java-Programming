import java.util.Scanner;

class Rectangle //사각형의 왼쪽 꼭짓점의 좌표 x, y ,사각형의 가로길이와 세로길이를 필드로 갖고 면적을 계산해 반환해주는 getArea()메서드, 사각형의 정보를 출력해주는 print()메서드를 가진 클래스를 생성한다.
{
	int x, y, w, h;
	
	int getArea()
	{
		return w * h;
	}
	
	void print()
	{
		System.out.println("이 사각형의 왼쪽 위쪽의 꼭짓점의 좌표는 (" + x +", " + y + ")이고 사각형의 면적은 " + getArea() + "입니다.");
	}
}



public class MakeRactangle 
{

	public static void main(String[] args) 
	{
		Rectangle rac1 = new Rectangle();//Rectangle()을 이용하기 위해 객체를 생성하고 그 참조값을 rac1이라는 참조변수에 저장한다.
		Scanner scan = new Scanner(System.in);//사용자로부터 값을 입력받기위해 Scanner의 객체를 생성하고 scan이라는 참조변수에 저장한다.
		System.out.println("왼쪽 위의 꼭짓점의 x좌표는?");
		rac1.x = scan.nextInt();//사용자로부터 입력받은 정수를 rac1객체의 필드x에 저장한다.
		System.out.println("왼쪽 위의 꼭짓점의 y좌표는?");
		rac1.y = scan.nextInt();//사용자로부터 입력받은 정수를 rac1객체의 필드y에 저장한다.
		System.out.println("사각형의 가로길이는?");
		rac1.w = scan.nextInt();//사용자로부터 입력받은 정수를 rac1객체의 필드w에 저장한다.
		System.out.println("사각형의 세로길이는?");
		rac1.h = scan.nextInt();//사용자로부터 입력받은 정수를 rac1객체의 필드h에 저장한다.
		
		rac1.print();//rac1객체의 메서드 rac1을 이용해 사각형의 정보를 출력한다.
		
	}

}
