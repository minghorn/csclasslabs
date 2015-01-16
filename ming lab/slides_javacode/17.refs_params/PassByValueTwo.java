//© A+ Computer Science
// www.apluscompsci.com

//pass by value example 2

import static java.lang.System.*;
import java.util.Arrays;

public class PassByValueTwo
{
	public static void changeOne(int[] ray)
	{
		ray[0] = 11;
		ray[1] = 12;
		ray[2] = 13;
	}

	public static void changeTwo(int spot)
	{
		spot = 1000;  //change spot to 1000
	}

	public static void changeThree(int[] ray)
	{
		ray = new int[10];
		ray[2]=22;
		out.println(Arrays.toString(ray));		
	}

	public static void main(String args[])
	{
		int ray[] = {5,4,3,2,1};

		out.println("calling changeOne\n");		
		out.println(Arrays.toString(ray));
		changeOne(ray);
		out.println(Arrays.toString(ray));

		out.println("\n\ncalling changeTwo\n");	
		out.println(Arrays.toString(ray));
		changeTwo(ray[3]);
		out.println(Arrays.toString(ray));

		out.println("\n\ncalling changeThree\n");			
		out.println(Arrays.toString(ray));
		changeThree(ray);
		out.println(Arrays.toString(ray));
	}
}