//© A+ Computer Science
// www.apluscompsci.com

//File output using a for loop

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import static java.lang.System.*;

public class FileOut
{
	public static void main(String args[]) throws IOException
	{
		PrintWriter fileOut = new PrintWriter(new FileWriter("out.dat"));

		for ( int i=0; i<10; i++)
		{
		   fileOut.println(i);
		}
		fileOut.close();  //have to close the file
	}
}