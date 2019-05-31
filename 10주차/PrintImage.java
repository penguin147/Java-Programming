
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class PrintImage extends JFrame implements ActionListener
{
	int x;
	int xSpeed = 3;
	class MyPanel extends JPanel
	{
		ImageIcon icon = new ImageIcon("e:\\rocket.png");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img, x, 0, this);
		}
	}
	
	public void update()
	{
		x += xSpeed;
		if(x > 900)
		{
			xSpeed = 0;
		}
	}
	
	public PrintImage()
	{
		setSize (1000,200);
		setVisible(true);
		
		add(new MyPanel());
		Timer timer = new Timer(10,this);
		timer.start();
		

		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		update();
		repaint();
		System.out.println("hi");
	}
	
	public static void main(String[] args)
	{
		
		PrintImage a = new PrintImage();
	}



}
