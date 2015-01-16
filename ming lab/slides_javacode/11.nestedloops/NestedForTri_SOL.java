//© A+ Computer Science
// www.apluscompsci.com

//nested for loop example

public class NestedForTri_SOL
{
   public static void main(String args[])
   {

   	/*
   	 	*
			**
			***
			****
			*****
			******
			*******
			********
			*********
		*/

		int stop=9;
		for(int r=1; r<=stop; r++)  //rows
		{
		   for(int c=1; c<=r; c++)   //columns
		      System.out.print("*");
		   System.out.println();
		}
	}
}