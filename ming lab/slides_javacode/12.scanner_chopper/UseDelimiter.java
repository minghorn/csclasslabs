//© A+ Computer Science
// www.apluscompsci.com

//Scanner example usedelimiter

import java.util.Scanner;
import static java.lang.System.*;

public class UseDelimiter
{
	public static void main(String args[])
	{
		Scanner  chopper = new Scanner("one-two-three");
		
		chopper.useDelimiter("\\-");
		//chopper.useDelimiter("[\\-\\+\\?\\^]");
		//chopper.useDelimiter("\\p{Punct}");
				
		while(chopper.hasNext())
		{
		   out.println(chopper.next());
		}
	}
}