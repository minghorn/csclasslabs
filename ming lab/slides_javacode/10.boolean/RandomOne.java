//© A+ Computer Science  -  www.apluscompsci.com

//random example

import java.lang.Math;
import java.util.Random;

public class RandomOne
{
	public static void main ( String[] args )
	{
		double decOne;
		int intOne;

		//Math.random()
		System.out.println("Math.random()");	
		decOne = Math.random() * 10;
		intOne = (int)Math.random() * 10;  		//this line needs help
		System.out.println(decOne);
		System.out.println(intOne);   				//why does it always output 0?

		//Random class
		System.out.println("\n\nRandom Class");
		Random rand = new Random();
		intOne = rand.nextInt(10);				//0-9
		System.out.println(intOne);
		intOne = rand.nextInt(50)+1;		//1-50			
		System.out.println(intOne);
		intOne = rand.nextInt(20)+20;		//20-39
		System.out.println(intOne);
	}
}