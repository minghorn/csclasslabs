//© A+ Computer Science
// www.apluscompsci.com

//array of string references

import static java.lang.System.*;

public class ArrayOfStrings
{
	public static void main ( String[] args )
	{
		String[] list = new String[7];

		for ( int i=0; i<list.length; i++ )
		{
			out.println( "list[ " + i + " ] = " + list[i] );
		}
		out.println("\n\n");

		list[0] = "hello";
		list[1] = "world";
		list[2] = new String("objects are fun!");

		for ( int i=0; i<list.length; i++ )
		{
			out.println( "list[ " + i + " ] = " + list[i] );
		}
	}
}