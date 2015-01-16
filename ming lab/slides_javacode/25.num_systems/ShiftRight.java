//© A+ Computer Science
// www.apluscompsci.com

//bitwise shift right example 

import static java.lang.System.*;

public class ShiftRight
{
	public static void main(String args[])
	{
		int one=8;
		out.println("8 >> 1 == " + (one>>1));
		out.println("-9 >>> 1 == " + ((~one)>>>1));
		out.println("-9 >> 1 == " + ((~one)>>1));
	}
}