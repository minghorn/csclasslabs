//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
	private String suit;
	private int face;

  	//constructors
  	public Card( String s, int f)
  	{
  		suit = s;
  		face = f;
  	}

	// modifiers
	public void setFace( int f)
	{
		face = f;
	}

	public void setSuit( String s)
	{
		suit = s;
	}

  	//accessors
	public String getSuit()
	{
		return suit;
	}

	public int getFace()
	{
		return face;
	}

  	//toString
  	public String toString()
  	{
  		return FACES[face] + " of " + suit;
  	}
 }