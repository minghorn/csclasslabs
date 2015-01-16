//© A+ Computer Science
// www.apluscompsci.com

//binary search example 

import static java.lang.System.*;

public class BinarySearch
{
	public static int binarySearch (int [] s, int v, int b, int t )
	{
	   if(b<=t)
	   {
	      int m = (b + t) / 2;
	      if (s[m] == v)
	          return m;
	      if (s[m] > v)
	            return binarySearch(s, v, b, m-1);
	      return binarySearch(s, v, m+1, t);
	   }
	   return -1;
	}
}