import javax.swing.JFrame;



public class FrameRace 
{

	public static void main(String[] args) throws InterruptedException 
	{
		int f1Location = 0, f2Location = 0;//�� �������� x��ǥ�� ����ų ������ ���� f1Location�� f2Location�� �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		JFrame f1 = new JFrame("Frame1");//JFrameŬ������ ��ü�� �����ϰ� f1�̶�� ���������� �������� �����Ѵ�. 
		JFrame f2 = new JFrame("Frame2");//JFrameŬ������ ��ü�� �����ϰ� f2�̶�� ���������� �������� �����Ѵ�. 
		f1.setSize(300, 200);//f1�� ����Ű�� ��ü�� setSize()��� �޼��带 �̿��� �������� ũ�⸦ �������ش�.
		f2.setSize(300, 200);//f1�� ����Ű�� ��ü�� setSize()��� �޼��带 �̿��� �������� ũ�⸦ �������ش�.
		
		f1.setVisible(true);//f1�� ����Ű�� ��ü�� setVisible(True)�� �̿��� �����찡 ���̰� �Ѵ�.
		f2.setVisible(true);//f2�� ����Ű�� ��ü�� setVisible(True)�� �̿��� �����찡 ���̰� �Ѵ�.
		
		while(f1Location <= 1500 && f2Location <= 1500)//f1Locationr�� f2Location�� ��� 1500�����϶� �ݺ��Ѵ�.
		{
			f1.setLocation(f1Location += (int)(Math.random() * 30), 20);//f1�� ����Ű�� ��ü�� setLocation()�̶�� �޼��带 �̿��ϰ� Math.random()�� �̿��� f1�ǰ�ü�� ������ �������� x��ǥ�� y��ǥ�� �������ش�.
			f2.setLocation(f2Location += (int)(Math.random() * 30), 50);//f2�� ����Ű�� ��ü�� setLocation()�̶�� �޼��带 �̿��ϰ� Math.random()�� �̿��� f2�ǰ�ü�� ������ �������� x��ǥ�� y��ǥ�� �������ش�.

			Thread.sleep(100);//0.1�ʰ� �����.

		}//�ݺ����� f1Location�� f2Location�� 1500�����϶� �ݺ������μ� ������� x��ǥ�� 1500���� �����Ͽ����ϴ�.

		if(f1Location > 1500)//f1Location�� 1500�̻��̶�� �����Ѵ�.
			System.out.println("f1�� �¸��߽��ϴ�!");//"f1�� �¸��߽��ϴ�!"�� ����Ѵ�.
		else if(f2Location > 1500)//f2Location�� 1500�̻��̶�� �����Ѵ�.
			System.out.println("f2�� �¸��߽��ϴ�!");//"f2�� �¸��߽��ϴ�!"�� ����Ѵ�.
		else//f1Location == f1Locaion�ϰ�� �����Ѵ�.
			System.out.println("���º��Դϴ�!");//"���º��Դϴ�!"�� ����Ѵ�.

	}

}
