//© A+ Computer Science
// www.apluscompsci.com

//List of references - DogRunner

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class DoggiesRunner_SOL
{
	//make a method to find the oldest Dog
	//this method should return a reference
	//to the Dog taht is the oldest
	
	public static Dog findOldest( List<Dog> list )
	{
		Dog oldest = null;
		int maxAge = Integer.MIN_VALUE;
		for( Dog item : list )
		{
			if( item.getAge() > maxAge )
			{
				maxAge = item.getAge();
				oldest = item;
			}
		}
		return oldest;
	}
	
	
	public static void main(String args[])
	{
		List<Dog> ray;
		ray = new ArrayList<Dog>();
		
		ray.add( new Dog( "fred", 11) );
		ray.add( new Dog( "ann", 21) );
		ray.add( new Dog( "bob", 111) );
		ray.add( new Dog( "sally", 1) );
		
		//add more Dogs to the list
		
		System.out.println( ray );
		
		//write a for each loop to print out all of the Dogs
		for( Dog item : ray )
		{
			System.out.println( item );
		}
		
		
		//call the method to find the oldest Dog
		//print the oldest Dog
		
		System.out.println( "oldest dog == " + findOldest( ray ) );
		
	}
}