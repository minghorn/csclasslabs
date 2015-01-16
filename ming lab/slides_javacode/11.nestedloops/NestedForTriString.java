//© A+ Computer Science
// www.apluscompsci.com

//nested for loop example

public class NestedForTriString
{
   public static void main(String args[])
   {
		int stop=11;
		String output="";
		for(int r=1; r<=stop; r++)  //rows
		{
		   for(int c=1; c<=r; c++)   //columns
		      output+="<";
		   output+="\n";
		}
		System.out.println(output);
	}
}