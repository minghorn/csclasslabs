//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

package BlackJack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import static java.lang.System.*;
import javax.swing.JPanel;

import BlackJack.Card;
import BlackJack.BlackJackCard;
import BlackJack.Deck;
import BlackJack.AbstractPlayer;
import BlackJack.Player;
import BlackJack.Dealer;

public class BlackJack extends JPanel implements KeyListener
{
   private Dealer dealer;
	private Player player;
	private boolean start;
	private boolean hit;
	private boolean finish;
	private boolean show;
	private Font font;

	public BlackJack()
	{
		setBackground(Color.WHITE);
		font = new Font("TAHOMA",Font.BOLD,12);
				
		this.addKeyListener(this);

		dealer = new Dealer();
		player = new Player();
	}

	public void paintComponent( Graphics window )
	{
		super.paintComponent(window);
		
		window.setColor( Color.blue );
		window.setFont(font);
		window.drawString("BlackJack GUI", 25, 50 );
		window.drawString("PRESS B to start/restart the game.",25,100);
		window.drawString("PRESS H to hit - PLAYER",325,100);
		window.drawString("PRESS F to finish(DEALER hits).",25,130);
		window.drawString("PRESS X to see the results.",325,130);

		if(start==true)
		{
			//reset the dealer and player hands
			
			
			
			//add two cards to dealer and player
			
			
			

			
			start=false;
		}
		else if(hit==true)
		{
			//add a card to player
			hit=false;
		}
		else if(finish==true)
		{
			//hit dealer until he says to stop
	      finish=false;
		}
		else if(show==true)
		{
			//determine who won the game
		
		
		
		
		
		
		}
		
		window.drawString("DEALER ",50,190);
		dealer.drawHand(window,0,190);

		window.drawString("PLAYER ",50,365);
		player.drawHand(window,0,365);		
	}

   public void keyTyped(KeyEvent e)
	{
		if(e.getKeyChar() == 'b' || e.getKeyChar() == 'B')
		{
			start=true;
			repaint();
		}
		else if(e.getKeyChar() == 'h' || e.getKeyChar() == 'H')
		{
			hit=true;
			repaint();
		}
		else if(e.getKeyChar() == 'f' || e.getKeyChar() == 'F')
		{
			finish=true;
			repaint();
		}
		else if(e.getKeyChar() == 'x' || e.getKeyChar() == 'X')
		{
			show=true;
			repaint();
		}
	}

   public void keyReleased(KeyEvent e)
	{
	}

	public void keyPressed(KeyEvent e)
	{
	}	
}