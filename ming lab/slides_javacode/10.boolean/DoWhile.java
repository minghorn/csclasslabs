//© A+ Computer Science  -  www.apluscompsci.com

//do while example program

import java.util.Scanner;

public class DoWhile
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		int magicNumber;
		do{
		     System.out.print( "Enter the magic number 50-100 :: " );
		     magicNumber = kb.nextInt();
		}while(magicNumber<50 || magicNumber>100);
	}
}