class Complex//Ŭ���� Complex�� �����Ѵ�.
{
	int  real, imag;//������ �ʵ� real�� imag�� �����Ѵ�.
	String complex;//���ڿ� ������ �ʵ� complex�� �����Ѵ�.
	Complex(int real, int imag)//�����ڸ� �����Ѵ�. �Ű������δ� ������ real�� imag�� �޴´�.
	{
		this.real = real;//������ ȣ��ÿ� �Է¹��� real�� Ŭ������ �ʵ� real�� �����Ѵ�.
		this.imag = imag;//������ ȣ��ÿ� �Է¹��� imag�� Ŭ������ �ʵ� imag�� �����Ѵ�.
		this.complex = Integer.toString(real) + "+" + Integer.toString(imag) + "i";//Ŭ������ �ʵ� complex�� a + bi���°� �ǵ��� �����Ѵ�.(a�� b�� ���� real�� imag) 
	}
	


}

public class ComplexDef 
{

	public static void main(String[] args) 
	{
		Complex c1 = new Complex(10,20);//Complex��ü�� ����� �� �������� �������� c1�� �����Ѵ�. �����ڿ��� 10�� 20�� �Է��Ѵ�.
		System.out.println(c1.complex);
	}

} 
