//© A+ Computer Science
// www.apluscompsci.com

//monster equals example

import static java.lang.System.*;

class Monster
{
   private int height;

   public Monster()
   {
      height=0;
   }

   public Monster(int ht)
   {
   	setHeight(ht);
   }

   public void setHeight(int ht)
   {
   	height=ht;
   }

   public boolean equals(Object obj)
   {
   	Monster other = (Monster)obj;
   	if(getHeight()==other.getHeight())
   	   return true;
   	return false;
   }

   public int getHeight()
   {
   	return height;
   }

   public String toString()
   {
      return ""+ getHeight();
   }
}

public class Equals
{
	public static void main ( String[] args )
	{
		Monster one = new Monster();
		out.println(one);

		Monster two = new Monster(902);
		out.println(two);

		out.println("Monster 1 equals Monster 2 == " + one.equals(two));
	}
}