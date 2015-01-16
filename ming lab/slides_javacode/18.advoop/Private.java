//© A+ Computer Science
// www.apluscompsci.com

//monster private example

import static java.lang.System.*;

class Monster
{
	private int weight;
	public String bad;
	
	public Monster( )
	{
		weight=0;
		bad = "never make data public";
	}
	
	public String toString()
	{
		return ""+weight + " " + bad;
	}	
}

public class Private
{
	public static void main ( String[] args )
	{
		Monster m = new Monster();
		System.out.println(m);		//automatically calls toString()
		
		m.bad="this is very bad programming";
		System.out.println(m.bad);		//never make data public	
	}
}