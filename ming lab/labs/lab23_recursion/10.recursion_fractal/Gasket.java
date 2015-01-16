//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class Gasket extends Canvas implements Runnable
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Gasket()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLUE);
		window.setFont(new Font("ARIAL",Font.BOLD,24));
		window.drawString("Sierpinski's Gasket", 25, 50);

		gasket(window, (WIDTH-10)/2, 20, WIDTH-40, HEIGHT-20, 40, HEIGHT-20);
	}

	public void gasket(Graphics window, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		//base case goes here
			//make a random color here
			//draw lines to make a triangle or use fillPolygon
			//make some recursive calls
	}

	public void run()
	{
		try{
		  	Thread.currentThread().sleep(3);
		}
		catch(Exception e)
		{
		}
	}
}