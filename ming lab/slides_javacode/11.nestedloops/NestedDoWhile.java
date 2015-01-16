//© A+ Computer Science
// www.apluscompsci.com

//nested do while loop example

public class NestedDoWhile
{
   public static void main(String args[])
   {
		int outer=1;
		do
		{
			int inner=1;
			do
			{
				System.out.println(outer + " " + inner);
				inner++;
			}while(inner<=3);
			System.out.println( );
			outer= outer+1;
		}while(outer<=2);
	}
}