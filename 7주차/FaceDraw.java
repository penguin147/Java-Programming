import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.*;

public class FaceDraw extends JFrame 
{
	
	public FaceDraw()
	{
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");

		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);

		
		g.setColor(Color.YELLOW);
		g.fillOval(60, 70, 200, 200);
		g.fillOval(50,90,50,50);
		g.fillOval(220,90,50,50);
		g.setColor(Color.BLACK);
		g.fillArc(95, 70, 130, 70, -180, -180);
		g.drawLine(165, 170, 165, 200);
		
		g.drawLine(140, 170, 100, 160);
		g.drawLine(140, 190, 100, 200);
		g.drawLine(140, 180, 100, 180);

		g.drawLine(230, 160, 190, 170);
		g.drawLine(230, 200, 190, 190);
		g.drawLine(230, 180, 190, 180);
		
		g.drawArc(100, 120, 50, 50, 180, -180);
		g.drawArc(190, 120, 50, 50, 180, -180);
		g.drawArc(110, 170, 100, 70, 180, 180);
	}
	
	
	public static void main(String args[])
	{
		FaceDraw a = new FaceDraw();
		
	}
}
