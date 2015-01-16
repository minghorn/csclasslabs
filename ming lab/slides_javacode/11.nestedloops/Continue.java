//© A+ Computer Science
// www.apluscompsci.com

//continue example

public class Continue
{
   public static void main(String args[])
   {
		int cnt=0;
		for(int run=1; run<=20; run++)
		{
		     if(run%3==0)
		        continue;
		     cnt++;
		}
		System.out.println(cnt);
	}
}
