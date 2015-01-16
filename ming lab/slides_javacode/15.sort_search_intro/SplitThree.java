//© A+ Computer Science
// www.apluscompsci.com

//String split() example 3

import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class SplitThree
{
	public static void main(String args[]) throws Exception
	{
		Scanner file = new Scanner( new File("split.dat"));
		int cnt = file.nextInt();
		file.nextLine();  //need this to clear the \n out of the way

		for(int i=0; i<cnt; i++)
		{
			String[] list = file.nextLine().split(" ");
			for(int j=0; j<list.length; j++)
			{
				out.println(list[j]);
			}
			out.println("\n");
		}
	}
}