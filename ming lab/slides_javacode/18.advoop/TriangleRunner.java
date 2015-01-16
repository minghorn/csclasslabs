//© A+ Computer Science
// www.apluscompsci.com

//OOP example

import static java.lang.System.*;

public class TriangleRunner
{
	public static void main ( String[] args )
	{
		Triangle test = new Triangle(5,6,7);
		System.out.println(test);

		test.setSides(4,4,4);
		System.out.println(test);

		test.setSides(1,56,22);
		System.out.println(test);
	}
}