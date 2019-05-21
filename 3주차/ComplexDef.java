class Complex//클래스 Complex를 생성한다.
{
	int  real, imag;//정수형 필드 real과 imag를 선언한다.
	String complex;//문자열 형태의 필드 complex를 선언한다.
	Complex(int real, int imag)//생성자를 생성한다. 매개변수로는 정수형 real과 imag를 받는다.
	{
		this.real = real;//생성자 호출시에 입력받은 real을 클래스의 필드 real에 대입한다.
		this.imag = imag;//생성자 호출시에 입력받은 imag을 클래스의 필드 imag에 대입한다.
		this.complex = Integer.toString(real) + "+" + Integer.toString(imag) + "i";//클래스의 필드 complex에 a + bi형태가 되도록 저장한다.(a와 b는 각각 real과 imag) 
	}
	


}

public class ComplexDef 
{

	public static void main(String[] args) 
	{
		Complex c1 = new Complex(10,20);//Complex객체를 만들고 그 참조값을 참조변수 c1에 저장한다. 생성자에는 10과 20을 입력한다.
		System.out.println(c1.complex);
	}

} 
