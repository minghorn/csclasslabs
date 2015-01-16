//© A+ Computer Science
// www.apluscompsci.com

//recursion example 8 with strings 

import static java.lang.System.*;

public class RecursionEight
{
	public String recur(String s)
	{
		if(s.length()>0)
			return s.charAt(s.length()-1)
			       + recur(s.substring(0,s.length()-1));
		return "";
	}

	public static void main(String args[] )
	{
		RecursionEight test = new RecursionEight();
		out.println(test.recur("zebra"));
	}
}