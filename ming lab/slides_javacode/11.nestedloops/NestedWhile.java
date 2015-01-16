//© A+ Computer Science
// www.apluscompsci.com

//nested while loop example

public class NestedWhile
{
   public static void main(String args[])
   {
		int outer=1;
		while(outer<=2)
		{
			int inner=1;
			while(inner<=3)
			{
				System.out.println(outer + " " + inner);
				inner++;
			}
			System.out.println( );
			outer= outer+1;
		}
	}
}