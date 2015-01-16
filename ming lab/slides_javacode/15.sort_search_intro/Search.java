//© A+ Computer Science
// www.apluscompsci.com

//array search example

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Search
{
   public static void main(String args[])
	{
		int nums[] = {45,7,34,66,11};
		Arrays.sort(nums);
		for(int spot=0; spot<nums.length; spot++)
		   out.println(nums[spot]);

		out.println(Arrays.binarySearch(nums, 34));
		out.println(Arrays.binarySearch(nums, 9));
	}
}