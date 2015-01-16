//© A+ Computer Science
// www.apluscompsci.com

//Recursion example 1 

import static java.lang.System.*;

public class RecursionOne
{
   public void run(int x )
   {
   	out.println(x);
      run(x+1);
   }

   public static void main(String args[]  )
   {
      RecursionOne test = new RecursionOne();
      test.run(1);
   }
}


