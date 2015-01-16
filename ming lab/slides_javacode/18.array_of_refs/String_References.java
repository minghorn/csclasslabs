//© A+ Computer Science
// www.apluscompsci.com

//string references example

import static java.lang.System.*;

public class String_References
{
	public static void main ( String[] args )
	{
		String x = new String("Chuck");
		String y = x;

		if(x==y)
			out.println("x and y store the same memory address!" );

		if(x.equals(y))
			out.println("x and y refer to the same value!\n\n" );


		x = "Chuck";
		y = "Chuck";

		if(x==y)
			out.println("x and y store the same memory address!" );

		if(x.equals(y))
			out.println("x and y refer to the same value!\n\n" );


		x = new String("Chuck");
		y = new String("Chuck");

		if(x==y)
			out.println("x and y store the same memory address!" );

		if(x.equals(y))
			out.println("x and y refer to the same value!\n\n" );


		x = new String("Chuck");
		y = "Chuck";

		if(x==y)
			out.println("x and y store the same memory address!" );

		if(x.equals(y))
			out.println("x and y refer to the same value!\n\n" );


		x = "Chuck";
		y = x;
		x = null;

		out.println(x);
		out.println(y);
	}
}