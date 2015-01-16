//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import java.awt.Color;
import static java.lang.System.*; 

public class Monster
{
	private int weight;
	private int height;
	private int age;

	public Monster()
	{
	   setMonster(0, 0, 0);
	}

	public Monster(int ht)
	{
	   setMonster(ht, 0, 0);
	}

	public Monster(int ht, int wt)
	{
	   setMonster(ht, wt, 0);
	}

	public Monster(int ht, int wt, int age)
	{
	   setMonster(ht, wt, age);
	}

	public void setMonster(int ht, int wt, int age)
	{
	   setHeight(ht);
	   setWeight(wt);
	   setAge(age);		
	}

	public void setHeight( int ht)
	{
		height = ht;
	}

	public void setWeight(int wt)
	{
		weight = wt;

	}

	public void setAge( int ag)
	{
		age = ag;
	}

	public int getHeight()
	{
	   return height;
	}

	public int getWeight()
	{
	   return weight;
	}

	public int getAge()
	{
	   return age;
	}
	
	public Color getColor()
	{
		return null;
	}

	public String toString( )
	{
		return getHeight() + " " + getWeight() + " " + getAge();
	}
}