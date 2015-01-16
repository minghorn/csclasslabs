//© A+ Computer Science
// www.apluscompsci.com

//array of references herd runner

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class HerdRunner
{
	public static void main ( String[] args )
	{
		Herd bunch = new Herd(5);
		bunch.add(3);
		bunch.add(5);
		bunch.add(6);
		System.out.println(bunch);		
  }
}