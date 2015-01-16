//© A+ Computer Science
// www.apluscompsci.com

//Recursion example 6 

import static java.lang.System.*;

public class RecursionSix
{
	public static int fun(int x, int y)
	{
		if(x==0)
			return x;
		else
			return x+fun(y-1,x);
	}

	public static void main( String[] args )
	{
    	out.println(fun(4,4));
	}
}