//© A+ Computer Science
// www.apluscompsci.com

//usedelimiter example

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class UseDelimiter
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter a sentence with dashes - in between the words :: ");

		Scanner chopper = new Scanner(keyboard.nextLine());
		chopper.useDelimiter("\\-");
		//chopper.useDelimiter("[;,\\?]");  	//specify more than one delimiter

		while(chopper.hasNext())
		{
			out.println(chopper.next());
		}
	}
}