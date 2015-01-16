//© A+ Computer Science
// www.apluscompsci.com

//nested for loop example

public class NestedForBox
{
   public static void main(String args[])
   {
   	int stop=6;		//change this value several times and rerun
   	   	
		for(int outer=1; outer<=stop; outer++)
		{
			for(int inner=1; inner<=stop; inner++)
				System.out.print("*");
			System.out.println( );
		}
	}
}
