//© A+ Computer Science  -  www.apluscompsci.com

//Boolean algebra law of absorption

import static java.lang.System.*;

public class AbsorptionLaw
{
	public static void main(String args[])
	{
		System.out.println("LAW OF ABSORPTION - UIL and AP!\n");

		boolean c = false;
		boolean s = true;
		boolean i = c && (c||s);
		out.println("c == " + c);
		out.println("s == " + s);
		System.out.println("c && (c||s) = " + i + "\n\n");

		c = true;
		s = false;
		i = c || (c&&s);
		out.println("c == " + c);
		out.println("s == " + s);
		System.out.println("c || (c&&s) = " + i);
	}
}