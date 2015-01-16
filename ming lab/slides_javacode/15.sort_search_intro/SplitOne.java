//© A+ Computer Science
// www.apluscompsci.com

//String split() example 1

import static java.lang.System.*;

public class SplitOne
{
	public static void main(String args[])
	{
		String s  = "one two four five";
		String[] words = s.split(" ");
		out.println(words[0]);
		out.println(words[1]);
		out.println(words[3]);
	}
}
