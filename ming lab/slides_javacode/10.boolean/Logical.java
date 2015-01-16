//© A+ Computer Science  -  www.apluscompsci.com

//logical operator example

public class Logical
{
	public static void main(String args[])
	{
		int one=60;
		int two=50;

		if(one>50||two>50)
		{
		   System.out.println("first");
		}
		
		if(one>50&&two>50)
		{
		   System.out.println("second");
		}		
		
		if(one>50^two>50)
		{
		   System.out.println("third");
		}
	}
}
