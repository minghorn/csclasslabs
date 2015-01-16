//© A+ Computer Science
// www.apluscompsci.com

//recursion example 7 with strings 

import static java.lang.System.*;

public class RecursionSeven
{
	public String recur(String s)
	{
		if(s.length()>0)
			return recur(s.substring(0,s.length()-1)) +
			          s.charAt(s.length()-1);
		return "";
	}

	public static void main(String args[] )
	{
		RecursionSeven test = new RecursionSeven();
		out.println(test.recur("zebra"));
	}
}