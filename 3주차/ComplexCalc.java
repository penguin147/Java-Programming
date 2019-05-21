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
	

	String Complex_add(Complex o1, Complex o2)//Complex��ü�� �����ϴ� �������� o1�� o2�� �Ű������� �Է¹ް� �Ǽ��� ������ ��ȯ�ϴ� �޼ҵ� Complex_add�� �����Ѵ�.
	{
		int real, imag;
		
		real = o1.real + o2.real;//real�� �Ű������� �Է¹��� o1�� o2�� real�� ���� �����Ѵ�.
		imag = o1.imag + o2.imag;//imag�� �Ű������� �Է¹��� o1�� o2�� imag�� ���� �����Ѵ�.
		
		return Integer.toString(real) + "+" + Integer.toString(imag) + "i";// a + bi���·� ��� ��ȯ�Ѵ�.(a�� b�� ���� real�� imag) 
		
	}

}

public class ComplexCalc 
{

	public static void main(String[] args) 
	{
		Complex c1 = new Complex(10,20);
		Complex c2 = new Complex(30,40);
		System.out.println(c1.complex + "�� " + c2.complex + "�� ���ϸ� " +c1.Complex_add(c1, c2) + "�� ��");
	}

}
