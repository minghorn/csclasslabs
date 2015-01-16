//© A+ Computer Science  -  www.apluscompsci.com

//ArrayList remove() example

import java.util.ArrayList;
import static java.lang.System.*;

public class RemoveAll_Sol
{
	public static void main(String args[])
	{
		ArrayList<String> ray;
		ray = new ArrayList<String>();

		ray.add("all");
		ray.add("all");
		ray.add("fun");
		ray.add("dog");
		ray.add("bat");
		ray.add("cat");
		ray.add("all");
		ray.add("dog");
		ray.add("all");
		ray.add("all");
		
		out.println(ray);
		out.println(ray.size());

		//add in a loop to remove all occurrences of all
		int spot = ray.size() - 1;
		while( spot >= 0 )
		{
			if( ray.get(spot).equals( "all" ) )
				ray.remove( spot );
    	spot = spot - 1;
		}
		out.println(ray);

	}
}