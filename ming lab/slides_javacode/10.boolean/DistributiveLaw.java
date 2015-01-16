//© A+ Computer Science  -  www.apluscompsci.com

//Boolean algebra law of disbribution

import static java.lang.System.*;

public class DistributiveLaw
{
	public static void main(String args[])
	{
		System.out.println("DISTRIBUTIVE LAW - UIL and AP!\n");

		boolean c=true,s=true,i=false,ans;
		ans=((c||(s&&i))==((c||s)&&(c||i)));
		System.out.println("((c||(s&&i))==((c||s)&&(c||i))) = " + ans);
	}
}