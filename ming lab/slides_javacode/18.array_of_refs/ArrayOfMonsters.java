//© A+ Computer Science
// www.apluscompsci.com

//array of monster references

import static java.lang.System.*;

public class ArrayOfMonsters
{
	public static void main ( String[] args )
	{
		Monster[] list = new Monster[7];     //array of 7 Monster references

		for(int i=0; i<list.length; i++)
		{
			out.println("list[ " + i + " ] = " + list[i]);
		}
		out.println("\n\n");

		list[0] = new Monster();
		list[1] = new Monster(34);
		list[5] = new Monster(21,43);

		for(int i=0; i<list.length; i++)
		{
			out.println( "list[ " + i + " ] = " + list[i] );
		}
		out.println("\n\n");
		list[0].setAge(2131);
		list[1].setAge(777);		

		//list[3].setAge(321);    //null pointer exception
		
		for(Monster scary : list)
		{
			out.println(scary);
		}		
	}
}