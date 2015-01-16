//© A+ Computer Science
// www.apluscompsci.com

//String split() example 4

import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class SplitFour
{
	public static void main(String args[]) throws Exception
	{
		String s  = "10?25?109?1?23?18";
		String[] nums = s.split("\\?");
		//String[] nums = s.split("\\D+");   //split around non-digit characters
		int sum = 0;
		for(String num : nums )
		  sum += Integer.parseInt(num);
		System.out.println( sum );
	}
}