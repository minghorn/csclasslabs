//© A+ Computer Science
// www.apluscompsci.com

//String split() example 2

import static java.lang.System.*;
import java.util.Scanner;

public class SplitTwo
{
	public static void print(String[] stringRay)
   {
   	for(String word : stringRay)
	 	{
	 	   out.println(word);
		}
   }

	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(in);

		String sent = "one two three four";
		out.println("split \" \" ---> "+sent);
		String[] list = sent.split(" ");
	 	print(list);

		out.print("\nEnter a sentence with dashes(-) :: ");
		String s = keyboard.nextLine();
		list = s.split("\\-");
	 	print(list);
		out.println("\n");

		out.print("Enter a sentence with punctuation :: ");
		s = keyboard.nextLine();
		list = s.split("\\p{Punct}");
		print(list);
	 	out.println("\n");

 		out.print("Enter a sentence with punctuation :: ");
		s = keyboard.nextLine();
		list = s.split("\\W+");
		print(list);
	 	out.println("\n");
	}
}