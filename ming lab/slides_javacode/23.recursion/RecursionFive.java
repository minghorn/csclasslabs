//© A+ Computer Science
// www.apluscompsci.com

//Recursion example 5 

import static java.lang.System.*;

public class RecursionFive
{
	public int fun( int x, int y)
	{
	  if(y<1)
	     return x;
	  else
	     return fun(x, y-2)+x;
	}

	public static void main(String[] args )
	{
    	RecursionFive test = new RecursionFive();
    	out.println(test.fun(4,3));
	}
}