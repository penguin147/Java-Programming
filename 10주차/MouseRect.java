import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class MouseRect extends JFrame
{
	int x = 50,y = 50;
	int nowx,nowy;
	int squareLocationx = 0,squareLocationy = 0;
	
	class MyPanel extends JPanel
	{
		public MyPanel()
		{

			
			addMouseMotionListener(new MouseAdapter() 
			{
				public void mouseDragged(MouseEvent e)
				{
					x = e.getX();
					y = e.getY();
					

					repaint();
					
					//x+100,y+100¾È¿¡ ¸¶¿ì½º°¡ ÀÕ¾î¾ß´ï
					
				
			
					
				}
			});
		}
			
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(x-50, y-50, 100, 100);
		}

	}
	

	

	
	public MouseRect()
	{
		setSize (700,300);
		setVisible(true);
		
		add(new MyPanel());
		
		

		
	}


	
	public static void main(String[] args)
	{
		
		MouseRect a = new MouseRect();
	}





}
