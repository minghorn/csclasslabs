//© A+ Computer Science  -  www.apluscompsci.com

//short circuit example 2

import static java.lang.System.*;

public class ShortTwo
{
	public static void main(String args[])
	{
		int total=9, num=13;
		if(total<4 || ++num<15)
		{
		   out.println("short");
		}
		out.println(num);
	}
}