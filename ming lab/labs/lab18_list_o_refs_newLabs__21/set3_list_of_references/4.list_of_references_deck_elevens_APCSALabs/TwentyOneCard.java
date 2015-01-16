//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TwentyOneCard extends Card
{
	private int value;

  	//constructors
  	public TwentyOneCard( String s, int f)
  	{
  		super( s, f );
  	}

  	//accessors
	public int getValue()
	{
		if( getFace() == 1 )
			return 11;
		if( getFace() >= 10 )
			return 10;
		return getFace();
	}

  	//toString
  	public String toString()
  	{
  		return super.toString() + " " + getValue();
  	}
 }