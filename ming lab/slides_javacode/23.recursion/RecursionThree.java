//© A+ Computer Science
// www.apluscompsci.com

//Recursion example 3 

import static java.lang.System.*;

public class RecursionThree
{
   public void run(int x )
   {
      if(x<10)
         run(x+1);
      out.println(x);
   }
   public static void main(String args[]  )
   {
      RecursionThree test = new RecursionThree();
      test.run(1);
   }
}

