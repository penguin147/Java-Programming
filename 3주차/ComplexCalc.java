class Complex
{
	int  real, imag;
	String complex;
	Complex(int real, int imag)
	{
		this.real = real;
		this.imag = imag;
		this.complex = Integer.toString(real) + "+" + Integer.toString(imag) + "i"; 
	}
	

	String Complex_add(Complex o1, Complex o2)//Complex객체를 참조하는 참조변수 o1과 o2를 매개변수로 입력받고 실수형 변수를 반환하는 메소드 Complex_add를 생성한다.
	{
		int real, imag;
		
		real = o1.real + o2.real;//real에 매개변수로 입력받은 o1과 o2의 real을 더해 대입한다.
		imag = o1.imag + o2.imag;//imag에 매개변수로 입력받은 o1과 o2의 imag을 더해 대입한다.
		
		return Integer.toString(real) + "+" + Integer.toString(imag) + "i";// a + bi형태로 만등러 반환한다.(a와 b는 각각 real과 imag) 
		
	}

}

public class ComplexCalc 
{

	public static void main(String[] args) 
	{
		Complex c1 = new Complex(10,20);
		Complex c2 = new Complex(30,40);
		System.out.println(c1.complex + "와 " + c2.complex + "를 더하면 " +c1.Complex_add(c1, c2) + "가 됨");
	}

}
