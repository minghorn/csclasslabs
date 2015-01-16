//© A+ Computer Science
// www.apluscompsci.com

//List of references example 1

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

class Dog
{
	private int age;
	private String name;
	
	public Dog( String n, int a )
	{
		age = a;
		name = n;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "Dog - " + name + " " + age;
	}
}

public class ListOne
{
	//make a method to find the oldest Dog
	//this method should return a reference
	
	
	public static void main(String args[])
	{
		List<Dog> ray;
		ray = new ArrayList<Dog>();
		
		ray.add( new Dog( "fred", 11) );
		ray.add( new Dog( "ann", 21) );
		
		//add more Dogs to the list
		
		System.out.println( ray );
		
		//write a for each loop to print out all of the Dogs
		
		//call the method to find the oldest Dog
		//print the oldest Dog
		
	}
}