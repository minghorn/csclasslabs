//© A+ Computer Science
// www.apluscompsci.com

//array of references class example

import static java.lang.System.*;

public class Creature
{
	private int size;
	
	public Creature(int girth) { 
		size=girth; 
	}
	
	public void setSize(int girth)
	{
		size=girth;
	}
	
	public boolean equals(Object obj)
	{
		Creature other = (Creature)obj;
		if(size==other.size)
			return true;
		return false;   	
	}
	
	public String toString() 
	{ 
		return "" + size; 
	}
}