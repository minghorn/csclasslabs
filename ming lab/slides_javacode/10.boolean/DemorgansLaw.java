//© A+ Computer Science  -  www.apluscompsci.com

//Boolean algebra demorgan's law

import static java.lang.System.*;

public class DemorgansLaw
{
	public static void main(String args[])
	{
		boolean c = true, s = false;

		out.println("DEMORGAN'S LAW - UIL and AP!\n");
		out.println("c == " + c);
		out.println("s == " + s + '\n');
		out.println( "!(c || s) == " + (!(c||s)));
		out.println( "!c && !s  == " + (!c&&!s));
		out.println( "!(c && s) == " + (!(c&&s)));
		out.println( "!c || !s  == " + (!c||!s));
	}
}