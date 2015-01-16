//© A+ Computer Science  -  www.apluscompsci.com

//short circuit example 1

import static java.lang.System.*;

public class ShortOne
{
	public static void main(String args[])
	{
		int total=9;
		boolean flipper = false;
		
		if(flipper || total>4)
		{
		   out.println("short");
		}
		out.println("check");
	}
}