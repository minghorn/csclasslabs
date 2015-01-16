//© A+ Computer Science
// www.apluscompsci.com

public class Monster
{
	private int myAge, mySize;

	public Monster() 
	{ 
		myAge = mySize = 0; 
	}

	public Monster(int age)
	{
	   myAge = age;
	   mySize = 0;
	}

	public Monster(int age, int size)
	{
	   myAge = age;
	   mySize = size;
	}

	public void setAge( int age)
	{ 
		myAge = age; 	
	}

	public int getAge()
	{ 
		return myAge; 
	}

	public boolean equals( Object obj )
	{
		Monster other = (Monster) obj;
		if( obj == null )
			return false;
		return myAge == other.myAge && mySize == other.mySize;
	}

	public String toString()
	{
		return myAge + " " + mySize;
	}
}