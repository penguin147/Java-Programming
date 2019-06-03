import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Iterator;




public class MonsterGame extends JFrame implements ActionListener
{
	ArrayList<Monster> monsters = new ArrayList<Monster>();//몬스터를 저장하는 동적객체배열 monsters를 만든다.
	int x = (int)(Math.random()*520);
	int y = (int)(Math.random()*120);	
	int mouseX,mouseY;
	int index;
	Iterator it;
	
	
	Timer timer;
	
	class Monster
	{
		int x,y,hp;
		Image img;
		
		Monster(int x, int y, int hp)
		{
			this.x = x;
			this.y = y;
			this.hp = hp;
			ImageIcon icon = new ImageIcon("e:\\monster.png");
			img = icon.getImage();
		}
		
		public void draw(Graphics g)
		{
			g.drawImage(img,x,y,null);
		}
		
		
	}

	

	class MyPanel extends JPanel
	{
		int index;
		
		Iterator it = monsters.iterator();
		public MyPanel()
		{
			addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent event)
				{
					mouseX = event.getX();
					mouseY = event.getY();
					
					for(int i = 0; i < monsters.size(); i++)
					{
						int MonsterX = monsters.get(i).x;
						int MonsterY = monsters.get(i).y;
						if(MonsterX <= mouseX && MonsterX + 80 >= mouseX && MonsterY <= mouseY && MonsterY+80 >= mouseY)
						{
							monsters.get(i).hp--;
						}
						if(monsters.get(i).hp <= 0)
						{
							monsters.remove(i);
						}
						
					}
					
					
					
					
					
				}
			});
		}
		public void paintComponent(Graphics g)
		{
			
		
			super.paintComponents(g);
			monsters.add(new Monster(x,y,3));
			
			
			index = 0;
			for(Monster obj : monsters)
			{


				obj.draw(g);
				index++;
			}
			
			
		}
		

	}
	
	public void update()
	{
		x = (int)(Math.random()*520);
		y = (int)(Math.random()*120);
	}
	
	
	
	MonsterGame()
	{
		setTitle("Monster Catch Game");
		setSize(800,200);
		
		add(new MyPanel());
		
		Timer timer = new Timer(1000,this);
		timer.start();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		update();
		repaint();
		System.out.println("hi");
		if(monsters.size() >= 20)
		{
			System.out.println("game over");
			System.exit(1);
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		MonsterGame a = new MonsterGame();
	}
}
