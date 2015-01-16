//© A+ Computer Science
// www.apluscompsci.com

//Recursion example 4 

import static java.lang.System.*;

public class RecursionFour
{
	public int fun(int y)
	{
  		if(y<=1)
     		return 1;
  		else
     		return fun(y-2) + y;
	}

	public static void main(String[] args )
	{
    	RecursionFour test = new RecursionFour();
    	out.println(test.fun(5));
	}
}